
package packatesampleMethods;

public class methodsusinggreaterthen3numbers {
    int max(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else {
            return b > c ? b : c;
        }
    }

    public static void main(String[] arg) {
        methodsusinggreaterthen3numbers ob = new methodsusinggreaterthen3numbers();
        int x = ob.max(6, 5, 1);
        System.out.println(x);
    }
}
