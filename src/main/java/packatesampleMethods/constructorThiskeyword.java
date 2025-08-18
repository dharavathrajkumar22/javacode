
package packatesampleMethods;

public class constructorThiskeyword {
    int x;
    int y;
    int z;

    public constructorThiskeyword() {
        System.out.println("default");
    }

    public constructorThiskeyword(int x, int y) {
        this.x = x;
        this.y = y;
        this.z = x + y;
        System.out.println(this.z);
    }

    public void display() {
        System.out.println("hello " + this.x + " + " + this.y + " = " + this.z);
    }

    public static void main(String[] arg) {
        constructorThiskeyword ob = new constructorThiskeyword();
        constructorThiskeyword ob1 = new constructorThiskeyword(2, 3);
        ob.display();
        ob1.display();
    }
}
