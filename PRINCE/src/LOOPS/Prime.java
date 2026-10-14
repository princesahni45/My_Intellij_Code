package LOOPS;
import java.util.Scanner;
public class Prime{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int flag=0;
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                flag++;
                break;
            }
        }
        if(n==1) System.out.println("Nor Prime and nor Composite");
        else if(flag>0) System.out.println("Composite Number");
        else System.out.println("Prime number");

    }
}