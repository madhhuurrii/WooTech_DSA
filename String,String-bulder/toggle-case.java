import java.io.*;
import java.util.*;

public class Main {

	public static String toggleCase(String str){
	    StringBuilder string = new StringBuilder(str); 
		for(int i=0;i<str.length();i++){
		    if(Character.isUpperCase(str.charAt(i))){
		        char ch = Character.toLowerCase(str.charAt(i));
		        string.setCharAt(i, ch); 
		        
		    }
		    else{
		        char ch = Character.toUpperCase(str.charAt(i));
		        string.setCharAt(i, ch); 
		        
		    }
		}
		String ans = "";
		for(int i=0;i<string.length();i++)
		    ans += string.charAt(i);
		return ans;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
	}

}