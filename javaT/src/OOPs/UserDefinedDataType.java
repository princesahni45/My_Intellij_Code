package OOPs;
import java.util.*;
public class UserDefinedDataType {
    public static class Student{ // khudka data type
        String Name;
        int rno;
        double cgpa;
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
            Student s1 =new Student(); // declaration
            s1.Name = "Prince";
            s1.rno=23;
            s1.cgpa=8.5;

            Student s2= new Student();
            s2.Name = "Krishh";
            s2.rno= sc.nextInt();
            s2.cgpa=8.01;

            System.out.println(s1.Name+" "+s2.Name+" "+s2.rno+" "+ s2.cgpa);

    }
}
