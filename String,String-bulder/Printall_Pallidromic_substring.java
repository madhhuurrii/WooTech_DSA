import java.io.*;
import java.util.*;

public class Main {

	public static void solution(String str){
		for(int i=0;i<str.length();i++){
		    for(int j=i;j<str.length();j++){
		        if(isPallindrome(str.substring(i,j+1))){
		            System.out.println(str.substring(i,j+1));
		        }
		    }
		}
		
	}
    public static boolean isPallindrome(String str){
        // int n = str.length();
        for(int i=0;i<str.length()/2;i++){  char a = str.charAt(i);
            char b = str.charAt(str.length()-1-i);
            
            if(a != b)
                return false;
        }
        return true;
    }
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		
		solution(str);
	}
