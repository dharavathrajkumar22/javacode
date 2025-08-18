
package packatesampleMethods;

public class voidmethods {
    void primenumber(int x) {
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

    }

    void evenorodd(int y) {
        if (y % 2 == 0) {
            System.out.println("primenumber //1 parameter method");
        } else {
            System.out.println("odd number //1 parameter method");
        }

    }

    void boolean1(int z) {
        boolean b = true;
        if (z > 5) {
            System.out.println("true");
            b = false;
        }

        if (b) {
            System.out.println("false");
        }

    }

    public static void main(String[] arg) {
        voidmethods ob = new voidmethods();
        ob.primenumber(5);
        ob.evenorodd(9);
        ob.boolean1(4);
    }
}
