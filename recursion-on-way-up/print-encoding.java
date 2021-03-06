import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        printEncodings(str, "");
    }

    public static void printEncodings(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        if (ch != '0') {
            int cn = (int)(ch) - (int)('1') + (int)('a');
            char cc = (char)(cn);
            String ss = str.substring(1);
            printEncodings(ss, ans + cc);
        }
        if (str.length() > 1) {
            if (ch != '0') {
                char ch2 = str.charAt(1);
                if (ch == '1') {
                    String h = str.substring(0, 2);
                    int cn = Integer.parseInt(h);
                    char cc = (char)(cn - 1 + 'a');
                    String ss = str.substring(2);
                    printEncodings(ss, ans + cc);
                } else if (ch == '2' && ch2 >= '0' && ch2 <= '6') {
                    String h = str.substring(0, 2);
                    int cn = Integer.parseInt(h)-1;
                    char cc = (char)(cn + 'a');
                    String ss = str.substring(2);
                    printEncodings(ss, ans + cc);
                }
            }
        }
    }

}