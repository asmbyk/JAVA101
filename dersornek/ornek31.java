package dersornek;

import java.util.Scanner;

//klavyeden girilen 20 adet string içindeki ilk karakterleri a ve son karakterleri z olanları ekrana yazan
public class ornek31 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        for (int i = 1; i <= 20; i++) {
            String a = k.nextLine();
            char a1 = a.charAt(0);
            char a2 = a.charAt(a.length() - 1);
            if (a1=='a'|| a1=='A' && a2 =='z'|| a2 =='Z')
                System.out.println(a);
        }
    }
}
