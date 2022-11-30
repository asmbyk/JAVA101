package sorucozum;

import java.util.Scanner;

// klavyeden girilen sayılardan  5 olanları ekrana yazan  10 kezyazılınca duran program
public class ders3 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int x ,sayac =0;
        while (sayac<10) {
            x=k.nextInt();
            if (x==5){
                sayac++;
            }
        }

        }
    }

