import java.util.Scanner;
public class Factorial{
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      System.out.println(fact(num));
   }
   static int fact(int n)
   {
       int result;
       if(n==1){
         return 1;
       }
       result = n * fact(n-1);
       return result;
   }
}