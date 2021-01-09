import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here  
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nod =0;
        int temp= n;
        while(temp!=0){
            temp=temp/10;
            nod++;
        }
        int q = (int)Math.pow(10,(nod-1));
        while(q!=0){
            int div = n/q;
            System.out.println(div);
            
            n =n%q;
            q=q/10;
        }
    }
}