import java.io.*;
import java.util.*;

public class Main {

	public static String compression1(String str){
		String ans = "";
		ans += str.charAt(0);
		for(int i=1;i<str.length();i++){
		    if(str.charAt(i-1) != str.charAt(i))
		        ans += str.charAt(i);
		}

		return ans;
	}

	public static String compression2(String str){
		int count=1;
import java.io.*;
import java.util.*;

public class Main {

	public static String compression1(String str){
		String ans = "";
		ans += str.charAt(0);
		for(int i=1;i<str.length();i++){
		    if(str.charAt(i-1) != str.charAt(i))
		        ans += str.charAt(i);
		}

		return ans;
	}

	public static String compression2(String str){
		int count=1;
	Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}

}