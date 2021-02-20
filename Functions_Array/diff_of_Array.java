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
    
    
    int one  = n1 - 1 , two = n2 - 1;
    while(two >= 0){
        if(one >= 0){
            if(arr2[two] >= arr1[one]){
                arr2[two] = arr2[two] - arr1[one];
            }
            else{
                int k = two - 1;
                while(arr2[k] == 0){
                    --k;
                }
                --arr2[k];
                k++;
                while(k < two){
                    arr2[k] = 9;
                    ++k;
                }
                arr2[two] += 10;
                arr2[two] = arr2[two] - arr1[one];
            }
        }
        --one;
        --two;
    }
    if(arr2[0] != 0)
        System.out.println(arr2[0]);
    for(int i=1;i<n2;i++)
        System.out.println(arr2[i]);
    
 }

}