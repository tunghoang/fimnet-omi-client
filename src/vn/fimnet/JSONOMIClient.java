package vn.fimnet;

public class JSONOMIClient extends OMIClient {
    private static final String sessionFile = "session.txt";
    public JSONOMIClient() {
        super();
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
    }
}
