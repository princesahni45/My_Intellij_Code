package IfElse;
import java.util.Scanner;
public class Greatest{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>=b && a>=c) System.out.printf("%d is Greatest",a);

        else if(b>=a && b>=c)  System.out.printf("%d is Greatest",b);

        else if(c>=a && c>=b) System.out.printf("%d is Greatest",c);
    }
}