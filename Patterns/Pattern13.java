import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        //write your code here
        int n=scn.nextInt();
        for(int i=0;i<n;i++){
            int ic=1;
            for(int j=0;j<=i;j++){
                System.out.print(ic+"	");
                int icj= ic*(i-j)/(j+1);
                ic=icj;
            }
            System.out.println();
        }

    }
}