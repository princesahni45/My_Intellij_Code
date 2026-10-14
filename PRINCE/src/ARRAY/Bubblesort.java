package ARRAY;
public class Bubblesort{
    public static void main(String[] args){
        int[] a={2,7,1,9,18,3,0,-1};
        int n=a.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(a[j]>a[j+1]){
                 int temp=a[j];
                 a[j]=a[j+1];
                 a[j+1]=temp;
                }
            }
        }
        for(int i=0;i<n-1;i++) {
            System.out.print(" "+a[i]);
        }
    }

}
