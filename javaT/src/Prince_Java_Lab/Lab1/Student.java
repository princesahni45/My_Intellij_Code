package Prince_Java_Lab.Lab1;

public class Student {

    // Data members
    String name;
    int roll;
    int age;

    // Constructor
    Student(String name,int roll, int age) {
         this.name=name;
        this.roll = roll;
        this.age = age;
    }
    Student(int roll, int age) {

        this.roll = roll;
        this.age = age;
    }
    void display(){
        System.out.println("My name is:" +name + "My AGE IS: "+age + roll);
    }

    public static void main(String[] args) {

        // Creating object using constructor
        Student s1 = new Student(191,18);
        s1.display();
    }
}