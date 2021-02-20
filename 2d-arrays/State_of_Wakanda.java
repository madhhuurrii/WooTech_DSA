import java.io.*;
import java.util.*;

public class Main{
public static void up(int[][] arr,int j){
    for(int i=arr.length-1;i>=0;i--){
        System.out.println(arr[i][j]);
    }
}
public static void down(int[][] arr,int j){
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i][j]);
    }
}

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int m = scn.nextInt();
    int [][] arr = new int[n][m];
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            arr[i][j] = scn.nextInt();
        }
    }
    
    
    for(int j=0;j<m;j++){
        if(j%2 == 0){
            down(arr,j);
            
        }
        else{
            up(arr,j);
            
        }
    }
 }

}