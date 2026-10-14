package Prince_Java_Lab.Lab1;

    final class A {
        float pi = 3.14f;
    }


    class B {
        final int AreaOfRectangle(int a, int b) {
            return 2 * (a + b);
        }

        final int AreaOfSquare(int side) {
            return side * side;
        }
    }
    public class Final_Pracctice {


    public static void main(String[] args) {

        B a1 = new B();

        int a = 10;
        int b = 20;

        int rectangle = a1.AreaOfRectangle(a, b);
        int square = a1.AreaOfSquare(5);

        System.out.println("Perimeter of Rectangle = " + rectangle);
        System.out.println("Area of Square = " + square);
    }
}