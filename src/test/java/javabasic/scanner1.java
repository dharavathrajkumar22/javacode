//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package javabasic;

import java.util.Scanner;

public class scanner1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("how many values do ypu wan to print enter?");
        int x = scan.nextInt();
        if (x > 5) {
            System.out.println("you can only enter up to 5 values.");
            System.out.println("please try again");
        } else {
            String[] arr = new String[x];

            for(int i = 0; i < x; ++i) {
                arr[i] = scan.next();
            }

            for(int i = 0; i < x; ++i) {
                System.out.println("Enter value " + (i + 1) + ": " + arr[i]);
            }

            System.out.print("\nAll values in one line: ");

            for(int i = 0; i < x; ++i) {
                System.out.println(arr[i] + " ");
            }
        }

    }
}
