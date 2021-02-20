import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<String> ans = getStairPaths(n);
        System.out.println(ans);
    }

    public static ArrayList < String > getStairPaths(int n) {
        String temp = "";
        ArrayList<String> ans = new ArrayList<String> (0);
        helper(n,temp,ans);
        return ans;
    }
    public static void helper(int n, String temp, ArrayList<String> ans){
        if(n == 0){
            if(temp.length() > 0)
                ans.add(temp);
            return;
        }
        for(int i=1;i<=3;i++){
            if(n-i >= 0){
                helper(n-i,temp+i,ans);

            }
        }
    }

}