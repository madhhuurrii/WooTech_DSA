import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printIncreasing(n);
        
    }

    public static void printIncreasing(int n) {
        printIncreasing2(1,n);
    }
    
    public static void printIncreasing2(int i,int n){
        if(i == n){
            System.out.println(i);
            return;
        }
        System.out.println(i);
        printIncreasing2(i+1,n);
    }

}