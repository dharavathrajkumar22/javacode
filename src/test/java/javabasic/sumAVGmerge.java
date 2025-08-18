//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package javabasic;

public class sumAVGmerge {
    public static void main(String[] arg) {
        int[] a = new int[]{2, 4, 6, 8};
        int sum = 0;
        int b = 0;

        for(int i = 0; i < a.length; ++i) {
            System.out.println(a[i]);
            sum += a[i];
            b = sum / a.length;
        }

        System.out.println("=============list of input of a==================");
        System.out.println(sum);
        System.out.println("=============sum of addition value==================");
        System.out.println(b);
        System.out.println("=============average value==================");
        System.out.println("===============================");
        String[] c = new String[]{"cat", "dog"};
        String[] c1 = new String[]{"food", "shed"};
        String[] merg = new String[4];

        for(int i = 0; i < c.length; ++i) {
            merg[i] = c[i];
        }

        for(int j = 0; j < c1.length; ++j) {
            merg[c.length + j] = c1[j];
        }

        System.out.println("merg sorting");

        for(int k = 0; k < merg.length; ++k) {
            System.out.print(merg[k] + " ");
        }

    }
}
