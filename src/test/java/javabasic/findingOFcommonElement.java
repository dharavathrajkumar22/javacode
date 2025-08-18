//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package javabasic;

public class findingOFcommonElement {
    public static void main(String[] arg) {
        int[] a = new int[]{1, 2, 3, 4, 5, 10, 11};
        int[] b = new int[]{2, 4, 6, 8, 10};
        int count = 0;

        for(int i = 0; i < a.length; ++i) {
            for(int j = 0; j < b.length; ++j) {
                if (a[i] == b[j]) {
                    System.out.println("common element found  " + a[i]);
                    ++count;
                }
            }
        }

        System.out.println("total count of value are " + count);
        System.out.println("==============================================");
        System.out.println("=====================removes dublicates=========================");
        char[] ch = new char[]{'s', 'w', 'a', 't', 'h', 'i', 'k', 'k'};
        char[] ch1 = new char[]{'s', 'k', 'a', 't', 'h', 'i', 'r', 'a', 'j', 'k'};
        char[] dublicate = new char[10];
        int count1 = 0;

        for(int i = 0; i < ch.length; ++i) {
            for(int j = 0; j < ch1.length; ++j) {
                if (ch[i] == ch1[j]) {
                    int found = 0;

                    for(int k = 0; k < count1; ++k) {
                        if (dublicate[k] == ch[i]) {
                            found = 1;
                            break;
                        }
                    }

                    if (found == 0) {
                        dublicate[count1] = ch[i];
                        ++count1;
                    }
                    break;
                }
            }
        }

        for(int k = 0; k < count1; ++k) {
            System.out.print(dublicate[k]);
        }

    }
}
