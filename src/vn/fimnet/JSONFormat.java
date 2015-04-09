package vn.fimnet;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.json.JSONObject;

import java.util.List;
public class JSONFormat implements FormatIntf {
    private Gson gson;
    private String prepend = "\t";
    private String append = "\n";
    public JSONFormat() {
        //gson = new Gson();
        gson = new GsonBuilder().setPrettyPrinting().create();
    }
    public void reset() {
        prepend = "\t";
        append = "\n";
    }
    public void format(StringBuilder sb, Object obj) throws Exception {
        sb.append(prepend);
        sb.append(gson.toJson(obj));
        sb.append(append);
    }
    public void format(StringBuilder sb, List objs) throws Exception {
        sb.append(prepend);
        sb.append(gson.toJson(objs));
        sb.append(append);
    }
    public void format(StringBuilder sb, Object fObj, List objs) throws Exception {
        JSONObject json = new JSONObject();
        json.put("result", fObj);
        json.put("items", objs);
        sb.append(prepend);
        sb.append(gson.toJson(json));
        sb.append(append);
    } 
}
