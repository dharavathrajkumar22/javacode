package javabasic;

class example {
    int j = 4;
    static int si = 2;

    void b() {
        System.out.println("Void b");
    }

    static void d() {
        System.out.println("Static Void d()");
    }

    public static void main(String[] args) {
        staticKeyword sk = new staticKeyword();
        staticKeyword sk1 = new staticKeyword();
        staticKeyword sk2 = new staticKeyword();
        ++sk.i;
        System.out.println(sk.i);
        System.out.println(sk1.i);
        System.out.println(sk2.i);
        sk.a();
        ++staticKeyword.ss;
        System.out.println(staticKeyword.ss);
        System.out.println(staticKeyword.ss);
        staticKeyword.c();
        example ex = new example();
        System.out.println(ex.j);
        ex.b();
        System.out.println(si);
        d();
    }
}
