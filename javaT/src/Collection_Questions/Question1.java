package Collection_Questions;
import java.util.*;
public class Question1 {

            public static void addMarks(List<Integer> marks, int mark) {
                marks.add(mark);
            }

            public static double calculateAverage(List<Integer> marks) {
                int sum=0,count=0;
                for(int ele:marks){
                    sum+=ele;
                    count++;
                }
                return sum/count;
            }

            public static int findHighest(List<Integer> marks) {
                int max=0;
                for(int ele:marks){
                    max=Math.max(max,ele);
                }
                return max;
            }

            public static void displayMarks(List<Integer> marks) {
               for(int ele:marks){
                   System.out.print(ele+" ");
               }
            }

            public static void main(String[] args) {

                List<Integer> marks = new ArrayList<>();

                addMarks(marks, 78);
                addMarks(marks, 85);
                addMarks(marks, 92);
                addMarks(marks, 67);
                addMarks(marks, 88);

                displayMarks(marks);

                System.out.println("Average: " + calculateAverage(marks));
                System.out.println("Highest: " + findHighest(marks));
            }
        }




