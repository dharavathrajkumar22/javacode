

package packatesampleMethods;

public class assignmentonSTRING {
    void a() {
        int count = 0;
        String str = "Pune, Hyderabad, puNE, Chennai, mumbai, Mumbai, Bengaluru, beNGaLUru";
        String[] city = str.trim().toLowerCase().split(",");

        for(int i = 0; i < city.length; ++i) {
        }

        for(String s : city) {
            System.out.println(s.trim() + " ");
        }

    }

    public static void main(String[] arg) {
        assignmentonSTRING ob = new assignmentonSTRING();
        ob.a();
    }
}
