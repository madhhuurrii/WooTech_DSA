import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        ArrayList < String > ans = getMazePaths(0, 0, n - 1, m - 1);
        System.out.println(ans);
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList < String > getMazePaths(int sr, int sc, int dr, int dc) {
        if (sr == dr && dc == sc) {
            ArrayList < String > ans = new ArrayList < String > (0);
            ans.add("");
            return ans;
        }
        if (sr > dr || dc < sc) {
            ArrayList < String > ans = new ArrayList < String > (0);
            return ans;
        }
        
        ArrayList < String > sans1 = getMazePaths(sr,sc+1,dr,dc);
        ArrayList < String > sans2 = getMazePaths(sr+1,sc,dr,dc);
        ArrayList < String > ans = new ArrayList<String> (0);
        for(int i=0;i<sans1.size();i++){
            ans.add("h"+sans1.get(i));
        } for(int i=0;i<sans2.size();i++){
            ans.add("v"+sans2.get(i));
        }
        return ans;
    }
    
}