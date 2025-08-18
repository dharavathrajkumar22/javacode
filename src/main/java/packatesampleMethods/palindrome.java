
package packatesampleMethods;

public class palindrome {
    String str = "BAAB";
    String string2 = "";
    String string1 = "";

    void secondmethodforpalindrome() {
        String str1 = "";
        String str2 = "";
        System.out.println(" 2nd method for palindrome");
        System.out.println("1st string ");

        for(int i = 0; i < this.str.length(); ++i) {
            str1 = str1 + this.str.charAt(i);
            System.out.print(this.str.charAt(i));
        }

        System.out.println("\n 2nd string ");

        for(int j = this.str.length() - 1; j >= 0; --j) {
            str2 = str2 + this.str.charAt(j);
            System.out.print(this.str.charAt(j));
        }

        if (str1.equals(str2)) {
            System.out.println("-----its palindrome");
        } else {
            System.out.println("-----not palindrome");
        }

        System.out.println("=================below code by using menthod=========================");
    }

    void firststring() {
        String string1 = "";
        System.out.println("firststring method printing -> 1st string ");

        for(int i = 0; i < this.str.length(); ++i) {
            string1 = string1 + this.str.charAt(i);
            System.out.print(this.str.charAt(i));
        }

    }

    void secondstring() {
        String string2 = "";
        System.out.println("\nsecondstring method printing -> 2nd string ");

        for(int j = this.str.length() - 1; j >= 0; --j) {
            string2 = string2 + this.str.charAt(j);
            System.out.print(this.str.charAt(j));
        }

    }

    void thirdstring() {
        if (this.string1.equals(this.string2)) {
            System.out.println(" ====> its paralldrom");
        } else {
            System.out.println("====> not a paralleldrom");
        }

    }

    public static void main(String[] args) {
        palindrome ob = new palindrome();
        ob.secondmethodforpalindrome();
        ob.firststring();
        ob.secondstring();
        ob.thirdstring();
    }
}
