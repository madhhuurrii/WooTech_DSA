import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        
        int ans = 1;
        if(n > 0)
            ans = power(x,n);
        System.out.println(ans);
    }

    public static int power(int x, int n) {
        if(n == 1){
            return x;
        }
        int sAns = power(x,n-1);
        int ans = sAns*x;
        return ans;
    }

}