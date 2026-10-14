package LinkedList;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}
class List {
    Node head;
    Node tail;
    int size;

    public void addAtHead(int val) {
        Node temp = new Node(val);
        if (head == null) head = tail = temp;
        else {
            temp.next = head;
            head = temp;
        }
    }

    void display() {
        Node temp = head;
        if (temp == null) {
            System.out.println("List is empty!");
        } else {
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    void addAtTail(int val) {
        Node temp = new Node(val);
        if (tail == null) head = tail = temp;
        else {
            tail.next = temp;
            tail = temp;

        }
    }
}

public class Insert {
    public static void main(String[] args) {
        List ll = new List();
        ll.addAtHead(10);
        ll.addAtHead(20);
        ll.display();
        ll.addAtTail(40);
        ll.display();
    }
}


