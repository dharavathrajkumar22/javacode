//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package javabasic;

import java.util.Scanner;

public class ifcondition {
    public static void main(String[] arg) {
        Scanner wow = new Scanner(System.in);
        System.out.println("enter A and B and C value");
        int a = wow.nextInt();
        int b = wow.nextInt();
        int c = wow.nextInt();
        if (a > b) {
            System.out.println("a is lessthen");
        } else {
            System.out.println("step 1 --> A is lesser tehn B so its failed");
        }

        if (b == c) {
            System.out.println("b==c both are same");
        } else {
            System.out.println("b==c both are not equal");
        }

        if (a != b) {
            System.out.println("a!=b yes not equal");
        }

        if (a + b != c) {
            System.out.println("a!=b yes  equal ");
        }

        if (a < b || c < a) {
            System.out.println("print || OR operator 1<2 true,3<1 false so, it should be pass ");
        }

        if (a < b && c < a) {
            System.out.println("print && ");
        } else {
            System.out.println("any 1 statement is failed ");
        }

    }
}
