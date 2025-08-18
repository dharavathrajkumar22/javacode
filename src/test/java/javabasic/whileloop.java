package javabasic;

public class whileloop {
    public static void main(String[] arg) {
        for(int i = 1; i <= 10; ++i) {
            System.out.println(i);
        }

        System.out.println("=========`1 to 10 values natural number==========");
        int k = 1;

        for(int j = 1; j <= 10; ++j) {
            System.out.println(k + "*" + j + "=" + k * j);
        }

        System.out.println("======== 1 table===========");
        int a = 1;

        while(a <= 10) {
            System.out.println("table for\t" + a);

            for(int b = 1; b <= 10; ++b) {
                System.out.println(a + "*" + b + "=" + a * b + "\t");
            }

            ++a;
            System.out.println();
        }

        System.out.println("======== 1 to 10 table===========");
    }
}
