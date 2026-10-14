package Binary_Trees;
import java.util.*;
class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val=val;
    }
}

public class Create_Tree {
    static void main(String[] args) {
        //         3
        //       /  \
        //      7     -1
        //     / \    / \
        //    5   6  1    8
        Node n1 = new Node(3);
        Node n2 = new Node(7);
        Node n3 = new Node(-1);
        Node n4 = new Node(5);
        Node n5 = new Node(6);
        Node n6 = new Node(1);
        Node n7 = new Node(8);
        n1.left = n2;  n1.right = n3;
        n2.left = n4;  n2.right = n5;
        n3.left = n6;  n3.right = n7;
        System.out.println();
        System.out.println("size: "+size(n1));
        System.out.println("Sum: "+sum(n1));
        System.out.println("Maximum: "+Maximum(n1));
        System.out.print("Pre-Order--> ");
        preorder(n1);
        System.out.println();
        System.out.print("In-Order--> ");
        inorder(n1);
        System.out.println();
        System.out.print("Post-Order--> ");
        postorder(n1);
        System.out.println();
        System.out.print("LevelOrder--> ");
        levelOrder(n1);

    }

    private static void levelOrder(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(q.size()>0){
            Node front= q.remove();
            System.out.print(front.val+" ");
            if(front.left!=null) q.add(front.left);
            if(front.right!=null) q.add(front.right);
        }
    }

    private static int size(Node root){
        if(root==null) return 0;
        return 1+size(root.left)+size(root.right);
    }
    private static int Maximum(Node root){
        if(root==null) return Integer.MIN_VALUE;
        return Math.max(root.val,Math.max(Maximum(root.left),Maximum(root.right)));
    }
    private static int sum(Node root){
        if(root==null) return 0;
        return root.val+sum(root.left)+sum(root.right);
    }
    private static void preorder(Node root){
        if(root==null) return;
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }
    private static void inorder(Node root){
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }
    private static void postorder(Node root){
        if(root==null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val+" ");
    }


    }

