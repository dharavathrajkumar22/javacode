//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package packatesampleMethods;

import java.util.ArrayList;

public class BankMethod {
    String transactiontype;
    int lasttransaction;
    int currentamount = 1000;
    ArrayList<String> transactionhistory = new ArrayList();

    public static void greeting() {
        System.out.println("hello user___welcome ");
        System.out.println(" ==================greating message=======================");
    }

    void deposit(int x) {
        System.out.println("your total current balance amount " + this.currentamount);
        if (x > 10000) {
            System.out.println("please enter the amount lessthen 10,000");
            System.out.println(" ==================warning message 10,000=======================");
        } else {
            this.currentamount += x;
            this.lasttransaction = x;
            this.transactiontype = "deposit";
            this.transactionhistory.add("Deposited ₹" + x);
            System.out.println("your deposit has done for " + x);
            System.out.println("your current amount after deposit : " + this.currentamount);
            System.out.println(" ==================deposit=======================");
        }

    }

    int withdral(int y) {
        System.out.println("your total current amount " + this.currentamount);
        this.currentamount -= y;
        this.lasttransaction = y;
        this.transactiontype = "withdral";
        if (this.currentamount == 0) {
            System.out.println(" ========== Transaction failed - Insuffecent balance==========");
        } else {
            System.out.println("your withdrawn has done for " + y);
            System.out.println("your current balance after withdrawal " + this.currentamount);
            System.out.println(" =================withdrawl========================");
            this.transactionhistory.add("withdral ₹" + y);
        }

        return this.currentamount;
    }

    int balanceEnquary() {
        return this.currentamount;
    }

    void minisatement() {
        if (this.transactionhistory.isEmpty()) {
            System.out.println("No transaction has been done yet.");
        } else {
            int count = 0;

            for(String entry : this.transactionhistory) {
                ++count;
                System.out.println(count + " " + entry);
            }
        }

        System.out.println("==================================");
    }

    public static void main(String[] arg) {
        BankMethod ob = new BankMethod();
        greeting();
        ob.minisatement();
        ob.deposit(500);
        ob.withdral(1000);
        ob.deposit(100);
        int i = ob.withdral(200);
        System.out.println("i object withdeal" + i);
        int j = ob.balanceEnquary();
        System.out.println("Balance enqueary : your total amount   " + j);
        System.out.println(" ===================balanceEnqueary======================");
        ob.withdral(300);
        ob.minisatement();
        ob.deposit(11000);
    }
}
