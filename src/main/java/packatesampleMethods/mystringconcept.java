

package packatesampleMethods;

public class mystringconcept {
    void countthenumberofcaracterinstring() {
        System.out.println(" =========== its using void menthod =========");
        String str = "JAVA IS SUPER";
        int count = 0;

        for(int i = 0; i < str.length(); ++i) {
            ++count;
        }

        System.out.println("using function " + count);
        System.out.println("using string method " + str.length());
    }

    int usingintcCountthenumberofcaracterinstring() {
        String returnstr = " helloworld cool it";
        int returncount = 0;

        for(int i = 0; i < returnstr.length(); ++i) {
            ++returncount;
        }

        System.out.println("count of string using function in int(retuentyoe) menthod " + returncount);
        return returncount;
    }

    void countingofcommonvalueinstring() {
        String str = "hello world";
        int count = 0;

        for(int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) == 'l') {
                ++count;
            }

            System.out.print(str.charAt(i));
        }

        System.out.println("\n total count of L value are " + count);
    }

    void removespaces() {
        String str = "    removespaces program using trim - its a string  ";
        String aa = str.trim();
        System.out.println("removing space at start and end  ========= output=>" + aa);
    }

    void reverseofEACHwordOFSTRING() {
        System.out.println("===================reverseofEACHwordOFSTRING==============");
        String str = "hello world end ";
        int count = 0;

        for(int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) == ' ') {
                for(int j = i - 1; j >= count; --j) {
                    System.out.print(str.charAt(j));
                }

                System.out.print(" ");
                count = i + 1;
            }
        }

    }

    public static void main(String[] arg) {
        mystringconcept ob = new mystringconcept();
        ob.countthenumberofcaracterinstring();
        ob.usingintcCountthenumberofcaracterinstring();
        ob.countingofcommonvalueinstring();
        ob.removespaces();
        ob.reverseofEACHwordOFSTRING();
    }
}
