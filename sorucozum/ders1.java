package sorucozum;

import java.util.Scanner;

//klavyeden girilen sayı kadar adınızı soy adınızı numaraınızı yazan program
public class ders1 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int num = 22525252 , sayi;
        System.out.println("sayı giriniz");
        sayi = k.nextInt();
        String isim = "ahmet" , soyisim = "bıyıklı";
        for (int i =0 ; i<sayi ; i++){
            System.out.println("isiminiz  "+isim);
            System.out.println("soyisiminiz" +soyisim);
            System.out.println("numaranız"+num);

        }

    }
}
