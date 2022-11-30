package javacalisma;

import java.util.Scanner;
//Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı yazıyoruz.
public class pratik8 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("sayınızı giriniz");
        int a = k.nextInt();
        System.out.println("üst sayınızı giriniz");
        int b = k.nextInt();
        int totel=a ;
        for (int i = 1 ;i<b; i++){
            totel = a*totel;
        }
        System.out.println(totel);

    }
}
