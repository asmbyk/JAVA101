package patikacalisma;

import java.util.Scanner;

public class uslusayi {
    public static void main(String[] args) {
        //Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı yazıyoruz.
        int a , b , totel = 1 ;
        Scanner k = new Scanner(System.in) ;
        System.out.println("ÜStünü almak istediginiz sayıyı giriniz :");
        a = k.nextInt();
        System.out.println("giridiginiz sayının üstünü giriniz:");
        b= k.nextInt();
        for (int i= 1 ; i<=a ; i ++){
            totel = b*totel;
        } System.out.println("ilem sonucu "+totel);
    }
}
