package ahmetcinarcalisma;

import java.util.Scanner;

public class ornek5 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);

        int s ;
        System.out.println("lütfen 1-4 arsı sayı seciniz");
        s = k.nextInt();
        switch (s) {
            case 1 :
                System.out.println("bir"); break ;
            case 2 :
                System.out.println("ıkı"); break ;
            case 3 :
                System.out.println("uc ");break;
            case 4 :
                System.out.println("dort"); break;
            default:
                System.out.println("1 ile 4 arası sevim yapmadınız");
        }
    }
}
