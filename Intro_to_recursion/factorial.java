import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ans = 1;
        if(n>1)
            ans = factorial(n);
        System.out.println(ans);
    }

    public static int factorial(int n) {
        if(n == 2)
            return 2;
        int ans = n*factorial(n-1);
        return ans;
    }

}