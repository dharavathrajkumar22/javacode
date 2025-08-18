//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package javabasic;

public class exception1 {
    void aa() {
        int a = 5;
        int b = 0;

        try {
            System.out.println(a / b);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("final block");
        }

        System.out.println("my name exception");
    }

    public static void main(String[] args) throws ArithmeticException {
        exception1 ob = new exception1();
        ob.aa();
    }
}
