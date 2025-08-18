
package packatesampleMethods;

public class constructor1 {
    public constructor1() {
        System.out.println("default");
    }

    public constructor1(int x, int y) {
        int z = x + y;
        System.out.println(z);
    }

    public static void main(String[] arg) {
        new constructor1();
        new constructor1(2, 3);
    }
}
