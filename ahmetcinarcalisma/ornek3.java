package ahmetcinarcalisma;

import java.util.Scanner;

public class ornek3 {
    public static void main(String[] args) {

            Scanner k = new Scanner(System.in);
            char ba = k.next().charAt(0); //Karakter okuma
            if ('a'==ba ||'A'== ba){
                System.out.println("girilen karakter a yada A dır");
            }else {
                System.out.println("girilen karakter a yada A degildir");
            }
    }
}
