//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package javabasic;

public class primenumber {
    public static void main(String[] arg) {
        System.out.println("Prime numbers between 1 and 100 are:");
        int n = 100;

        for(int i = 2; i <= n; ++i) {
            int count = 0;

            for(int j = 1; j <= n; ++j) {
                if (i % j == 0) {
                    ++count;
                }
            }

            if (count == 2) {
                System.out.println(i);
            }
        }

    }
}
