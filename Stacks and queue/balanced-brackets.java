import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        Stack < Character > st = new Stack < > ();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{' ){
                st.push(str.charAt(i));
            }
            else if(str.charAt(i) == ')'){
                boolean val = helper(st,'(');
                if(val == false){
                    System.out.println(val);
                    return;
                }
            } 
            else if(str.charAt(i) == ']'){
                boolean val = helper(st,'[');
                if(val == false){
                    System.out.println(val);
                    return;
                }
            } 
            else if(str.charAt(i) == '}'){
                boolean val = helper(st,'{');
                if(val == false){
                    System.out.println(val);
                    return;
                }
            } 
        }
        if(st.size() == 0){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
        
    }
    public static boolean helper(Stack<Character> st, Character ch){
        if(st.size() == 0){
            return false;
            }
        else if(st.peek() != ch){
            return false;
            }
        else{
            st.pop();
            return true;
            }
    }
}