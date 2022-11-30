package sorucozum;

import java.util.Scanner;

public class DERS8 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in) ;
        double a = k.nextInt();
        double totel =1, sayac=1 ;
        for (int i= 1 ; i<=a ; i ++){
            totel = a*totel;
            sayac++;
            totel = totel * sayac ;
        }
        System.out.println(totel/sayac);
    }

}
