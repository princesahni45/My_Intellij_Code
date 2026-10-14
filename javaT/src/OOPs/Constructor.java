package OOPs;
 class Pokemon {
    String name;
    private int power;
    int length;

    Pokemon(String name, int power, int length) {
        this.name = name;
        this.power = power;
        this.length = length;
    }
    int getPower(){
        return power;
    }
    void print() {
        System.out.println(this.name + " " + this.power + " " + this.length);
    }

}
public class Constructor {


    static void main(String[] args) {
        Pokemon p1 = new Pokemon("Prince", 80, 332);
//        p1.power=34;
        System.out.println(p1.getPower());
        p1.print();
    }
}
