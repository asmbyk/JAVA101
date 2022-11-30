package dersornek;

import java.util.Scanner;

//s8- klavyeden girilen iki stringte yerleri aynı olan karakterleri ekrana yazdırmak
public class ornek11 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        String a = k.nextLine();
        String b = k.nextLine();
        int boy1 = a.length();
        int boy2 = b.length();
        int deger;
        if (boy1 < boy2) {
            deger = boy1;
        } else {
            deger = boy2;
        }
        for (int i = 0; i < deger; i++) {
            if (a.charAt(i) == b.charAt(i)) {
                System.out.println(a.charAt(i));
            }
        }
    }
}
