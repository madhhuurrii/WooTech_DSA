import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        for (int i = 0; i < t; i++) {
            // write ur code here
            int n = scn.nextInt();
            int prime = 0;

            for (int loop = 2;loop* loop <= n; loop++) {
                if ((n % loop) == 0){
                    prime ++;
                    break;
            }}
            if (prime == 0) {
                System.out.println("prime");
            } else {
                System.out.println("not prime");
            }

        }
    }
}