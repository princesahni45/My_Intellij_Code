package Collection_Questions;
import java.util.*;
public class Question3 {


        public static boolean registerStudent(Set<Integer> set, int id) {

            if (set.contains(id)) {
                return true;
            } else {

                return false;
            }
        }

        public static boolean isRegistered(Set<Integer> set, int id) {
            if (set.contains(id)) {
                return true;
            } else {

                return false;
            }
        }

        public static int totalStudents(Set<Integer> set) {
            // Write your code
            return 0;
        }

        public static void main(String[] args) {

            Set<Integer> set = new HashSet<>();

            System.out.println(registerStudent(set, 101));
            System.out.println(registerStudent(set, 102));
            System.out.println(registerStudent(set, 103));
            System.out.println(registerStudent(set, 101));

            System.out.println("Registered: "
                    + isRegistered(set, 102));

            System.out.println("Total Students: "
                    + totalStudents(set));
        }
    }
//    Expected Output
//true
//        true
//        true
//        false
//    Registered: true
//    Total Students: 3
//
//}
