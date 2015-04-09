package vn.fimnet;
import java.util.Scanner;
import java.util.GregorianCalendar;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

import java.lang.reflect.Method;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import com.verimatrix.omi.AdminMgmtService;
import com.verimatrix.omi.ConfigurationMgmtService;
import com.verimatrix.omi.DeviceMgmtService;
import com.verimatrix.omi.ContentMgmtService;
import com.verimatrix.omi.EntitlementMgmtService;
import com.verimatrix.omi.DomainMgmt;
import com.verimatrix.omi.AdminMgmt;
import com.verimatrix.omi.ConfigurationMgmt;
import com.verimatrix.omi.DeviceMgmt;
import com.verimatrix.omi.ContentMgmt;
import com.verimatrix.omi.EntitlementMgmt;
import com.verimatrix.schemas.omitypes.UserLoginAttributes;
import com.verimatrix.schemas.omitypes.Result;
import com.verimatrix.schemas.omitypes.SessionHandle;
import com.verimatrix.schemas.omitypes.NetworkListResult;
import com.verimatrix.schemas.omitypes.Network;
import com.verimatrix.schemas.omitypes.NetworkDeviceListQuery;
import com.verimatrix.schemas.omitypes.DeviceListResult;
import com.verimatrix.schemas.omitypes.Device;
import com.verimatrix.schemas.omitypes.DeviceList;
import com.verimatrix.schemas.omitypes.DeviceType;
import com.verimatrix.schemas.omitypes.ResultList;
import com.verimatrix.schemas.omitypes.ContentList;
import com.verimatrix.schemas.omitypes.Content;
import com.verimatrix.schemas.omitypes.ContentType;
import com.verimatrix.schemas.omitypes.NetworkContent;
import com.verimatrix.schemas.omitypes.ContentListResult;
import com.verimatrix.schemas.omitypes.ContentListQuery;
import com.verimatrix.schemas.omitypes.Event;
import com.verimatrix.schemas.omitypes.EventList;
import com.verimatrix.schemas.omitypes.ContentEventQuery;
import com.verimatrix.schemas.omitypes.ContentEventResult;
import com.verimatrix.schemas.omitypes.TimePeriodRule;
import com.verimatrix.schemas.omitypes.Package;
import com.verimatrix.schemas.omitypes.PackageList;
import com.verimatrix.schemas.omitypes.PackageListQuery;
import com.verimatrix.schemas.omitypes.PackageListResult;
import com.verimatrix.schemas.omitypes.EntitlementList;
import com.verimatrix.schemas.omitypes.Entitlement;
import com.verimatrix.schemas.omitypes.EntitledEntity;
import com.verimatrix.schemas.omitypes.EntityType;
import com.verimatrix.schemas.omitypes.DeviceEntitlementResult;
import com.verimatrix.schemas.omitypes.DeviceEntitlementQuery;
import com.verimatrix.schemas.omitypes.Domain;
import com.verimatrix.schemas.omitypes.DomainList;
import com.verimatrix.schemas.omitypes.DomainListQuery;
import com.verimatrix.schemas.omitypes.DomainListResult;
import com.verimatrix.schemas.omitypes.DomainDeviceListQuery;
import com.verimatrix.schemas.omitypes.DomainDeviceListResult;

import javax.xml.ws.Holder;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.security.cert.X509Certificate;
import java.security.NoSuchAlgorithmException;
import java.security.KeyManagementException;

public abstract class OMIClient {
    protected static String mSessionHandle;

    protected abstract String loadSession();
    protected abstract void saveSession();

    protected abstract void feedback(String ... strings);
    protected abstract void feedback(String fStr, StringBuilder sb);

    protected FormatIntf formatter;
    protected void setFormatter(FormatIntf f) {
        formatter = f;
    }

    private void disableSslVerification() {
        try {
            // Create a trust manager that does not validate certificate chains
            TrustManager[] trustAllCerts = new TrustManager[] {new X509TrustManager() {
                    public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                        return null;
                    }
                    public void checkClientTrusted(X509Certificate[] certs, String authType) {
                    }
                    public void checkServerTrusted(X509Certificate[] certs, String authType) {
                    }
                }
            };

            // Install the all-trusting trust manager
            SSLContext sc = SSLContext.getInstance("SSL");
            sc.init(null, trustAllCerts, new java.security.SecureRandom());
            HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());

            // Create all-trusting host name verifier
            HostnameVerifier allHostsValid = new HostnameVerifier() {
                public boolean verify(String hostname, SSLSession session) {
                    return true;
                }
            };

