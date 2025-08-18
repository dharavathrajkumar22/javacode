package javabasic;

import java.util.Scanner;

public class ATM {
    public static void main(String[] arg) {
        Scanner CARD = new Scanner(System.in);
        System.out.println("what card");
        String s = CARD.next().toLowerCase();
        System.out.println("amount");
        int amount = CARD.nextInt();
        if (amount <= 0) {
            System.out.println("you entered invalid amount");
        } else {
            if (amount <= 1000 && s.equals("hdfc")) {
                System.out.println("it is an hdfc card");
                double discount = (double)amount * 0.1;
                double total = (double)amount - discount;
                System.out.println("total discount is --> " + discount);
                System.out.println("total amount is" + total);
            } else if (amount >= 2000 && s.equals("axis")) {
                System.out.println("it yes axis");
                double discount = (double)amount * 0.1;
                double total = (double)amount - discount;
                System.out.println("total discount is" + discount);
                System.out.println("total amount is" + total);
            } else {
                System.out.println("dont have any offer on this card for entered amount");
            }

            CARD.close();
        }
    }
}
