import java.io.*;
import java.util.*;

public class Main {
    public static boolean isSaddle(int[][] arr,int row,int col){
        
        for(int i=0;i<arr.length;i++){
            if(arr[row][col] > arr[row][i]){
                
                return false;
            }
            if(arr[row][col] < arr[i][col]){
                
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [][] arr = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = scn.nextInt();
            }
        }
        
        
        int saddle = Integer.MAX_VALUE;
        boolean flag=false;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(isSaddle(arr,i,j)){
                    saddle = arr[i][j];
                    flag=true;
                    break;
                }
            }
            if(flag)
                break;
        }
        if(saddle == Integer.MAX_VALUE)
            System.out.println("Invalid input");
        else
            System.out.println(saddle);
    }

}