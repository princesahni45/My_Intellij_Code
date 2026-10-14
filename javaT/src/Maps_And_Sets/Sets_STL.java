package Maps_And_Sets;
import java.util.*;
public class Sets_STL {
    public static void main(String[] args){
       // TreeSet<Integer> set = new TreeSet<>(); // Blanaced BST
        HashSet<Integer> set=new HashSet<>();
        set.add(20);set.add(7); set.add(37);set.add(45);
        set.add(9);set.add(88);
        System.out.println(set.contains(77));
        set.remove(37);
        System.out.println(set);
        System.out.println(set.size());
    }
}
