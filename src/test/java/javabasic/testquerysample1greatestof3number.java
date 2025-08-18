//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package javabasic;

import java.util.Scanner;

public class testquerysample1greatestof3number {
    public static void main(String[] arg) {
        Scanner greatest = new Scanner(System.in);
        System.out.println("enter the number");
        int a = greatest.nextInt();
        int b = greatest.nextInt();
        int c = greatest.nextInt();
        if (a == 0 && b == 0 && c == 0) {
            System.out.println("invalid number");
        }

        if (a > b && a > c) {
            System.out.println("a is greater");
        }

        if (b > a && b > c) {
            System.out.println("b is greater");
        }

        if (c > a && c > b) {
            System.out.println("c is greater");
        } else {
            System.out.println("dd");
        }

    }
}
