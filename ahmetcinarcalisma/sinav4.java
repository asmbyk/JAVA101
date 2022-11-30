package ahmetcinarcalisma;

import java.util.Scanner;

// klavyeden 5 ögrenci sırasıyla  1 vize ,2 vize ve final notlaını okıyacak  3 notun ortalamsı 50 büyükse
// ekrana  bu ögrenci geçti degilse kaldı yazılacak
public class sinav4 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in) ;
        double a , b = 0;
        for (int i = 0 ; i<5 ; i ++) {
            System.out.println("notunuzu giriniz:");
            a = k.nextDouble();
            b = a/3+ b;


        }
        if (b >50 ) {
            System.out.println(" sınıfı geçti ");
        }else {
            System.out.println(" ögrenci kaldı ");
        }

    }
}
