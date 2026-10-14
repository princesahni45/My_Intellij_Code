package OOPs;
class Complex{
    int x,y;
    Complex(int x,int y){
        this.x=x;
        this.y=y;
    }
    void print(){
        if (y>=0) System.out.println(x+" + i"+y);
        else System.out.println(x+" "+y+"i");
    }

//    void add(Complex c2) {
//        x+=x.;
//    }
}
public class ComplexNumber {
    public static void main(String[] args) {
        Complex c1 = new Complex(5,6);
        Complex c2 = new Complex(8,-3);
        c1.print();
        c2.print();


    }
}
