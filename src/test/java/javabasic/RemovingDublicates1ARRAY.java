//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package javabasic;

public class RemovingDublicates1ARRAY {
    public static void main(String[] arg) {
        int[] array = new int[]{1, 2, 1, 3, 2, 4, 1};
        int[] uniquearray = new int[array.length];
        int count = 0;

        for(int i = 0; i < array.length; ++i) {
            boolean dublicatefound = false;

            for(int j = 0; j < count; ++j) {
                if (array[i] == uniquearray[j]) {
                    dublicatefound = true;
                    break;
                }
            }

            if (!dublicatefound) {
                uniquearray[count] = array[i];
                ++count;
            }
        }

        System.out.println("after removing dublicates ");

        for(int k = 0; k < count; ++k) {
            System.out.println(uniquearray[k]);
        }

    }
}
