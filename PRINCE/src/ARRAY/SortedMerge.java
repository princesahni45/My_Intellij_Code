package ARRAY;
public class SortedMerge {
    public static void main(String[] args) {
        int i, j;
        int[] a = {2, 4, 8, 9, 13};
        int[] b = {1, 3, 6, 9, 15, 17, 20, 25};
        int[] c = new int[a.length + b.length];
        merge(a, b, c);
        for(i=0;i<(a.length+b.length);i++) {
            System.out.print(" "+c[i]);
        }
    }

    public static void merge(int[] a, int[] b, int[] c) {
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) c[k++] = a[i++];
            else  c[k++] = b[j++];
        }
        while (i < a.length) {
            c[k++] = a[i++];
        }
        while (j < b.length) {
            c[k++] = b[j++];
        }
    }
}