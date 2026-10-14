package IfElse;
import java.util.Scanner;
public class Magar {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int cost= sc.nextInt();
        int selling= sc.nextInt();
        if(selling>cost) {
            System.out.printf("PROFIT is %d\n",(selling-cost));
        }else{
            System.out.println("LOSS is "+(cost-selling));
        }

    }

}
