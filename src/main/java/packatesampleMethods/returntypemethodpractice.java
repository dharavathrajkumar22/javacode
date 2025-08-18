
package packatesampleMethods;

public class returntypemethodpractice {
    int b() {
        System.out.println(45);
        return 55;
    }

    int c(int x) {
        for(int i = 2; i <= x; ++i) {
            int count = 0;

            for(int j = 1; j <= i; ++j) {
                if (i % j == 0) {
                    ++count;
                }
            }

            if (count == 2) {
                System.out.println(i);
            }
        }

        return 2;
    }

    public static void main(String[] arg) {
        returntypemethodpractice ob = new returntypemethodpractice();
        int x = ob.b();
        System.out.println("return x value " + x);
        int y = ob.c(5);
        System.out.println("return y value " + y);
    }
}
