import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nsp = n/2, firstVal = 1, nst = 1;
        for(int i=0;i<n;i++){
            
            for(int j=0;j<nsp;j++){
                System.out.print("	");
            }
            
            int presentVal = firstVal;
            for(int j=0;j<nst;j++){
                System.out.print(presentVal + "	");
                if(j < nst/2){
                    ++presentVal;
                }
                else    --presentVal;
            }
            
            if(i < n/2){
                ++firstVal;
                --nsp;
                nst+=2;
            }
            else{
                --firstVal;
                ++nsp;
                nst-=2;
            }
               System.out.println();
        }
     
        // write ur code here

    }
}