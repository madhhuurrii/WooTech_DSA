import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nsp = n/2 , nst = 1;
        for(int i=0;i<n;i++){
            if(i != n/2){for(int j=0;j<nsp;j++){
                System.out.print("	");
            }
            for(int j=0;j<nst;j++){
                System.out.print("*	");
            }
            if(i < n/2){
                nst++;
            }
            else    nst--;}
            else{
                for(int j=0;j<n;j++)
                    {System.out.print("*	");}
                nst--;
            }
            System.out.println();
        }
        // write ur code here

    }
}