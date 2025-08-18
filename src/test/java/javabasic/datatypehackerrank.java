package javabasic;

import java.util.Scanner;

class datatypehackerrank {
    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 0; i < t; ++i) {
            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                if (x >= -128L && x <= 127L) {
                    System.out.println("* byte");
                }

                if (x >= -32768L && x <= 32767L) {
                    System.out.println("* short");
                }

                if (x >= -2147483647L && x <= 2147483647L) {
                    System.out.println("* int");
                }

                if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE) {
                    System.out.println("* long");
                }
            } catch (Exception var6) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }

    }
}
