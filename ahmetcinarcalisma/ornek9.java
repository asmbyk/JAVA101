package ahmetcinarcalisma;

import java.util.Scanner;

public class ornek9 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        double toplam = 0;
        for (double i = 1; i <= 6; i++) {
            System.out.println("bir sayı giriniz");
            i = k.nextDouble();
            toplam = i + toplam;
        }
        System.out.println("sayıların toplamı :"+toplam);
        System.out.println("sayıların ortalaması "+toplam/6);

    }
}
