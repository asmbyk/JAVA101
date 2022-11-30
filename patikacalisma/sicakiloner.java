package patikacalisma;

import java.util.Scanner;

public class sicakiloner {
    public static void main(String[] args) {
        double hava ;
        System.out.println("merhabalar hava durumu ile öneri programına hoşgeldiniz");
        Scanner klav = new Scanner(System.in);
        System.out.println("hava sıcaklıgını giriniz :");
        hava = klav.nextDouble();
        if (hava<5 ){
            System.out.println("kayak yapmanızı öneririz");
        } else if ( hava >= 5 && hava < 15){
            System.out.println("sinemaya gitmenizi öneririz");
        } else if ( hava >= 15 && hava < 25) {
            System.out.println("piknik gitmenizi öneririz");
        }else if ( hava > 25 ) {
            System.out.println("yüzme gitmenizi öneririz");
        }
    }
}
