package LinkedList;
import java.util.*;
public class CreateNode {
    static void Display(Node head) {
        Node n = head;
        while(n!=null) {
            System.out.print(n.val + " ");
            n=n.next;
        }
        System.out.println();
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node a = new Node(sc.nextInt());
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        a.next =b;
        b.next=c;
        c.next=d;
        d.next=e;
        Display(a);

    }
}
