package vn.fimnet;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

import org.apache.commons.cli.Options;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.BasicParser;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.MissingArgumentException;

public class CommandLineOMIClient extends OMIClient {
    private static final String sessionFile = "session.txt";
    public CommandLineOMIClient() {
        super();
//        CommandLineFormat formatter = new CommandLineFormat();
        JSONFormat formatter = new JSONFormat();
        setFormatter(formatter);
    }
    protected String loadSession() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(sessionFile));
            return reader.readLine();
        }
        catch (Exception e) {
            return "";
        }
    }
    protected void saveSession() {
        try {
            PrintWriter writer = new PrintWriter(sessionFile);
            writer.println(mSessionHandle);
            writer.flush();
        }
        catch (Exception e) {
        }
    }
    protected void feedback(String fStr, StringBuilder sb) {
        System.out.println(fStr + "::\n" + sb);
    }
    protected void feedback(String ... strings) {
        boolean first = true;
        for( String s: strings ) {
            if( first ) {
                System.out.print(s + "::\n");
                first = false;
            }
            else {
                System.out.print(s + "\n");
            }
        }
    }
    public static void main(String args[]) throws Exception {
        Options options = new Options();
        options.addOption("signon", false, "Sign on with default credential");
        options.addOption("signoff", false, "Sign off");
        options.addOption("list_networks", false, "List network");
        options.addOption("list_devices", true, "List devices ( networkID:deviceID )");
        options.addOption("add_device", true, "Add device ( networkID:deviceID:deviceType:hardwareID )");
        options.addOption("remove_device", true, "Remove device ( networkID:deviceID:deviceType:hardwareID )");
        options.addOption("add_vod", true, "Add vod content (networkID:contentID:Description:resourceId:packageId)");
        options.addOption("remove_vod", true, "Remove vod content (networkId:contentId:resourceId)");
        options.addOption("list_content", false, "List content (contentId (optional)");
        options.addOption("add_event", true, "Add event(networkId:eventId:contentId)");
        options.addOption("remove_event", true, "Remove event (eventId)");
        options.addOption("list_events", true, "List events (contentId)");
        options.addOption("add_vod_to_network", true, "Add content to network (networkId:contentId:resourceId)");
        options.addOption("add_package", true, "Add package (packageId:description)");
        options.addOption("remove_package", true, "Remove package (packageId)");
        options.addOption("list_packages", false, "list existing packages");
        options.addOption("entitle_device", true, "Entitle device to package (deviceId:packageId:period(hour))");
        options.addOption("revoke_device", true, "Revoke device from package (deviceId:packageId)");
        options.addOption("list_entitlements", true, "List device entitlements (deviceId)");
        options.addOption("h", "help", false, "Show help");
        try {
            CommandLineParser parser = new BasicParser();
            CommandLine cmd = parser.parse(options, args);
            CommandLineOMIClient client = new CommandLineOMIClient();
            if(cmd.hasOption("signon")) {
                client.admSignOn("admin", "newpass123");
            }
            else if(cmd.hasOption("signoff")) {
                client.admSignOff();
            }
            else if( cmd.hasOption("list_networks")) {
                client.confListNetworks();
            }
            else if( cmd.hasOption("list_devices") ) {
                String optValue = cmd.getOptionValue("list_devices");
                String tokens[] = optValue.split(":");
                if(tokens.length < 2) {
                    client.confListDevices(tokens[0]);
                }
                else client.confListDevices(tokens[0], tokens[1]);
            }
            else if( cmd.hasOption("add_device") ) {
                String optVal = cmd.getOptionValue("add_device");
                String tokens[] = optVal.split(":");
                client.devAddDevice(tokens[0], tokens[1], tokens[2], tokens[3]);
            }
            else if( cmd.hasOption("remove_device") ) {
                String optVal = cmd.getOptionValue("remove_device");
                String tokens[] = optVal.split(":");
                client.devRemoveDevice(tokens[0], tokens[1], tokens[2], tokens[3]);
            }
            else if( cmd.hasOption("add_vod") ) {
                String optVal = cmd.getOptionValue("add_vod");
                String tokens[] = optVal.split(":");
                for( int i = 0; i < tokens.length; i++ )
                    System.out.println(tokens[i]);
                client.contAddVoD(tokens[0], tokens[1], tokens[2], tokens[3], tokens[4]);
            }
            else if( cmd.hasOption("remove_vod") ) {
                String optVal = cmd.getOptionValue("remove_vod");
                String tokens[] = optVal.split(":");
                client.contRemoveVoD(tokens[0], tokens[1], tokens[2]);
            }
            else if( cmd.hasOption("list_content") ) {
                String optVal = cmd.getOptionValue("list_content");
                System.out.println("list_content " + optVal);
                client.contListContent(optVal);
            }
            else if( cmd.hasOption("add_event") ) {
                String optVal = cmd.getOptionValue("add_event");
                String tokens[] = optVal.split(":");
                client.contAddEvent(tokens[0], tokens[1], tokens[2], true);
            }
            else if( cmd.hasOption("remove_event") ) {
                String optVal = cmd.getOptionValue("remove_event");
                String tokens[] = optVal.split(":");
                client.contRemoveEvent(tokens[0], tokens[1], tokens[2], true);
            }
            else if( cmd.hasOption("add_vod_to_network") ) {
                String optVal = cmd.getOptionValue("add_vod_to_network");
                String tokens[] = optVal.split(":");
                client.addVoDToNetwork(tokens[0], tokens[1], tokens[2], true);
            }
            else if( cmd.hasOption("add_package") ) {
                String optVal = cmd.getOptionValue("add_package");
                String tokens[] = optVal.split(":");
                client.entAddPackage(tokens[0], tokens[1]);
            }
            else if( cmd.hasOption("remove_package") ) {
                String optVal = cmd.getOptionValue("remove_package");
                client.entRemovePackage(optVal);
            }
            else if( cmd.hasOption("list_packages") ) {
                client.entListPackages();
            }
            else if( cmd.hasOption("list_events") ) {
                String optVal = cmd.getOptionValue("list_events");
                client.contListContentEvents(optVal);
            }
            else if( cmd.hasOption("entitle_device") ) {
                String optVal = cmd.getOptionValue("entitle_device");
                String tokens[] = optVal.split(":");
                client.entEntitleDeviceToPackage(tokens[0], tokens[1], Integer.parseInt(tokens[2]));
            }
            else if( cmd.hasOption("revoke_device") ) {
                String optVal = cmd.getOptionValue("revoke_device");
                String tokens[] = optVal.split(":");
                client.entRevokeDeviceFromPackage(tokens[0], tokens[1]);
            }
            else if( cmd.hasOption("list_entitlements") ) {
                String optVal = cmd.getOptionValue("list_entitlements");
                client.entListDeviceEntitlements(optVal);
            }
            else if(cmd.hasOption("help")) {
                HelpFormatter formatter = new HelpFormatter();
                formatter.printHelp("fimnetOMI --list_networks", options);
                System.exit(-1);
            }
            else {
                HelpFormatter formatter = new HelpFormatter();
                formatter.printHelp("fimnetOMI", options);
                System.exit(-1);
            }
        }
        catch(MissingArgumentException e) {
            System.out.println("Syntax error");
            HelpFormatter formatter = new HelpFormatter();
            formatter.printHelp("fimnetOMI", options, true);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
