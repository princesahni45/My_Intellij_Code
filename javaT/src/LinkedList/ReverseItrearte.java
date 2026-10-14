package LinkedList;
import java.util.*;
public class ReverseItrearte {
    static void main(String args[]) {
      LinkedList<Integer> list = new LinkedList<>();
      list.add(10);
      list.add(20);
      list.add(30);
      list.add(40);
      ListIterator<Integer> itr = list.listIterator(list.size());

      while(itr.hasPrevious()){
          System.out.print(itr.previous()+" ");
      }
    }
}
