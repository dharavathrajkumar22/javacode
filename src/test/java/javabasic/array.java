package javabasic;

public class array {
    public static void main(String[] arg) {
        int[] a = new int[]{1, 2, 3, 4, 5};
        System.out.println(a[0]);

        for(int i = 0; i < 5; ++i) {
            System.out.println(a[i]);
        }

        System.out.println("======");
        char[] b = new char[]{'w', 'e', 'r', 't', 'y'};
        System.out.println(b.length);
        System.out.println(b);
        System.out.println("======");

        for(int j = 0; j < b.length; ++j) {
            System.out.println("with charector" + b[j]);
        }

        System.out.println("======");
        int[] c = new int[]{1, 2, 3, 4, 5};

        for(int k = 0; k < c.length; ++k) {
            System.out.println("with number" + c[k]);
        }

    }
}
