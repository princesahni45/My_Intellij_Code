package Prince;
import java.util.Scanner;
public class Exercise1 {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in) ;
        System.out.println("Enter the marks1");
        int a=sc.nextInt();
        System.out.println("Enter the marks2");
        int b=sc.nextInt();
        System.out.println("Enter the marks3");
        int c=sc.nextInt();
        System.out.println("Enter the marks4");
        int d=sc.nextInt();
        System.out.println("Enter the marks5");
        int e=sc.nextInt();
        System.out.print("Total marks: ");
        int total =a+b+c+d+e;
        System.out.println(total);
        System.out.println("Percentage: ");
        float p= (float)total/5;
        System.out.println(p);


    }
}