            // Install the all-trusting host verifier
            HttpsURLConnection.setDefaultHostnameVerifier(allHostsValid);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (KeyManagementException e) {
            e.printStackTrace();
        }
    }
    private <T> T newPort(String className) throws Exception {
        Class <?> sClass = Class.forName("com.verimatrix.omi." + className + "Service");
        Object obj = sClass.newInstance();
        Method method = sClass.getMethod("get" + className, new Class[]{});
        return (T) method.invoke(obj);
    }

    private Result newFailureResult(String reason) {
        Result res = new Result();
        res.setResultId(this.getClass().getName());
        res.setResultCode(-7);
        res.setResultText(reason);
        return res;
    }
    private void failure(String function, String reason) throws Exception {
        Result res = newFailureResult(reason);
        StringBuilder sb = new StringBuilder();
        formatter.format( sb, res );
        feedback(function, sb);
    }
    private SessionHandle newSessionHandle() {
        SessionHandle sHandle = new SessionHandle();
        sHandle.setHandle(mSessionHandle);
        return sHandle;
    }

// Admin Management interface
    public void admSignOn(String uName, String pword) throws Exception {
        AdminMgmt port = newPort("AdminMgmt");

        UserLoginAttributes attrs = new UserLoginAttributes();
        Holder<SessionHandle> sessionHandle = new Holder<SessionHandle>();
        Holder<Result> result = new Holder<Result>();
        attrs.setUserName(uName);
        attrs.setPassword(pword);

        port.signOn(attrs, sessionHandle, result);

        StringBuilder sb = new StringBuilder();
        
        if( result.value.getResultCode() == 0 ) {
            mSessionHandle = sessionHandle.value.getHandle();
            saveSession();
        }

        formatter.format(sb, result.value);
        feedback("admSignOn", sb);
    }
    public void admSignOff() throws Exception {
        if( !isSignOn() ) return;

        AdminMgmt port = newPort("AdminMgmt");
        SessionHandle sHandle = newSessionHandle();

        Result r = port.signOff(sHandle);
        StringBuilder sb = new StringBuilder();

        if( r.getResultCode() == 0 ) {
            mSessionHandle = "";
            saveSession();
        }

        formatter.format(sb, r);
        feedback("admSignOff", sb);
    }
// Network Management interface
    public void confListNetworks() throws Exception {
        if( !isSignOn() ) {
            failure("confListNetworks", "Not sign on. Sign on first!");
            return;
        }
        ConfigurationMgmt port = newPort("ConfigurationMgmt");
        SessionHandle sHandle = newSessionHandle();

        NetworkListResult nwlstRes = port.getNetworkList(sHandle);

        StringBuilder sb = new StringBuilder();
        if( nwlstRes.getResult().getResultCode() == 0 ) {
            formatter.format(sb, nwlstRes);
        }
        else {
            mSessionHandle = "";
            saveSession();
            formatter.format(sb, nwlstRes.getResult());
        }
        feedback("confListNetworks", sb);
    }
    public class __Result {
        String lastId;
        int count;
        public __Result(int c, String ldi) {
            count = c;
            lastId = ldi;
        }
        public String getLastId() { return lastId; }
        public int getCount() { return count; }
    }
    public __Result listNDevices(String networkID, String lastDeviceID, int count ) throws Exception {
        ConfigurationMgmt port = newPort("ConfigurationMgmt");
        SessionHandle sHandle = newSessionHandle();

        NetworkDeviceListQuery query = new NetworkDeviceListQuery();
        query.setSmsNetworkId(networkID);
        query.setSmsDeviceId(lastDeviceID);
        query.setDeviceCount(count);
        DeviceListResult res = port.getNetworkDeviceList(query, sHandle);

        StringBuilder sb = new StringBuilder();
        formatter.format(sb, res);
        feedback("listNDevices", sb);

        if ( res.getResult().getResultCode() == 0 ) {
            int c = res.getDevices().size();
            String ldi = "";
            if( c > 0 ) ldi = res.getDevices().get(c - 1).getSmsDeviceId();
            return new __Result(c, ldi) ;
        }
        return null;
    }
    public __Result matchNDevices(String networkID, String deviceIdPrefix, String lastId, int count ) throws Exception {
        ConfigurationMgmt port = newPort("ConfigurationMgmt");
        SessionHandle sHandle = newSessionHandle();

        NetworkDeviceListQuery query = new NetworkDeviceListQuery();
        query.setSmsNetworkId(networkID);
        if( deviceIdPrefix == null ) deviceIdPrefix = "";
        if( lastId == null ) lastId = "";
        query.setSmsDeviceId(lastId);
        query.setDeviceCount(count);
        DeviceListResult res = port.getNetworkDeviceList(query, sHandle);

        // Filter result
        HashSet<Device> matchedSet = new HashSet<Device>();
        for( Device d: res.getDevices() ) {
            if ( d.getSmsDeviceId().startsWith(deviceIdPrefix) ) {
                matchedSet.add(d);
            }
        }
        res.getDevices().retainAll(matchedSet);

        StringBuilder sb = new StringBuilder();
        formatter.format(sb, res);
        feedback("matchNDevices", sb);

        if ( res.getResult().getResultCode() == 0 ) {
            int c = res.getDevices().size();
            String ldi = "";
            if( c > 0 ) ldi = res.getDevices().get(c - 1).getSmsDeviceId();
            return new __Result(c, ldi) ;
        }
        return null;
    }
    public void confListDevices(String networkID) throws Exception {
        confListDevices(networkID, "");
    }

    public void confListDevices(String networkID, String lastDeviceID) throws Exception {
        if( networkID == null ) {
            failure("confListDevices", "Enter network id!");
            return;
        }
        
        if( !isSignOn() ) {
            failure("confListDevices", "Not sign on. Sign on first!");
            return;
        }
        
        int count = Constants.ITEMS_PER_PAGE;
        int c = 0;
        do {
            formatter.reset();
            __Result _r = listNDevices(networkID, lastDeviceID, count);
            if (_r == null) break;
            lastDeviceID = _r.getLastId();
            c = _r.getCount();
            System.out.println("PRESS ENTER KEY ... ");
            Scanner sc = new Scanner(System.in);
            sc.nextLine();
        }
        while ( c >= count );
    }
