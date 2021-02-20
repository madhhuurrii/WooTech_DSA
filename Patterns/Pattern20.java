import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nsp1 = n / 2 - 1, nsp2 = 1, nsp3 = n / 2 - 1;
        if (n == 1)
            System.out.print("*	");
        else {
            for (int i = 1; i <= n; i++) {
                if (i <= n / 2) {
                    System.out.print("*	");
                    for (int j = 1; j <= nsp1; j++) {
                        System.out.print("	");
                    }
                    for (int j = 1; j <= nsp2; j++) {
                        System.out.print("	");
                    }
                    for (int j = 1; j <= nsp3; j++) {
                        System.out.print("	");
                    }
                    System.out.print("*	");
                } else if (i == n / 2 + 1) {
                    System.out.print("*	");
                    for (int j = 1; j <= nsp1; j++) {
                        System.out.print("	");
                    }
                    System.out.print("*	");
                    for (int j = 1; j <= nsp3; j++) {
                        System.out.print("	");
                    }
                    System.out.print("*	");
                    nsp1--;
                    nsp3--;
                } else {
                    System.out.print("*	");
                    for (int j = 1; j <= nsp1; j++)
                        System.out.print("	");
                    if (i != n) System.out.print("*	");
                    for (int j = 1; j <= nsp2; j++)
                        System.out.print("	");
                    if (i != n) System.out.print("*	");
                    for (int j = 1; j <= nsp3; j++)
                        System.out.print("	");
                    System.out.print("*	");
                    nsp1--;
                    nsp2 += 2;
                    nsp3--;
                }
                System.out.println();
            }
        } // write ur code here

    }
}