package Prince_Java_Lab.Lab1;

import javax.xml.transform.Source;
// CS -> AS -> CRPC
class CS  {
   // to inherit the class use the "extends" key word
    void OOPs(){
        System.out.println("Taught by Anmol Jain Sir");
    }
    void ADS(){
        System.out.println("Taught by Vivek Sir");
    }
    void DBMS(){
        System.out.println("Taught by Priyanka Mam");
    }
}
class AS {
    void Maths(){
        System.out.println("Taught by Annu mam");
    }
}
class CRPC extends CS {

    void OOPs(){
        System.out.println("Placement Cell ");
    }
}
public class Inheritence {
    public static void main(String arg[]) {
        CS s2 = new CS();
        s2.OOPs(); // override kr dega
        CRPC c1 = new CRPC(); // Object of CRPC =c1 ,Constructor = CRPC()
        //s2.OOPs();
    }
}
