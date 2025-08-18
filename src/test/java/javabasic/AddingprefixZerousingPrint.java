package javabasic;

import java.util.Scanner;

public class AddingprefixZerousingPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===============ENTER NUMBER=================");

        for(int i = 0; i < 3; ++i) {
            String s1 = sc.next();
            int x = sc.nextInt();
            System.out.printf("%-10s%05d%n", s1, x);
        }

        System.out.println("================================");
    }
}