//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package javabasic;

import java.util.Scanner;

public class testquerysample1evenodd {
    public static void main(String[] arg) {
        Scanner evenodd = new Scanner(System.in);
        System.out.println("enter number");
        int num = evenodd.nextInt();
        if (num % 2 == 0) {
            System.out.println("primary");
        }

        if (num % 2 != 0) {
            System.out.println("odd");
        }

        evenodd.close();
    }
}
