
package packatesampleMethods;

public class commonLetterFromStringusingForloop {
    public static void main(String[] arg) {
        char j = 'l';
        int count = 0;
        char[] array = new char[]{'h', 'e', 'l', 'l', 'o'};

        for(int i = 0; i < array.length; ++i) {
            if (array[i] == 'l') {
                ++count;
            }
        }

        System.out.println(" L values count are  '" + count);
        System.out.println("==========================");
    }
}
