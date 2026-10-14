import java.sql.SQLOutput;
import java.util.Scanner;
public class LU {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str="AbCdefGhIEfgtesrZCBT";
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.indexOf("e"));
        System.out.println(str.lastIndexOf("e"));
        System.out.println(str.contains("de"));
        String a="Prince";
        String b="Sahni";
        String c= "Jaishankar";
        System.out.println(a.compareTo(b));
        System.out.println(a.concat(b));
        System.out.println(a+" "+b+45 +"\n" +"Prince");
        System.out.println(10+20+a);
        System.out.println(10+a+20);
        System.out.println('A'+20+a);
        System.out.println(c.substring(3));
        System.out.println(c.substring(1,5)); // 1 to 4 print krega ye
    }
}
