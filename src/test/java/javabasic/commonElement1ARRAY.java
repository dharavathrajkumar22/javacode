package javabasic;

public class commonElement1ARRAY {
    public static void main(String[] arg) {
        int[] arr1 = new int[]{1, 3, 4, 5, 2, 1};

        for(int i = 0; i < arr1.length; ++i) {
            for(int j = i + 1; j < arr1.length; ++j) {
                if (arr1[i] == arr1[j]) {
                    System.out.println(arr1[i]);
                }
            }
        }

    }
}
