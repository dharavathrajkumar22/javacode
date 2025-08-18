
package packatesampleMethods;

public class max {
    public static void main(String[] arg) {
        int[] a = new int[]{1, 5, 2, 4, 1};
        int max = a[4];
        int min = a[1];

        for(int i = 0; i < a.length; ++i) {
            if (a[i] > max) {
                max = a[i];
            }

            if (a[i] < min) {
                min = a[i];
            }
        }

        System.out.println(max + " " + min);
    }
}
