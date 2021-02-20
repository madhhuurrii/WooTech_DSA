import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    
    
    int n1 = scn.nextInt();
    int [] arr1 = new int[n1];
    for(int i=0;i<n1;i++)
        arr1[i] = scn.nextInt();
    
    
    int n2 = scn.nextInt();
    int [] arr2 = new int[n2];
    for(int i=0;i<n2;i++)
        arr2[i] = scn.nextInt();
    
    if(n1 <= n2){
        int i = n1-1;
        int j = n2-1;
        while(i >= 0){
            int add = arr1[i] + arr2[j];
            if(i==0 && j==0 && n1 == n2){
                arr2[j] = add;
                break;
            }
                
            if(add >= 10){
                arr2[j] = add %10;
                arr2[j-1] += add/10;
            }
            else{
                arr2[j] = add;
            }
            i--;
            j--;
        }
        for(i=0;i<n2;i++)
            System.out.println(arr2[i]);
    }
    else{
        int i = n1-1;
        int j = n2-1;
        while(j >= 0){
            int add = arr1[i] + arr2[j];
            if(i==0 && j==0 && n1 == n2){
                arr1[i] = add;
                break;
            }
                
            if(add >= 10){
                arr1[i] = add %10;
                arr1[i-1] += add/10;
            }
            else{
                arr1[i] = add;
            }
            i--;
            j--;
        }
        for(i=0;i<n1;i++)
            System.out.println(arr1[i]);
    }
    
 }

}