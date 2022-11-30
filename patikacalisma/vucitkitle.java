package patikacalisma;

import java.util.Scanner;

public class vucitkitle {
    public static void main(String[] args) {
       double boy , kitle ,index ;
       Scanner klavye = new Scanner(System.in);
       System.out.println("Boyunuzu giribi :");
       boy = klavye.nextDouble();
        System.out.print("kilonuzu giriniz :");
        kitle = klavye.nextDouble();
        index = kitle / boy * boy ;
        System.out.println("Vücut endeksiniz" + index);






    }
}
