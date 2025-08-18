//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package javabasic;

public class sortArray {
    public static void main(String[] arg) {
        int[] a = new int[]{1, 4, 3, 2, 5, 2};
        int sort = 0;

        for(int i = 0; i < a.length; ++i) {
            for(int j = i + 1; j < a.length; ++j) {
                if (a[i] > a[j]) {
                    sort = a[i];
                    a[i] = a[j];
                    a[j] = sort;
                }
            }
        }

        System.out.println("sorted values are");

        for(int k = 0; k < a.length; ++k) {
            System.out.println(a[k]);
        }

    }
}
