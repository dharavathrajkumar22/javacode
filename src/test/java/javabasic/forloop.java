//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package javabasic;

public class forloop {
    public static void main(String[] arg) {
        for(int i = 0; i < 5; ++i) {
            System.out.println("1st hello = i++  i value   " + i);
        }

        System.out.println("====================================================");

        for(int i = 0; i <= 5; ++i) {
            System.out.println("2nd hello  i=i+b  i value    " + i);
        }

        System.out.println("====================================================");

        for(int i = 0; i <= 5; ++i) {
            if (i >= 2) {
                System.out.println("3rd print hello = i value  " + i);
            } else {
                System.out.println("3d else block hit = i value    " + i);
            }
        }

        System.out.println("====================================================");
        int k = 2;

        for(int j = 0; j < 5; ++j) {
            switch (j + k) {
                case 0:
                    System.out.println("end of switch 0");
                    break;
                case 1:
                    System.out.println("end of switch 1");
                    break;
                case 2:
                    System.out.println("end of switch 2");
                    break;
                case 3:
                    System.out.println("end of switch 3");
                    break;
                case 4:
                    System.out.println("end of switch 4");
                    break;
                case 5:
                    System.out.println("end of switch 5");
                    break;
                case 6:
                    System.out.println("end of switch 6");
                    break;
                case 7:
                    System.out.println("end of switch 7");
                    break;
                default:
                    System.out.println("end of switch no hit match");
            }
        }

        System.out.println("=====================for / switch===============================");

        for(int i = 1; i <= 5; ++i) {
            System.out.println(i);
        }

        System.out.println("========================1 to 10 natural numbers============================");

        for(int i = 0; i <= 10; i += 2) {
            System.out.println(i);
        }

        System.out.println("========================even============================");

        for(int i = 1; i <= 10; i += 2) {
            System.out.println(i);
        }

        System.out.println("========================odd============================");

        for(int i = 10; i > 0; --i) {
            System.out.println(i);
        }

        System.out.println("========================reverse============================");

        for(int i = 0; i < 10; ++i) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("========================using if => even============================");

        for(int j = 0; j < 10; ++j) {
            if (j % 2 != 0) {
                System.out.println(j);
            }
        }

        System.out.println("========================using if => odd============================");
        int num = 5;

        for(int i = 1; i <= 10; ++i) {
            System.out.println(num + "*" + i + "=" + num * i);
        }

        System.out.println("========================table===========================");
        int first = 0;
        int second = 1;
        System.out.println(first);
        System.out.println(second);

        for(int i = 3; i <= 10; ++i) {
            int third = first + second;
            System.out.println(third);
            first = second;
            second = third;
        }

        System.out.println("========================fibonacci series ===========================");

        for(int a = 1; a <= 5; ++a) {
            for(int b = 1; b <= 5; ++b) {
                System.out.print("*\t");
            }

            System.out.println();
        }

        System.out.println("============star -> refer starprogram file===============");
        System.out.println("============given problem statement marked as ignore===============");
        System.out.println("============FIND OUT THE TOTAL NUMBERS WHICH ARE DIVISIBLE BY 17 B/W 1 AND 1000 AND GIVE ME THE SUM OF ALL THOSE NUMBERS B/W 1 AND 1000===============");
        int n = 17;
        int c = 0;
        int total = 0;

        for(int i = 0; i <= 1000; i += n) {
            System.out.println(i);
            ++c;
            total += i;
        }

        System.out.println("total count ->" + c + "  total values =" + total);
        System.out.println("====================================================");

        for(int ne = 1; ne <= 10; ++ne) {
            System.out.println("========table=======" + ne);

            for(int i = 1; i <= 10; ++i) {
                System.out.println(ne + "*" + i + "=" + ne * i);
            }
        }

        System.out.println("========================using table 1 to 10============================");
    }
}
