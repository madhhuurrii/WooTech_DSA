import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        int ans = 1;
        if(x>0)
            ans = power(x,n);
        System.out.println(ans);
    }

    public static int power(int x, int n) {
        if(n == 1){
            return x;
        }
        int xpnb2 = power(x,n/2);
        int ans = xpnb2*xpnb2;
        if(n%2 == 1)
            ans*=x;
        return ans;
    }

}