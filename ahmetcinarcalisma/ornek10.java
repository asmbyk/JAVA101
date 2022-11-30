package ahmetcinarcalisma;

import java.util.Scanner;

public class ornek10 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        String s ;
        int sayac = 0 ;
        for (int i = 0 ; i<6 ; i++ ){
            s = k.nextLine();
            if (s.charAt(s.length()-1)== 'z' || s.charAt(s.length()-1)=='Z') {
                System.out.println(s);
                sayac ++ ;
            }

        } System.out.println(sayac+ "z ve Z harflari vardır.");
    }
}
