//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package javabasic;

public class Removalofduplicatefrom2ARRAY {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 5, 6, 7, 6};
        int[] b = new int[]{1, 2, 5, 6, 8, 6};
        int[] combined = new int[a.length + b.length];
        int size = 0;

        for(int i = 0; i < a.length; ++i) {
            combined[size++] = a[i];
        }

        for(int i = 0; i < b.length; ++i) {
            combined[size++] = b[i];
        }

        System.out.print("Unique values: ");

        for(int i = 0; i < size; ++i) {
            boolean isDuplicate = false;

            for(int j = 0; j < i; ++j) {
                if (combined[i] == combined[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                System.out.print(combined[i] + " ");
            }
        }

    }
}
