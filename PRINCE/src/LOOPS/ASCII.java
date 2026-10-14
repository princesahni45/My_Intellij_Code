package LOOPS;

import java.util.Scanner;
public class ASCII {
    static public void main(String[] args) {
Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    for(int i=a;i<=b;i++){
        System.out.printf("%c ",i);
    }
    }
}