package Collection_Questions;
import java.util.*;

public class Question2 {

        public static void addProduct(List<String> cart, String product) {

                cart.add(product);

        }

        public static void removeProduct(List<String> cart, String product) {
                cart.remove(product);
        }

        public static int countProduct(List<String> cart, String product) {
            int count=0;
                for(String ele : cart){
                    if(product==ele)
                    count++;
                }
            return count;
        }

        public static void displayCart(List<String> cart) {
           for(String ele : cart){
               System.out.print(ele+" ");
           }
            System.out.println();
        }

        public static void main(String[] args) {

            List<String> cart = new ArrayList<>();

            addProduct(cart, "Laptop");
            addProduct(cart, "Mouse");
            addProduct(cart, "Keyboard");
            addProduct(cart, "Mouse");
            addProduct(cart, "Mouse");

            System.out.println("Cart:");
            displayCart(cart);

            System.out.println("Mouse quantity: " + countProduct(cart, "Mouse"));

            removeProduct(cart, "Mouse");

            System.out.println("After removing one Mouse:");
            displayCart(cart);
        }
    }
//    Expected Output
//    Cart:
//    Laptop Mouse Keyboard Mouse Mouse
//    Mouse quantity: 3
//    After removing one Mouse:
//    Laptop Keyboard Mouse Mouse


