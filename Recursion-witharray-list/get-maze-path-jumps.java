import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        ArrayList<String> ans = getMazePaths(0,0,n,m);
        System.out.println(ans);
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList < String > getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr == dr - 1 && sc == dc -1){
            ArrayList< String> res = new ArrayList<>();
            res.add("");
            return res;
        }
        ArrayList<String> ans = new ArrayList<>();
        for(int jump = 1;jump < dc;jump++){
            if(jump + sc <= dc-1){
                ArrayList<String> sans = getMazePaths(sr,sc+jump,dr,dc);
                for(int i=0;i<sans.size();i++){
                    String temp = "h"+jump+sans.get(i);
                    ans.add(temp);
                }
            }
        }
        for(int jump = 1;jump < dr;jump++){
            if(jump + sr <= dr-1){
                ArrayList<String> sans = getMazePaths(sr+jump,sc,dr,dc);
                for(int i=0;i<sans.size();i++){
                    String temp = "v"+jump+sans.get(i);
                    ans.add(temp);
                }
            }
        }
        for(int jump = 1;jump < dc;jump++){
            if(jump + sc <= dc-1 && jump + sr <= dr-1){
                ArrayList<String> sans = getMazePaths(sr+jump,sc+jump,dr,dc);
                for(int i=0;i<sans.size();i++){
                    String temp = "d"+jump+sans.get(i);
                    ans.add(temp);
                }
            }
        }
        return ans;
    }

}