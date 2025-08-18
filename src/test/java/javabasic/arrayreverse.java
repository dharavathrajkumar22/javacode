package javabasic;

public class arrayreverse {
    public static void main(String[] arg) {
        char[] a = new char[]{'z', 'a', 'q', 'w', 's', 'x'};
        int[] b = new int[]{1, 2, 3, 4};
        String[] c = new String[]{"aa", "jj", "kk"};

        for(int i = a.length - 1; i >= 0; --i) {
            System.out.println(a[i] + " ");
        }

        for(int j = b.length - 1; j >= 0; --j) {
            System.out.println("" + b[j]);
        }

        for(int k = c.length - 1; k >= 0; --k) {
            System.out.println("  " + c[k]);
        }

    }
}