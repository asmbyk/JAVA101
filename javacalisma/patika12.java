package javacalisma;

import java.util.Scanner;

//Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan ve sayı mükemmel sayı ise ekrana
// “mükemmel sayıdır.” değilse “mükemmel sayı değildir.”
// ifadelerini ekrana yazan programı Java dilinde yazınız
public class patika12 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int a , bol =0;
        System.out.println("sayı giriniz");
        a= k.nextInt();
        for ( int i =1 ;i<a ; i++) {
            if (a%i ==0){
                bol = i + bol;
            }
        }if (a == bol ){
            System.out.println("sayı mühenmel sayıdır");
        }else {

            System.out.println("sayı mühenmel sayı degildri");
        }

    }
}
