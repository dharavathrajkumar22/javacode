//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package javabasic;

public class starsprogram {
    public static void main(String[] arg) {
        for(int a = 0; a < 5; ++a) {
            for(int b = 0; b < 5; ++b) {
                System.out.print("*\t");
            }

            System.out.println();
        }

        System.out.println("======================");

        for(int i = 0; i < 5; ++i) {
            for(int j = 0; j <= i; ++j) {
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.println("======================");

        for(int i = 5; i >= 0; --i) {
            for(int j = 0; j <= i; ++j) {
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.println("======================");

        for(int i = 1; i <= 5; ++i) {
            for(int j = i; j < 5; ++j) {
                System.out.print(" ");
            }

            for(int k = 1; k <= i; ++k) {
                System.out.print(" *");
            }

            System.out.println();
        }

        System.out.println("===================pyramid==========");

        for(int i = 5; i > 0; --i) {
            for(int j = i; j <= 5; ++j) {
                System.out.print(" ");
            }

            for(int k = 1; k <= i; ++k) {
                System.out.print(" *");
            }

            System.out.println();
        }

        System.out.println("===========reverece pyramid===========");

        for(int i = 1; i <= 5; ++i) {
            for(int j = i; j < 5; ++j) {
                System.out.print(" ");
            }

            for(int k = 1; k <= i; ++k) {
                System.out.print(" *");
            }

            System.out.println();
        }

        for(int i = 5; i > 0; --i) {
            for(int j = i; j <= 5; ++j) {
                System.out.print(" ");
            }

            for(int k = 1; k <= i; ++k) {
                System.out.print(" *");
            }

            System.out.println();
        }

        System.out.println("===========verify once again not correct===========");
    }
}
