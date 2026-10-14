package interface_practice;
import javax.xml.transform.Source;
import java.util.*;
@FunctionalInterface //Annotation
interface Calculator{
    void add(int a,int b);
    default void defaultMethod(){
        System.out.println("I am in Functional interface, but Iam default");
    }
    static void staticMethod(){
        System.out.println("I am static Method");
    }
}
interface Calculator2{

    void add(float a,float b);
}
interface Abc {
    void multiply(int a,int b,int c);
}
interface Maximum {
    void max1(int a,int b,int c);
}

public class Fuction_Interface1 {
    public static void main(String args[]){
        Calculator c1 = (a,b) -> System.out.println("Sum is="+(a+b));
        Calculator2 c2 = (a,b) -> System.out.println("Sum is="+(a+b));//Lambda expression
        c1.add(14,7);
        c2.add(23,60);
        c1.defaultMethod();
        Calculator.staticMethod();
        Abc a1 = (a,b,c) -> System.out.println("Multiply="+(a*b*c));
        a1.multiply(3,6,9);
        Maximum m1 = (a,b,c) -> {
            System.out.println("maximum="+Math.max(Math.max(a,b),c));
        };
        m1.max1(45,88,37);

    }
}
