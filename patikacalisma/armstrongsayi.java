package patikacalisma;

import java.util.Scanner;

public class armstrongsayi {
    public static void main(String[] args) {
        //Java ile girilen sayının harmonik serisini bulan program yazacağız.
        int n;
        double a = 0.0;
        Scanner k = new Scanner(System.in);
        System.out.println("Harmonig serisini bulan program için sayınızı giriniz");
        n = k.nextInt();
        for (int i = 1; i <= n; i++) {
            a = (1.0/i)+a; // veya 1 al double for aç
        } System.out.println("sonucuz:"+ a);
    }
}
