package patikacalisma;

import java.util.Scanner;

public class kulanicisifreusername {
    public static void main(String[] args) {
        String sifre, user ;
        Scanner kalvye = new Scanner(System.in) ;
        System.out.println("Kullanıcı adınızı giriniz :");
        user = kalvye.nextLine();
        System.out.println("Sifrenizi giriniz");
        sifre = kalvye.nextLine();
        if (user.equals("java") && sifre.equals("java123")) {
            System.out.println("başarılı sekilde giriş yaptınız");
        }else {
            System.out.println("yanlış giridiniz:");
        }

    }
}
