package ARRAY;
import java.util.Scanner;
public class RotateArray{
    static public void main(String[] args){
        int[] a={2,5,22,7,9,11,3};
        //Rotate Array
        int j=3;
        for(int i=0;i<a.length;i++){
            a[i]=a[j];
            j++;
        }
    }
}