package dersornek;

import java.util.Scanner;

// klavyeden girilen a üstü b hesaplayan
public class ornek1 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int a = k.nextInt();
        System.out.println("bir sayı giriniz");
        int b = k.nextInt();
        int ust = 1 ;
        for (int i = 1 ; i<=b ; i++){
            ust = a* ust;
        }
        System.out.println(ust);
    }
}
