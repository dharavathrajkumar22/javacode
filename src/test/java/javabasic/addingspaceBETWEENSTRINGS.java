package javabasic;

public class addingspaceBETWEENSTRINGS {
    public static void main(String[] args) {
        String a = "sasurubuguhujukuluiuou";
        int count = 0;

        for(int j = 0; j < a.length(); ++j) {
            count = j + 1;
            System.out.println(a.charAt(j));
            if (count % 2 == 0) {
                System.out.println(' ');
            }
        }

    }
}