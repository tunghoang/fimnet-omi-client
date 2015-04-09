package vn.fimnet;
import java.util.List;
public interface FormatIntf {
    void reset();
    void format(StringBuilder sb, Object obj) throws Exception;
    void format(StringBuilder sb, List objs) throws Exception;
    void format(StringBuilder sb, Object fObj, List objs) throws Exception;
}
