import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        printKPC(str,"");
    }
    static String[] keypad= {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printKPC(String str,String temp) {
        if(str.length() == 0){
            System.out.println(temp);
            return;
        }
        char ch = str.charAt(0);
        String ss = str.substring(1);
        for(int i=0;i<keypad[ch-'0'].length();i++){
            char w = keypad[ch-'0'].charAt(i);
            printKPC(ss,temp+w);
        }
    }

}