//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package javabasic;

public class test {
    public static void main(String[] arg) {
        int i = 0;
        int b = 1;
        int d = 0;
        System.out.println(i);
        System.out.println(b);

        for(int j = 3; j < 10; ++j) {
            int c = i + b;
            System.out.println(c);
            i = b;
            b = c;
            ++d;
        }

        System.out.println("total count " + d);
    }
}
