import java.util.*;

public class Main{
    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner (System.in);
        
            int low = scn.nextInt();
            int high = scn.nextInt();
            for (int loop = low; loop <=high ; loop++){  int count=0;
            for(int n=2; n*n<=loop;n++){
                
                if((loop%n)==0){
                    count++;
                    break;
                }
            }
            if (count==0){
                System.out.println(loop);
            }
        }
    }
}