import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
     // write your code here  
     Scanner scn = new Scanner(System.in);
     int n = scn.nextInt();
     int k = scn.nextInt();
     int tempN = n , size = 0;
     while(tempN-- > 0){
         size++;
         tempN /= 10;
     }
     if(k != 0)
        k %= size;
     if(k<0)
        k = size + k;
     int div = 1 ,mul =1;
     for(int i=0;i<size;i++){
         if(i<k)
            div*=10;
         else
            mul *= 10;
     }
     int r = n % div;
     int q = n / div;
     int res = (r*mul) + q;
     System.out.println(res);
     
     
   }
   }