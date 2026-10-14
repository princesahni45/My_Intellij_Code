package IfElse;
import java.util.Scanner;
public class AreaofRec {
    public static void main(String[] args) {
    Scanner ps= new Scanner(System.in);
        System.out.println("Enter the length");
        int length=ps.nextInt();
        System.out.println("Enter the breadth");
        int breadth=ps.nextInt();
        System.out.println("Area : ");
        int Area =length*breadth;
        System.out.println(Area);
        int Perimeter=2*(length+breadth);
        System.out.println("Perimeter : "+Perimeter);
        if(Area>Perimeter) System.out.println("Area is Greater");
        else System.out.println("Perimeter is Greater");

    }
}