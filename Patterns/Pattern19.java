import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int nsp1 = n/2, nsp2=(n/2)-1;
    for(int i=1;i<=n;i++){
        if(i <= n/2){
            if(i == 1){
                for(int j=1;j<=(n/2)+1;j++){
                    System.out.print("*	");
                }
                for(int j=1;j<=nsp2;j++)
                    System.out.print("	");
                System.out.print("*	");
            }
            else{
                for(int j=1;j<=nsp1;j++)
                    System.out.print("	");
                System.out.print("*	");
                for(int j=1;j<=nsp2;j++)
                    System.out.print("	");
                System.out.print("*	");
            }
        }
        else if(i == n/2 + 1){
            for(int j=1;j<=n;j++)
                System.out.print("*	");
        }
        else{
            nsp1 = nsp2;
            
            if(i == n){
                System.out.print("*	");
                for(int j=1;j<=nsp1;j++)
                    System.out.print("	");
                for(int j=1;j<=(n/2)+1;j++)
                    System.out.print("*	");
            }
            else{
                System.out.print("*	");
                for(int j=1;j<=nsp1;j++)
                    System.out.print("	");
                System.out.print("*	");
            }
        }
        System.out.println();
    }
     // write ur code here

 }
}