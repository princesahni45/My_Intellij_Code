package Prince;
import java.util.Scanner;
public class Scanf {
   public static void main(String[] args) {
       System.out.println("Taking input from user");
       Scanner sc= new Scanner(System.in);
       int a=sc.nextInt();
       int b=sc.nextInt();
       int sum=a+b;
       System.out.println(sum);
       // for the float number.
       float c=sc.nextFloat();
       float d=sc.nextFloat();
       float sum1=c+d;
       System.out.println(sum1);




    }
}
