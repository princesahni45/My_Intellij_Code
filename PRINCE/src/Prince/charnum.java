package Prince;

import java.util.Scanner;
public class charnum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        int a=sc.nextInt();
        char character= (char)(ch+a);
        System.out.println(character);
        int b= ch+a;
        System.out.println(b);


    }
}


