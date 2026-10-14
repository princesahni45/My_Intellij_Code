package Prince_Java_Lab.Lab1;
abstract class Student3 {

    abstract void sound();

    void attendClass() {
        System.out.println("Student attends class");
    }
}

class DOG extends Student3 {

    void sound() {
        System.out.println("Dogs Bark");
    }
}
class CAT extends Student3{
    void sound(){
        System.out.println("Meow Meow");
    }
}


public class Abstract_Practice {
    public static void main(String[] args) {;

        DOG d = new DOG(); // Object creation
        d.sound();
        d.attendClass();
        CAT c= new CAT();
    }
}