package javacalisma;

import java.util.Scanner;

//Java döngüler ile negatif bir değer girilene kadar kullanıcıdan girişleri kabul eden
// ve girilen değerlerden tek sayıları toplayıp ekrana basan programı yazıyoruz.
public class patika3 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int a , toplam = 0 ;
        for (;;){
            System.out.println("bir sayı giriniz");
            a =k.nextInt();
            if(a>0){
                if (a%2==1){
                    toplam = a + toplam ;
            }
            }
            else{
                break;
            }
        }
        System.out.println(toplam);
    }
}
