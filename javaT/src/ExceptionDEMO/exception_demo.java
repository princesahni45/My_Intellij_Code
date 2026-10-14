package ExceptionDEMO;
import java.util.*;
public class exception_demo {
    static void main(String[] args) {
        int a = 10;
        int b = 2;
        int c = 0;
        try {
            c = a / b;
            try {
                int[] arr = {2, 3, 4, 6, 56};
                System.out.println("Value of 10th element=" + arr[10]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalide index!");
            }
        }
            catch (Exception e) {
                System.out.println("The value of c is : " + c);
            }

    }
}
