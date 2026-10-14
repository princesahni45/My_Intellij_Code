package Prince;
import java.util.Scanner;
public class Video13{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String ch=sc.next(); //This is Prince -> This
        sc.nextLine(); //Clear buffer
        System.out.println(ch);
        String chh=sc.nextLine(); //This is Prince -> This is Prince
        System.out.println(chh);
        float a=20.2000f;
       System.out.format("This is my mathematics marks: %.2f\n",a);
        System.out.format("This is my mathematics marks: %15.2f",a);



    }
}