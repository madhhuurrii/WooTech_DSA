import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int nsp = (n*2)-1-2;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j+"	");
        }
        for(int j=0;j<nsp;j++){
            System.out.print("	");
        }
        for(int j=i;j>0;j--){
            if(j != n) System.out.print(j+"	");
        }
        nsp -= 2;
        System.out.println();
    }
    
     // write ur code here

 }
}