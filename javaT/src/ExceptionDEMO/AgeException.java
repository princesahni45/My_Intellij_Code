package ExceptionDEMO;

import java.util.Scanner;

class MyException extends Exception {

    public MyException(String message) {
        super(message);
    }
}

public class AgeException {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        try {
            if (age < 18) {
                throw new MyException("Not able to vote! ");
            } else {

                System.out.println("You are eligible");
            }
        }
        catch (MyException e) {
            System.out.println("ERROR ");
        }
    }
}
