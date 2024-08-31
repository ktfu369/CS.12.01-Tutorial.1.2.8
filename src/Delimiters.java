import java.util.ArrayList;

public class Delimiters {
    private String openDel;
    private String closeDel;

    public Delimiters(String open, String close){
        openDel = open;
        closeDel = close;
    }

    public ArrayList<String> getDelimitersList(String[] token)
    {
        ArrayList<String> x = new ArrayList<String>();
        for(int i = 0;i<token.length; i++){
            if(token[i].equals(openDel) || token[i].equals(closeDel)) x.add(token[i]);
        }
        return x;
    }

    public boolean isBalanced(ArrayList<String> delimiters) {

    // To be implemented.
        int open = 0, close = 0;
        for(String x:delimiters){
            if(x.equals(openDel)) open++;
            if(x.equals(closeDel)) close++;

            if(close > open) return false;
        }
        return open == close;
    }

    public String getOpenDel(){
        return openDel;
    }

    public String getCloseDel(){
        return closeDel;
    }

}
