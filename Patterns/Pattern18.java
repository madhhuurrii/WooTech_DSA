import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    
    int nsp1 = 0, nsp2 = n-2 ,nst=3;
    for(int i=0;i<n;i++){
        if(i <= n/2){
            if(i == 0){
                for(int j=0;j<n;j++){
                    System.out.print("*	");
                }
                nsp2-=2;
                nsp1++;
            }
            else{
                for(int j=0;j<nsp1;j++){
                    System.out.print("	");
                }
                System.out.print("*	");
                for(int j=0;j<nsp2;j++){
                    System.out.print("	");
                }
                if(i!=n/2) System.out.print("*	");
                nsp2-=2;
                nsp1++;
            }
            if(i == n/2)
                nsp1 = (n/2) -1;
        }
        else{
            for(int j = 0 ; j<nsp1;j++){
                System.out.print("	");
            }
            for(int j=0;j<nst;j++){
                System.out.print("*	");
            }
            nst += 2;
            --nsp1;
        }
        System.out.println();
    }
 }
}