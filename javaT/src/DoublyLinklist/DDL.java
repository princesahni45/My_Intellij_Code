package DoublyLinklist;

class Node {
    int val;
    Node next;
    Node prev;

    Node(int val) {
        this.val = val;
    }
}

class DoublyList {

    Node head;
    Node tail;
    int size;

    void insertAtHead(int val) {
        Node temp = new Node(val);

        if (head == null) {
            head = tail = temp;
        } else {
            temp.next = head;
            head.prev = temp;
            head = temp;
        }

        size++;
    }

    void insertAtTail(int val) {
        Node temp = new Node(val);

        if (head == null) {
            head = tail = temp;
        } else {
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }

        size++;
    }

    void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    void displayreverse() {
        Node temp = tail;

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }

        System.out.println();
    }

    void deleteAtHead() {
        if (head == null) {
            return;
        }

        if (head.next == null) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }

        size--;
    }

    void deleteAtTail() {
        if (tail == null) {
            return;
        }

        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }

        size--;
    }

     void insert(int  n, int val) {
         Node a = new Node(val);
         Node temp=head;
        if(size < 0 || size < n ){
            System.out.println("Invalid Index!..");
        }
        else if(size==0){
            insertAtHead(val);
        }else if(size==1){
            insertAtTail(val);
        }else{


            for(int i=0;i<n-1;i++){
                temp=temp.next;
            }
            Node b=temp.next;
            temp.next=a;
            a.prev=temp;
            a.next=b;
            b.prev=a;
        }
    }
}

public class DDL {

    public static void main(String[] args) {

        DoublyList list = new DoublyList();

        list.insertAtHead(30);
        list.insertAtHead(20);
        list.insertAtHead(10);

        list.display();
        list.displayreverse();
        list.insertAtTail(40);

        list.display();
        list.displayreverse();
        list.insert(1,80);
        list.display();
    }
}