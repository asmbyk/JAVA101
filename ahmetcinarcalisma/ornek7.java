package ahmetcinarcalisma;

import java.util.Scanner;

public class ornek7 {
    public static void main(String[] args) {

        Scanner k = new Scanner(System.in) ;
        String a ;

        for (int b =1 ; b<4 ; b++){
            System.out.println("lütfen "+(b)+"ismi giriniz");
            a= k.next();
            System.out.println(b+"isim"+a+"dir");
        }

    }
}
