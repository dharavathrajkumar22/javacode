//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package javabasic;

class letterfindinginSTRING {
    public static void main(String[] args) {
        char[] s = new char[]{'c', 'd', 'c'};
        int count = 0;

        for(int i = 0; i < s.length; ++i) {
            if (s[i] == 'c') {
                ++count;
            }
        }

        System.out.println(count);
        System.out.println("=========================");
        char[] s1 = new char[]{'a', 'r', 'm', 'a', 'n', 'a'};
        int count1 = 0;

        for(int i = 0; i < s1.length; ++i) {
            if (s1[i] == 'a') {
                ++count1;
                System.out.println(s1[i]);
            }
        }

        System.out.println(count1);
        System.out.println("==============================");
        String s2 = "armana a";
        int count2 = 0;

        for(int i = 0; i < s2.length(); ++i) {
            if (s2.charAt(i) == 'a') {
                ++count2;
                System.out.println(s2.charAt(i));
            }
        }

        System.out.println(count2);
    }
}
