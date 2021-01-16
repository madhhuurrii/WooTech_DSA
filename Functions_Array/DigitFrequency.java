import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int f = getDigitFrequency(n, d);
        System.out.println(f);
    }

    public static int getDigitFrequency(int n, int d) { int div,count=0;
        // write code here
        int mod = 0;
        int temp = n;
        while (temp != 0) {
            temp =temp/10;
            mod++;

        }
        int q =(int) Math.pow(10,(mod-1));
        while(q!=0){
             div=n/q;
             if(div==d){
                 count++;
             }
            n%=q;
            q/=10;
            
        }
        return count;
    }
}