package javabasic;

public class breakandcontinue {
    public static void main(String[] arg) {
        for(int i = 1; i <= 5; ++i) {
            System.out.println(i);
        }

        System.out.println("====== 1 to 5=======");
        int i = 1;
        if (i <= 5) {
            System.out.println(i);
        }

        System.out.println("======1 loop execution=======");

        for(int f = 1; f <= 5; ++f) {
            System.out.println(f);
            if (f == 3) {
                break;
            }
        }

        System.out.println("======break=======");

        for(int a = 1; a <= 5; ++a) {
            if (a != 3) {
                System.out.println(a);
            }
        }

        System.out.println("======continue=======");

        for(int a = 1; a <= 5; ++a) {
            if (a != 2) {
                if (a == 4) {
                    break;
                }

                System.out.println(a);
            }
        }

        System.out.println("======continue and break=======");
        System.out.println("======Assignment 2=======");
        System.out.println("===if out list of all the primenumber which are divisible by 1 to 1000 and how many are divible by 5 =====");
        System.out.println("====start of program ===========================================");
        System.out.println(" prime number between 1 to 1000 are + // divides by 1 and itself only");
        int n=1000;
        int pcount=0;
        for(int a = 1; a <= n; ++a) {// it's for divides by 1 - no if code because no logic in it evry number will get divisible by 1
        //if(a%1==0) {
       // }
            int count=0;
            for(int b = 1; b <= a; ++b) {
            if (a % b == 0) {
                ++count;
            }
        }if(count==2){
                System.out.print(a+ " ");
                pcount++;
                // its for count values why here because we are print count==2 condition
            } }
        System.out.println("\n total number of prime numbers " + pcount);
        System.out.println("=========================================================");
        System.out.println("\n========total prime number between 1 to 1000 are==========="+ pcount);
        System.out.println(" ==prime number divisible by 5 number== ");
         int m=1000;
         int count1 =0;
        for(int k = 2; k <= m; ++k) {
            int count=0;
            for(int l = 1; l <= k; ++l) {
            if (k % l == 0) {
                ++count;
            }}
            if(count==2) {
                if(k%5==0){  // dividing with 5 with all prime numbers k
                    System.out.println("\n"+ k + "==> this number is divisible  ");
                    count1++;
            }
                System.out.print(k+ " ");
            }}
        System.out.println("\n total number divisible by 5 is  ==> "+ count1 );

    }
}
