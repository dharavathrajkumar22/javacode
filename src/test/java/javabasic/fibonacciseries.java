//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package javabasic;

public class fibonacciseries {
    public static void main(String[] arg) {
        int first = 0;
        int second = 1;
        System.out.println(first);
        System.out.println(second);
        int count = 0;

        for(int i = 3; i <= 10; ++i) {
            int third = first + second;
            System.out.println(third);
            first = second;
            second = third;
            ++count;
        }

        System.out.println("value is  " + count);
        System.out.println("========================fibonacci series ===========================");
    }
}
