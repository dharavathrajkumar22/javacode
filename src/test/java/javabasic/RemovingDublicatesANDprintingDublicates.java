//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package javabasic;

public class RemovingDublicatesANDprintingDublicates {
    public static void main(String[] arg) {
        int[] array1 = new int[]{1, 3, 2, 4, 1, 2, 1};
        int[] unique = new int[array1.length];
        int[] duplicate = new int[array1.length];
        int uniquecount = 0;
        int duplicatecount = 0;

        for(int i = 0; i < array1.length; ++i) {
            boolean found = false;

            for(int j = 0; j < uniquecount; ++j) {
                if (array1[i] == unique[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                unique[uniquecount] = array1[i];
                ++uniquecount;
            } else {
                boolean duplicatefound = false;

                for(int k = 0; k < duplicatecount; ++k) {
                    if (array1[i] == duplicate[k]) {
                        duplicatefound = true;
                        break;
                    }
                }

                if (!duplicatefound) {
                    duplicate[duplicatecount] = array1[i];
                    ++duplicatecount;
                }
            }
        }

        System.out.println("unique values are");

        for(int l = 0; l < uniquecount; ++l) {
            System.out.println(unique[l] + " ");
        }

        System.out.println("duplicate values are");

        for(int m = 0; m < duplicatecount; ++m) {
            System.out.print(duplicate[m] + " ");
        }

    }
}
