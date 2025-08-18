package javabasic;

public class uniquearray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 4, 2, 3, 1, 5};
        System.out.println("Unique elements:");

        for(int i = 0; i < arr.length; ++i) {
            boolean isUnique = true;

            for(int j = 0; j < arr.length; ++j) {
                if (i != j && arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                System.out.println(arr[i]);
            }
        }

    }
}
