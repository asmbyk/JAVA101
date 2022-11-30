package dersornek;

import java.util.Scanner;

//saatte ortalama 60km yol giden aracın klavyeden girilecek mesafeyi kaç saatte gideceğini hesaplayan program
public class ornek43 {
    public static void main(String[] args) {
        Scanner K = new Scanner(System.in);
        double a = K.nextInt(), c ;
        c =a/60;
        System.out.println(a+ "mesefayi ortalama "+ c +"sürde gider");
    }
}
