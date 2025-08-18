
package packatesampleMethods;

public class yearscountAssignment {
    public static void main(String[] args) {
        int count = 0;
        int[] a = new int[]{2017, 2019, 2020, 2024, 2024};

        for(int i = 2015; i < 2025; ++i) {
            for(int j = 0; j < a.length; ++j) {
                if (i == a[j]) {
                    System.out.println(i);
                    ++count;
                }
            }
        }

        System.out.println(count);
    }
}
