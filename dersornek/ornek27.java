package dersornek;

import java.util.Scanner;

//klavyeden girilen girilen cümlede kaç kelime olduğunu bulan
public class ornek27 {
    public static void main(String[] args) {
        int sayac =1 ;
        Scanner k = new Scanner(System.in);
        String a = k.nextLine();
        for(int i =0; i<a.length();i++){
            if(a.charAt(i) ==' '){
                sayac++;
            }
        } System.out.println(sayac);
    }
}