// Device Management Interface
    public void devAddDevice(String networkID, String deviceID, String devType, String hardwareID) throws Exception {
        if( !isSignOn() ) {
            failure("devAddDevice","Not sign on. Sign on first!");
            return;
        }
        DeviceMgmt port = newPort("DeviceMgmt");
        SessionHandle sHandle = newSessionHandle();

        DeviceList dList = new DeviceList();
        Device dev = new Device();
        dev.setSmsDeviceId(deviceID);
        dev.setSmsNetworkId(networkID);
        dev.setDeviceType(DeviceType.fromValue(devType));
        dev.setNetworkDeviceId(hardwareID);
        dList.getDevices().add(dev);
        ResultList reslist = port.addDevices(dList, sHandle);

        StringBuilder sb = new StringBuilder();
        formatter.format(sb, reslist.getResult());
        feedback("devAddDevice", sb);
    }
    public void devRemoveDevice(String networkID, String deviceID, String devType, String hardwareID ) throws Exception {
        if( !isSignOn() ) {
            failure("devRemoveDevice", "Not sign on. Sign on first!");
            return;
        }
        DeviceMgmt port = newPort("DeviceMgmt");
        SessionHandle sHandle = newSessionHandle();

        DeviceList dList = new DeviceList();
        Device dev = new Device();
        dev.setSmsDeviceId(deviceID);
        dev.setSmsNetworkId(networkID);
        dev.setDeviceType(DeviceType.fromValue(devType));
        dev.setNetworkDeviceId(hardwareID);
        dList.getDevices().add(dev);
        ResultList reslist = port.removeDevices(dList, sHandle);

        StringBuilder sb = new StringBuilder();
        formatter.format(sb, reslist.getResult());
        feedback("devRemoveDevice", sb);
    }
// Domain Management Interface
    private Domain newDomain(String domainId, int count) throws Exception {
        Domain domain = new Domain();
        domain.setSmsDomainId(domainId);
        domain.setMaxDevices(count);
        domain.setTimePeriodRule(new TimePeriodRule());
        return domain;
    }
    public void addDomain(String domainId) throws Exception {
        DomainMgmt port = newPort("DomainMgmt");
        SessionHandle sHandle = newSessionHandle();
        Domain domain = newDomain(domainId, Constants.DEVICES_PER_USER);
        DomainList domainList = new DomainList();
        domainList.getDomains().add(domain);
        
        ResultList resList = port.addDomains(domainList, sHandle);
        
        StringBuilder sb = new StringBuilder();
        formatter.format(sb, resList.getResult());
        feedback("addDomain", sb);
    }
    public void removeDomain(String domainId) throws Exception {
        DomainMgmt port = newPort("DomainMgmt");
        SessionHandle sHandle = newSessionHandle();
        Domain domain = newDomain(domainId, Constants.DEVICES_PER_USER);
        DomainList domainList = new DomainList();
        domainList.getDomains().add(domain);
        
        ResultList resList = port.removeDomains(domainList, sHandle);
        
        StringBuilder sb = new StringBuilder();
        formatter.format(sb, resList.getResult());
        feedback("removeDomain", sb);
    }
    public void listDomains(String domainId, int count) throws Exception {
        DomainMgmt port = newPort("DomainMgmt");
        SessionHandle sHandle = newSessionHandle();

        DomainListQuery dlQuery = new DomainListQuery();
        dlQuery.setDomainCount(count);        

        DomainListResult dlRes = port.getDomainList(dlQuery, sHandle);
        
        StringBuilder sb = new StringBuilder();
        formatter.format(sb, dlRes);
    }
    public __Result listDevicesInDomain(String domainId, String lastId, int count) throws Exception {
        DomainMgmt port = newPort("DomainMgmt");
        SessionHandle sHandle = newSessionHandle();

        DomainDeviceListQuery ddlQuery = new DomainDeviceListQuery();
        ddlQuery.setSmsDomainId(domainId);
        ddlQuery.setSmsDeviceId(lastId);
        ddlQuery.setDeviceCount(count);

        DomainDeviceListResult ddlRes = port.getDomainDeviceList(ddlQuery, sHandle);

        StringBuilder sb = new StringBuilder();
        formatter.format(sb, ddlRes);

        return null;
    }
