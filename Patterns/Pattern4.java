import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
          int n = scn.nextInt();
        // write ur code here
      int  st=n;
      int sp =0;
      for(int i=0;i<n;i++){
          for(int j=0;j<sp;j++){
              System.out.print("	");
          }
          for(int j=0;j<st;j++){
              System.out.print("*	");
          }
      
        
     st--;
     sp++;
     System.out.println();
      }
    }
}