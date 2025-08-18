//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package javabasic;

import java.util.HashSet;

public class hashset {
    public static void main(String[] args) {
        HashSet<Float> hs = new HashSet();
        hs.add(1.2F);
        hs.add(1.2F);
        hs.add(0.55F);
        hs.add(1.1097F);
        hs.add(2.3F);
        hs.add(0.009F);
        hs.add(null);
        System.out.println(hs);
        System.out.println(hs.size());
        System.out.println(hs.isEmpty());
        System.out.println(hs.contains(9.5F));
        hs.remove(0.009F);
        System.out.println("after removed element in hash set");
        System.out.println(hs);

        for(Float a : hs) {
            System.out.println(a);
        }

    }
}
