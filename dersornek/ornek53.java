package dersornek;

import java.util.Scanner;

//klavyeden girilen sayılardan cift olanları ekrana yazan ve bunların ortlaamsını bulan 999 yazılınca duran program .
public class ornek53 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        double sayac= -1 , toplam =0;
        for(;;){
            System.out.println("sayı giriniz");
            double a = k.nextInt();
            toplam = (a+ toplam) ;
            sayac ++ ;
            if(a== 999){
                System.out.println((toplam-999)/sayac);
            }
        }

    }
}
