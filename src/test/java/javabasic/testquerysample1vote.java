package javabasic;

import java.util.Scanner;

public class testquerysample1vote {
    public static void main(String[] arg) {
        Scanner hold = new Scanner(System.in);
        System.out.println("enter age");
        int age = hold.nextInt();
        if (age >= 18 && age <= 100) {
            System.out.println("has rights to vote");
        } else {
            System.out.println("not allowed to vote at offline");
        }

        if (age > 100) {
            System.out.println("as per gov permission they can vote it from online");
        }

        hold.close();
        System.out.println("come next");
    }
}
