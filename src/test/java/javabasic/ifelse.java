//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package javabasic;

import java.util.Scanner;

public class ifelse {
    private static final Scanner scanner;

    public static void main(String[] args) {
        System.out.println("enter the input");
        int N = scanner.nextInt();
        if (N % 2 != 0) {
            System.out.println(" Weird  ----> odd number found at first step");
        } else if (N >= 2 && N <= 5) {
            System.out.println("  Not Weird");
        } else if (N >= 6 && N <= 20) {
            System.out.println(" Weird");
        } else {
            System.out.println(" Not Weird");
        }

        scanner.close();
    }

    static {
        scanner = new Scanner(System.in);
    }
}
