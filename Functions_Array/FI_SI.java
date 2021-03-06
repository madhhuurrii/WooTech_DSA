import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = scn.nextInt();
        int d = scn.nextInt();
        
        
        int l = 0 , h = n-1,first = -1;
        while(l <= h){
            int mid = l + ((h - l)/2);
            if(arr[mid] == d){
                first = mid;
                h = mid - 1;
            }
            else if(arr[mid] > d)
                h = mid - 1;
            else
                l = mid + 1;
        }
        System.out.println(first);
        
        
        
        l = 0 ; h = n-1;
        int last = -1;
        while(l <= h){
            int mid = l + ((h - l)/2);
            if(arr[mid] == d){
                last = mid;
                l = mid + 1;
            }
            else if(arr[mid] > d)
                h = mid - 1;
            else
                l = mid + 1;
        }
        System.out.println(last);
        
    }

}