package patikacalisma;
// java ile iki sayının EBOB ve EKOK değerlerini bulan program yazıyoruz.
//EBOB : İki ya da daha fazla doğal sayının ortak bölenlerinin en büyüğüne bu sayıların
// en büyük ortak böleni, kısaca EBOB‘u denir.
//ÖRNEK: 18 ve 24 sayılarının en büyük ortak bölenini adım adım bulalım.
//18’in bölenleri : 1, 2, 3, 6, 9, 18
//24’ün bölenleri : 1, 2, 3, 4, 6, 8, 12, 24
//Bu ortak bölenlerin en büyüğü 6 sayısı EBOB’tur.
//EKOK : İki ya da daha fazla doğal sayının ortak katlarının en küçüğüne bu sayıların en küçük ortak katı, kısaca EKOK‘u denir.

import java.util.Scanner;

public class obebokek {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in) ;
        System.out.println("1. sayıyı giriniz");
        int n1 = k.nextInt();
        System.out.println("2. sayıyı giriniz");
        int n2 = k.nextInt();
        int ebob = 1 , ekok ;
        for(int i = 1 ; i<=n1 ; i++) {
            if(n1%i==0 && n2%i == 0){
                ebob = i ;
            }
        } for ( int j = n1 ; j>=1; j --) {
            if (n1%j == 0 && n2%j == 0){
                ebob =j ;
                break ;
            }

        }System.out.println("Sayının ebobu :" +" "+ ebob);

    }
}
