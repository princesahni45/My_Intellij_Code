package java_question2;
abstract class Shape{
    abstract double area();
    double  area;
    void DisplayArea(){
        System.out.println("Area= "+area);
    }
}
class Circle extends Shape{
    double radius=4 ;
    double area(){
        double ac=3.14*radius*radius;
        return ac;
    }

}
public class Area {
    static void main(String[] args) {

    }
}
