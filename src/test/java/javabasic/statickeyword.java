package javabasic;

class staticKeyword {
    int i = 5; //Instance Variable
    static int ss = 3;
    void a(){
        System.out.println("Void a");
    }

    static void c(){
        System.out.println("Static void c()");
    }

    static{
        System.out.println("Static Block");
    }

    public static void main(String[] args) {
        staticKeyword sk = new staticKeyword();
        staticKeyword sk1 = new staticKeyword();
        staticKeyword sk2 = new staticKeyword();
        sk.i++;
        System.out.println(sk.i);
        System.out.println(sk1.i);
        System.out.println(sk2.i);
        sk.a();
        staticKeyword.ss++;
        System.out.println(staticKeyword.ss);
        System.out.println(staticKeyword.ss);
        staticKeyword.c();
        example ex = new example();
        System.out.println(ex.j);
        ex.b();
        System.out.println(example.si);
        example.d();
    }
}

class example{
    int j=4;
    static int si = 2;

    void b(){
        System.out.println("Void b");
    }

    static void d(){
        System.out.println("Static Void d()");
    }
}

/*
static can be used for variables, methods, blocks & classes.
 */