// Content Management Interface
    public boolean addVoD(String contentID, String desc, String tag, boolean flag) throws Exception {
        if( !isSignOn() ) {
            failure("addVoD", "Not sign on. Sign on first!");
            return false;
        }
        ContentMgmt port = newPort("ContentMgmt");
        SessionHandle sHandle = newSessionHandle();

        ContentList cList = new ContentList();
        Content content = new Content();
        content.setSmsContentId(contentID);
        content.setDescription(desc);
        content.setTag(tag);
        cList.getContent().add(content);

        ResultList resList = port.addContent(cList, sHandle);

        if (flag) {
            StringBuilder sb = new StringBuilder();
            formatter.format(sb, resList.getResult());
            feedback("addVoD", sb);
            return true;
        }
        if( resList.getResult().get(0).getResultCode() == 0) return true;

        StringBuilder sb = new StringBuilder();
        formatter.format(sb, resList.getResult());
        feedback("addVoD", sb);
        return false;
    }
    private void removeVoD(String contentId) throws Exception {
        if( !isSignOn() ) {
            failure("removeVoD", "Not sign on. Sign on first!");
            return;
        }
        ContentMgmt port = newPort("ContentMgmt");
        SessionHandle sHandle = newSessionHandle();

        ContentList cList = new ContentList();
        Content content = new Content();
        content.setSmsContentId(contentId);
        cList.getContent().add(content);
        ResultList resList = port.removeContent(cList, sHandle);

        StringBuilder sb = new StringBuilder();
        formatter.format(sb, resList.getResult());
        feedback("removeVoD", sb);
    }

    public boolean addVoDToNetwork(String networkId, String contentId, String resourceId, boolean flag) throws Exception 
    {
        if( !isSignOn() ) {
            failure("addVoDToNetwork", "Not sign on. Sign on first!");
            return false;
        }
        ContentMgmt port = newPort("ContentMgmt");
        SessionHandle sHandle = newSessionHandle();

        NetworkContent nContent = new NetworkContent();
        nContent.setSmsNetworkId(networkId);
        nContent.setSmsContentId(contentId);
        nContent.setNetworkContentId(resourceId);
        nContent.setNetworkContentType(ContentType.fromValue("VOD"));
        
        Result res = port.addContentToNetwork(nContent, sHandle);

        if( flag ) {
            StringBuilder sb = new StringBuilder();
            formatter.format(sb, res);
            feedback("addVoDToNetwork:", sb);
            return true;
        }
        if( res.getResultCode() == 0 ) return true;
        StringBuilder sb = new StringBuilder();
        formatter.format(sb, res);
        feedback("addVoDToNetwork:", sb);
        return false;
    }
    private boolean removeVoDFromNetwork(String networkId, String contentId, boolean flag) throws Exception {
        if( !isSignOn() ) {
            failure("removeVoDFromNetwork", "Not sign on. Sign on first!");
            return false;
        }
        ContentMgmt port = newPort("ContentMgmt");
        SessionHandle sHandle = newSessionHandle();

        NetworkContent nContent = new NetworkContent();
        nContent.setSmsNetworkId(networkId);
        nContent.setSmsContentId(contentId);
        nContent.setNetworkContentType(ContentType.fromValue("VOD"));
        Result res = port.removeContentFromNetwork(nContent, sHandle);
        if( flag ) {
            StringBuilder sb = new StringBuilder();
            formatter.format(sb, res);
            feedback("removeVoDFromNetwork:", sb);
            return true;
        }
        if( res.getResultCode() == 0 ) return true;
        StringBuilder sb = new StringBuilder();
        formatter.format(sb, res);
        feedback("removeVoDFromNetwork:", sb);
        return false;
    }
    public void contListContent() throws Exception {
        contListContent("");
    }
    public void contListContent(String lastContentId) throws Exception {
        if (lastContentId == null) lastContentId = "";
        int count = Constants.ITEMS_PER_PAGE;
        int c = 0;
        do {
            __Result _r = contListContent(lastContentId, count);
            if (_r == null) break;
            lastContentId = _r.getLastId();
            c = _r.getCount();
            System.out.println("PRESS ENTER KEY ... ");
            Scanner sc = new Scanner(System.in);
            sc.nextLine();
        }
        while ( c >= count );
    }
    public __Result contMatchContent(String contentIdPrefix, String lastId, int count) throws Exception {
        if( !isSignOn() ) {
            failure("contMatchContent", "Not sign on. Sign on first!");
            return null;
        }
        ContentMgmt port = newPort("ContentMgmt");
        SessionHandle sHandle = newSessionHandle();

        ContentListQuery clQuery = new ContentListQuery();
        if(contentIdPrefix == null) contentIdPrefix = "";
        if(lastId == null) lastId = "";
        clQuery.setSmsContentId(lastId);
        clQuery.setContentCount(count);
        ContentListResult clres = port.getContentList(clQuery, sHandle);
        // Filter results
        HashSet<Content> matchedSet = new HashSet<Content>();
        for (Content c: clres.getContent() ) {
            if(c.getSmsContentId().startsWith(contentIdPrefix)) {
                matchedSet.add(c);
            }
        }
        clres.getContent().retainAll(matchedSet);

        StringBuilder sb = new StringBuilder();
        formatter.format(sb, clres);
        feedback("contMatchContent", sb);

        if ( clres.getResult().getResultCode() == 0 ) {
            int size = clres.getContent().size();
            String lci = null;
            if( size > 0 ) lci = clres.getContent().get(size - 1).getSmsContentId();
            return new __Result(clres.getContent().size(), lci) ;
        }
        return null;
    }
    public __Result contListContent(String contentId, int count) throws Exception {
        if( !isSignOn() ) {
            failure("contListContent", "Not sign on. Sign on first!");
            return null;
        }
        ContentMgmt port = newPort("ContentMgmt");
        SessionHandle sHandle = newSessionHandle();

        ContentListQuery clQuery = new ContentListQuery();
        clQuery.setSmsContentId(contentId);
        clQuery.setContentCount(count);
        ContentListResult clres = port.getContentList(clQuery, sHandle);
        StringBuilder sb = new StringBuilder();
        //formatter.format(sb, clres.getResult(), clres.getContent());
        formatter.format(sb, clres);
        feedback("contListContent", sb);

        if ( clres.getResult().getResultCode() == 0 ) {
            int size = clres.getContent().size();
            String lci = null;
            if( size > 0 ) lci = clres.getContent().get(size - 1).getSmsContentId();
            return new __Result(clres.getContent().size(), lci) ;
        }
        return null;
    }
    public boolean contAddEvent(String networkId, String eventId, String contentId, boolean flag) throws Exception {
        if( !isSignOn() ) {
            failure("contAddEvent", "Not sign on. Sign on first!");
            return false;
        }
        ContentMgmt port = newPort("ContentMgmt");
        SessionHandle sHandle = newSessionHandle();

        EventList eventList = new EventList();
        Event e = new Event();
        e.setSmsEventId(eventId);
        e.setSmsContentId(contentId);
        e.setSmsNetworkId(networkId);
        e.setExclusive(false);
        e.setTimePeriodRule(new TimePeriodRule());
        eventList.getEvents().add(e);

        ResultList resList = port.addEvents(eventList, sHandle);
        
        if (flag) {
            StringBuilder sb = new StringBuilder();
            formatter.format(sb, resList.getResult());
            feedback("contAddEvent", sb);
            return true;
        }
        
        if (resList.getResult().get(0).getResultCode() == 0) return true;

        StringBuilder sb = new StringBuilder();
        formatter.format(sb, resList.getResult());
        feedback("contAddEvent", sb);
        return false;
    }

    public boolean contRemoveEvent(String networkId, String eventId, String contentId, boolean flag) throws Exception {
        if( !isSignOn() ) {
            failure("contRemoveEvent", "Not sign on. Sign on first!");
            return false;
        }
        ContentMgmt port = newPort("ContentMgmt");
        SessionHandle sHandle = newSessionHandle();

        EventList eventList = new EventList();
        Event e = new Event();
        e.setSmsEventId(eventId);
        e.setSmsContentId(contentId);
        e.setSmsNetworkId(networkId);
        e.setExclusive(false);
        e.setTimePeriodRule(new TimePeriodRule());
        eventList.getEvents().add(e);
        ResultList resList = port.removeEvents(eventList, sHandle);
        if(flag) {
            StringBuilder sb = new StringBuilder();
            formatter.format(sb, resList.getResult());
            feedback("contRemoveEvent", sb);
            return true;
        }

        if (resList.getResult().get(0).getResultCode() == 0 ) return true;

        StringBuilder sb = new StringBuilder();
        formatter.format(sb, resList.getResult());
        feedback("contRemoveEvent", sb);
        return false;
    }
    public void contListContentEvents(String contentId) throws Exception {
        contListContentEvents(contentId, "");
    }
    public void contListContentEvents(String contentId, String lastEventId) throws Exception {
        if (lastEventId == null) lastEventId = "";
        if( !isSignOn() ) {
            failure("contListContentEvents", "Not sign on. Sign on first!");
            return;
        }
        int count = Constants.ITEMS_PER_PAGE;
        int c = 0;
        do {
            __Result _r = contListContentEvents(contentId, lastEventId, count);
            if (_r == null) break;
            lastEventId = _r.getLastId();
            c = _r.getCount();
            System.out.println("PRESS ENTER KEY ... ");
            Scanner sc = new Scanner(System.in);
            sc.nextLine();
        }
        while ( c >= count );
    }
    public __Result contListContentEvents(String contentId, String eventId, int count) throws Exception {
        ContentMgmt port = newPort("ContentMgmt");
        SessionHandle sHandle = newSessionHandle();

        ContentEventQuery elQuery = new ContentEventQuery();
        elQuery.setSmsContentId(contentId);
        elQuery.setSmsEventId(eventId);
        elQuery.setEventCount(count);
        ContentEventResult elres = port.getContentEvents(elQuery, sHandle);

        StringBuilder sb = new StringBuilder();
        formatter.format(sb, elres);
        feedback("contListContentEvents", sb);

        if ( elres.getResult().getResultCode() == 0 ) {
            int size = elres.getEvents().size();
            String lei = null;
            if( size > 0 ) lei = elres.getEvents().get(size - 1).getSmsEventId();
            return new __Result(elres.getEvents().size(), lei) ;
        }
        return null;
    }
    private String getPremiumPackageName(String contentId) {
        return "premium-" + contentId;
    }

    public void contAddVoD(String networkId, String contentId, String desc, String resourceId, String packageId) throws Exception {
        if (!addVoD(contentId, desc, "", false)) return ;
        if (!addVoDToNetwork(networkId, contentId, resourceId, false)) return;
        if (!contAddEvent(networkId, contentId + "-" + resourceId, contentId, false)) return;
        addEventToPackage(networkId, contentId, resourceId, packageId);
    }

    public void contAddPremiumVoD(String networkId, String contentId, String desc, String resourceId ) throws Exception {
        if( !entAddPackage(getPremiumPackageName(contentId), "premium package for content") ) return;
        contAddVoD(networkId, contentId, desc, resourceId, getPremiumPackageName(contentId));
    }

    public void contRemoveVoD(String networkId, String contentId, String resourceId) throws Exception {
        if (!contRemoveEvent(networkId, contentId + "-" + resourceId, contentId, false)) return;
        if (!removeVoDFromNetwork(networkId, contentId, false)) return;
        removeVoD(contentId);
    }

    public void contRemovePremiumVoD(String networkId, String contentId, String resourceId) throws Exception {
        contRemoveVoD(networkId, contentId, resourceId);
        entRemovePackage(getPremiumPackageName(contentId));
    }
    public boolean entAddPackage(String packageId, String desc) throws Exception {
        EntitlementMgmt port = newPort("EntitlementMgmt");
        SessionHandle sHandle = newSessionHandle();

        PackageList pkgList = new PackageList();
        Package pkg = new Package();
        pkg.setSmsPackageId(packageId);
        pkg.setDescription(desc);
        pkgList.getPackages().add(pkg);
        ResultList resList = port.addPackages(pkgList, sHandle);
        StringBuilder sb = new StringBuilder();
        formatter.format(sb, resList.getResult());
        feedback("entAddPackage", sb);
        if (resList.getResult().get(0).getResultCode() == 0) return true;
        return false;
    }
    public void entRemovePackage(String packageId) throws Exception {
        EntitlementMgmt port = newPort("EntitlementMgmt");
        SessionHandle sHandle = newSessionHandle();

        PackageList pkgList = new PackageList();
        Package pkg = new Package();
        pkg.setSmsPackageId(packageId);
        pkgList.getPackages().add(pkg);
        ResultList resList = port.removePackages(pkgList, sHandle);
        StringBuilder sb = new StringBuilder();
        formatter.format(sb, resList.getResult());
        feedback("entRemovePackage", sb);
    }
    public void entListPackages(String lastPackageId) throws Exception {
        if (lastPackageId == null) lastPackageId = "";
        if( !isSignOn() ) {
            failure("entListPackages", "Not sign on. Sign on first!");
            return;
        }
        int count = Constants.ITEMS_PER_PAGE;
        int c = 0;
        do {
            __Result _r = entListPackages(lastPackageId, count);
            if (_r == null) break;
            lastPackageId = _r.getLastId();
            c = _r.getCount();
            System.out.println("PRESS ENTER KEY ... ");
            Scanner sc = new Scanner(System.in);
            sc.nextLine();
        }
        while ( c >= count );
    }
    public __Result entListPackages(String packageId, int count) throws Exception {
        EntitlementMgmt port = newPort("EntitlementMgmt");
        SessionHandle sHandle = newSessionHandle();

        PackageListQuery plQuery = new PackageListQuery();
        plQuery.setSmsPackageId(packageId);
        plQuery.setPackageCount(count);
        PackageListResult plres = port.getPackageList(plQuery, sHandle);

        StringBuilder sb = new StringBuilder();
        formatter.format(sb, plres);
        feedback("entListPackages", sb);
        if ( plres.getResult().getResultCode() == 0 ) {
            String lpi = null;
            int c = plres.getPackages().size();
            if (c > 0) lpi = plres.getPackages().get(c-1).getSmsPackageId();
            return new __Result(c, lpi);
        }
        return null;
    }
    public void entListPackages() throws Exception {
        entListPackages("");
    }
    private void addEventToPackage(String networkId, String contentId, String resourceId, String packageId) throws Exception {
        EntitlementMgmt port = newPort("EntitlementMgmt");
        SessionHandle sHandle = newSessionHandle();
        
        Package pkg = new Package();
        pkg.setSmsPackageId(packageId);
        EventList eventList = new EventList();
        Event event = new Event();
        event.setSmsEventId(contentId + "-" + resourceId);
        event.setSmsContentId(contentId);
        event.setSmsNetworkId(networkId);
        event.setExclusive(false);
        event.setTimePeriodRule(new TimePeriodRule());
        eventList.getEvents().add(event);

        ResultList resList = port.addEventsToPackage(pkg, eventList, sHandle);
        StringBuilder sb = new StringBuilder();
        formatter.format(sb, resList.getResult());
        feedback("addEventToPackage", sb);
    }
    private void removeEventFromPackage(String eventId, String packageId) throws Exception {
        EntitlementMgmt port = newPort("EntitlementMgmt");
        SessionHandle sHandle = newSessionHandle();
        sHandle.setHandle(mSessionHandle);
        
        Package pkg = new Package();
        pkg.setSmsPackageId(packageId);
        EventList eventList = new EventList();
        Event event = new Event();
        event.setSmsEventId(eventId);
        eventList.getEvents().add(event);

        ResultList resList = port.removeEventsFromPackage(pkg, eventList, sHandle);

        StringBuilder sb = new StringBuilder();
        formatter.format(sb, resList.getResult());
        feedback("removeEventFromPackage", sb);
    }
    private TimePeriodRule newTimePeriodRule(int hPeriod) {
        if (hPeriod <= 0) return new TimePeriodRule();
        try {
            TimePeriodRule tRule = new TimePeriodRule();
            DatatypeFactory factory = DatatypeFactory.newInstance();
			
			GregorianCalendar cal = new GregorianCalendar();
			
            XMLGregorianCalendar startTime = factory.newXMLGregorianCalendar(cal);
            cal.add(Calendar.HOUR_OF_DAY, hPeriod);
            XMLGregorianCalendar endTime = factory.newXMLGregorianCalendar(cal);
            tRule.setStartTime(startTime);
            tRule.setEndTime(endTime);
            return tRule;
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    private TimePeriodRule newTimePeriodRule(String endTimeStr) {
        try {
            TimePeriodRule tRule = new TimePeriodRule();
            DatatypeFactory factory = DatatypeFactory.newInstance();
			
			GregorianCalendar cal = new GregorianCalendar();
			
            XMLGregorianCalendar startTime = factory.newXMLGregorianCalendar(cal);
            tRule.setStartTime(startTime);
            
            XMLGregorianCalendar endTime = factory.newXMLGregorianCalendar(endTimeStr);
            GregorianCalendar endCal = endTime.toGregorianCalendar();
            
            if( endCal.compareTo(cal) > 0) {
                tRule.setEndTime(endTime);
                return tRule;
            }
            return null;
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    private void addEntitlement(String entitlementId, String packageId, boolean isDevice, String deviceId, TimePeriodRule tRule) throws Exception {
        EntitlementMgmt port = newPort("EntitlementMgmt");
        SessionHandle sHandle = newSessionHandle();
        
        EntitlementList entitList = new EntitlementList();
        Entitlement entitlement = new Entitlement();
        entitlement.setSmsEntitlementId(entitlementId);

        Package pkg = new Package();
        pkg.setSmsPackageId(packageId);
        entitlement.setPackage(pkg);
        
        EntitledEntity eEntity = new EntitledEntity();
        if( isDevice ) eEntity.setEntityType(EntityType.fromValue("DEVICE"));
        else eEntity.setEntityType(EntityType.fromValue("DOMAIN"));
        eEntity.setEntityId(deviceId);

        entitlement.setEntitledEntity(eEntity);
        entitlement.setTimePeriodRule(tRule);
        entitList.getEntitlements().add(entitlement);
        ResultList resList = port.addEntitlements(entitList, sHandle);
        
        StringBuilder sb = new StringBuilder();
        formatter.format(sb, resList.getResult());
        feedback("addEntitlement", sb);
        
    }
/*
    private void addEntitlement(String entitlementId, String packageId, 
                                boolean isDevice, String deviceId, int hours) throws Exception {
        EntitlementMgmt port = newPort("EntitlementMgmt");
        SessionHandle sHandle = newSessionHandle();
        
        EntitlementList entitList = new EntitlementList();
        Entitlement entitlement = new Entitlement();
        entitlement.setSmsEntitlementId(entitlementId);

        Package pkg = new Package();
        pkg.setSmsPackageId(packageId);
        entitlement.setPackage(pkg);
        
        EntitledEntity eEntity = new EntitledEntity();
        if( isDevice ) eEntity.setEntityType(EntityType.fromValue("DEVICE"));
        else eEntity.setEntityType(EntityType.fromValue("DOMAIN"));
        eEntity.setEntityId(deviceId);

        TimePeriodRule tRule = newTimePeriodRule(hours);
        
        entitlement.setEntitledEntity(eEntity);
        entitlement.setTimePeriodRule(tRule);
        entitList.getEntitlements().add(entitlement);
        ResultList resList = port.addEntitlements(entitList, sHandle);
        
        StringBuilder sb = new StringBuilder();
        formatter.format(sb, resList.getResult());
        feedback("addEntitlement", sb);
    }
*/
    private void removeEntitlement(String entitlementId, String packageId, String deviceId) throws Exception {
        EntitlementMgmt port = newPort("EntitlementMgmt");
        SessionHandle sHandle = newSessionHandle();
        
        EntitlementList entitList = new EntitlementList();
        Entitlement entitlement = new Entitlement();
        entitlement.setSmsEntitlementId(entitlementId);

        Package pkg = new Package();
        pkg.setSmsPackageId(packageId);
        entitlement.setPackage(pkg);
        
        EntitledEntity eEntity = new EntitledEntity();
        eEntity.setEntityType(EntityType.fromValue("DEVICE"));
        //else eEntity.setEntityType(EntityType.fromValue("DOMAIN"));
        eEntity.setEntityId(deviceId);

        TimePeriodRule tRule = new TimePeriodRule();
        
        entitlement.setEntitledEntity(eEntity);
        entitlement.setTimePeriodRule(tRule);

        entitList.getEntitlements().add(entitlement);
        ResultList resList = port.removeEntitlements(entitList, sHandle);

        StringBuilder sb = new StringBuilder();
        formatter.format(sb, resList.getResult());
        feedback("removeEntitlement", sb);
    }
    private void addDomainEntitlement(String entitlementId, 
                                      String packageId, String domainId, int hours) throws Exception 
    {
        TimePeriodRule tRule = newTimePeriodRule(hours);
        addEntitlement(entitlementId, packageId, false, domainId, tRule);
    }
    private void addDomainEntitlement(String entitlementId, 
                                      String packageId, String domainId, String endTime) throws Exception 
    {
        TimePeriodRule tRule = newTimePeriodRule(endTime);
        addEntitlement(entitlementId, packageId, false, domainId, tRule);
    }
    private void addDeviceEntitlement(String entitlementId, 
                                      String packageId, String deviceId, int hours) throws Exception 
    {
        TimePeriodRule tRule = newTimePeriodRule(hours);
        if( tRule == null ) throw new Exception("Wrong period value");
        addEntitlement(entitlementId, packageId, true, deviceId, tRule);
    }
    private void addDeviceEntitlement(String entitlementId, 
                                      String packageId, String deviceId, String endTime) throws Exception 
    {
        TimePeriodRule tRule = newTimePeriodRule(endTime);
        if( tRule == null ) throw new Exception("Wrong endTime value String");
        addEntitlement(entitlementId, packageId, true, deviceId, tRule);
    }
    public void entEntitleDeviceToPackage(String deviceId, String packageId, int hours) throws Exception {
        TimePeriodRule tRule = newTimePeriodRule(hours);
        if( tRule == null ) throw new Exception("Wrong period value");
        addEntitlement(deviceId + "-" + packageId, packageId, true, deviceId, tRule);
    }
    public void entEntitleDeviceToPackage(String deviceId, String packageId, String endTime) throws Exception {
        TimePeriodRule tRule = newTimePeriodRule(endTime);
        if( tRule == null ) throw new Exception("Wrong endTime value");
        addEntitlement(deviceId + "-" + packageId, packageId, true, deviceId, tRule);
    }
    public void entRevokeDeviceFromPackage(String deviceId, String packageId) throws Exception {
        removeEntitlement(deviceId + "-" + packageId, packageId, deviceId);
    }

    public void entListDeviceEntitlements(String deviceId) throws Exception {
        EntitlementMgmt port = newPort("EntitlementMgmt");
        SessionHandle sHandle = newSessionHandle();
        
        DeviceEntitlementQuery deQuery = new DeviceEntitlementQuery();
        deQuery.setSmsDeviceId(deviceId);
        DeviceEntitlementResult deRes = port.getDeviceEntitlements(deQuery, sHandle);
        StringBuilder sb = new StringBuilder();
        formatter.format(sb, deRes);
        feedback("entListDeviceEntitlements", sb);
    }

    private boolean isSignOn() {
        return !(mSessionHandle.equals("") || mSessionHandle == null);
    }
    public OMIClient() {
        disableSslVerification();
        mSessionHandle = loadSession();
    }
}
