package patikacalisma;

import java.util.Scanner;

public class hesapmakinesi {
    public static void main(String[] args) {
        double a, b ,sec;
        Scanner kalvye = new Scanner(System.in);
        System.out.println("Bir sayı giriniz :");
        a= kalvye.nextDouble();
        System.out.println("Girilecek ikinci sayıyı giriniz");
        b= kalvye.nextDouble();
        System.out.println("1.toplama\n2-cıkartma\n3-bölme\n4-carpma");
        System.out.println("seciniz:");
        sec = kalvye.nextDouble();
        if (sec ==1){
            System.out.println("toplam"+(a+b));
        } else if (sec ==2) {
            System.out.println("cıkartma"+(a-b));
        } else if (sec==3) {
            System.out.println("bölme"+(a/b));
        } else if (sec==4) {
            System.out.println("carpma" +(a*b));
        }else {
            System.out.println("yanlıs secim yaptınız :");
        }


    }
}
