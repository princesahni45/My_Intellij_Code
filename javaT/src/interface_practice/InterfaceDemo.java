package interface_practice;

import java.security.cert.CertStoreException;
import java.sql.SQLOutput;

interface CS{
    void OOPS(); // method declration , abstract method hai ye by default
    void DS();
    void OS();

     int noOfLecture=40; //staic final by default hote hai isme
}
class CS3C implements CS{ // provide the body for the each method
    public void OOPS(){ // method defination
        System.out.println("Taught by AJ");
    }

    public void DS(){
        System.out.println("Taught by the VS");
    }
    public void OS(){
        System.out.println("Taught by the AS");
    }
    public void placement(){
        System.out.println("We tech aptitude and softskill");
    }
    public void fees(){
        System.out.println("Submit your fees!");
    }

}
interface CRPC extends CS{
    void placement();
}
interface AC extends CS {
    void fees();
}


public class InterfaceDemo {
    public static void main(String[] args) {
        CS3C s1 = new CS3C(); //object creation
        s1.OOPS();
        s1.DS();
    }
}
