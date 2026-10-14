package ARRAY;

public class TrailingZeros {
    public static void main(String[] arg) {
        int[] a = {2, 0, -7, 7, 0, 8, 15, -4, 0, 20, 0};
        int n = a.length;
        int i = 0, j = n - 1;
        while (i < j) {
            if (a[i] == 0 && a[j] != 0) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
                //break;
            } else if (a[i] != 0 && a[j] == 0) {
                j--;
                i++;
            } else if (a[i] == 0 && a[j] == 0) {
                j--;
            } else if (a[i] != 0 && a[j] != 0)
                i++;
//            for (int k = 0; k < n - 1; k++) {
//                System.out.print(" "+a[k]);
        }

        for (int k = 0; k < n - 1; k++) {
            System.out.print(" " + a[k]);
        }
    }
}
