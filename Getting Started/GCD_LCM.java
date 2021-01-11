import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner (System.in);
        int a = scn.nextInt();
        int b= scn.nextInt();
        int rem =0, num,den;
        if(a>b){
            num=a;
            den=b;
        }
        else {
            num=b;
            den=a;
        }
        rem = num%den;
        while(rem!=0){
            num=den;
            den=rem;
            rem= (num%den);
        }
        int gcd =den;
        int lcm = (a*b)/gcd;
        System.out.println(gcd);
        System.out.println(lcm);
    }
}