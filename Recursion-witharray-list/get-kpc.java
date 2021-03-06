import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        ArrayList<String> keypad = new ArrayList<String> (0);
        keypad.add(".;");
        keypad.add("abc");
        keypad.add("def");
        keypad.add("ghi");
        keypad.add("jkl");
        keypad.add("mno");
        keypad.add("pqrs");
        keypad.add("tu");
        keypad.add("vwx");
        keypad.add("yz");
        ArrayList<String> ans = getKPC(str,keypad);
        System.out.println(ans);
    }
    public static ArrayList < String > getKPC(String str,ArrayList<String> keypad) {
        if(str.length() == 0){
            ArrayList<String> res = new ArrayList<String> (0);
            res.add("");
            return res;
        }
        char num = str.charAt(0);
        ArrayList<String> sans = getKPC(str.substring(1),keypad);
        ArrayList<String> ans = new ArrayList<String> (0);
        for(int j = 0;j<keypad.get(num - '0').length();j++){
            for(int i=0;i<sans.size();i++){
                char ch = keypad.get(num-'0').charAt(j);
                ans.add(ch + sans.get(i));
            }
        }
        return ans;
    }

}