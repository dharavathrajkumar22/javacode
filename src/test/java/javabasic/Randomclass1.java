package javabasic;

import java.util.Random;

public class Randomclass1 {
    public static void main(String[] args) {
        String s = "abcABC123";
        Random ob = new Random();

        for(int i = 0; i < 20; ++i) {
            int c = ob.nextInt(s.length());
            System.out.println(s.charAt(c));
        }

    }
}
