package dersornek;

import java.util.Scanner;

//klavyede girilen stringteki sesli harfler haricindeki harfleri ekran yazdıran
public class ornek18 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        String s = k.nextLine();
        String sesli = "aAeEıIiİoOöÖuUüÜ";
        for (int i = 0; i <= s.length() - 1; i++) {
            boolean b = true;
            for (int j = 0; j < sesli.length() - 1; j++) {
                if (s.charAt(i) == sesli.charAt(j)) {
                    b = false;
                    break;
                }
            }
            if (b) {
                System.out.print(s.charAt(i));
            }
        }
    }
}
