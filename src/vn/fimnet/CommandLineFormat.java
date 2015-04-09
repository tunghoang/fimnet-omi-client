package vn.fimnet;

import java.util.List;

import java.lang.reflect.Method;
import java.lang.reflect.Field;

public class CommandLineFormat implements FormatIntf {
    private String prepend = "\t";
    private String append = "\n";
    public void reset() {
        prepend = "\t";
        append = "\n";
    }
    public void format(StringBuilder sb, Object obj) throws Exception {
        Class <?> c = obj.getClass();
        Field[] fields = c.getDeclaredFields();
        boolean first = true;

        sb.append(prepend);

        for( Field f: fields ) {
            String fieldName = f.getName();
            Method method;
            if(f.getType().equals(boolean.class))
                method = c.getMethod("is" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1), new Class[]{});
            else 
                method = c.getMethod("get" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1), new Class[]{});
            if( first ) {
                sb.append(f.getName() + "=" + method.invoke(obj));
                first = false;
            }
            else {
                sb.append(";");
                sb.append(f.getName() + "=" + method.invoke(obj));
            }
        }

        sb.append(append);
    }
    public void format(StringBuilder sb, List objs) throws Exception {
        for ( Object obj: objs ) {
            format(sb, obj);
        }
    }
    public void format(StringBuilder sb, Object fObj, List objs) throws Exception {
        format(sb, fObj);
        prepend += "\t";
        format(sb, objs);
    } 
}
