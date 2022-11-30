package dersornek;

import java.util.Scanner;

//klavyeden girilen stringler
// içinde karakter sayısı 5 ve 5 ten büyük olan stringleri ekrana yazan ve adeti 20 olduğunda duran program
public class ornek36 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        String b = " ";        int sayac = 0;
        for (int i = 0; ; i++) {
            String a = k.nextLine();
            if (a.length() >= 5) {
                b = b+ a;
                sayac++;
            }if(sayac ==5){
                break ;
            }
        }
        System.out.print(b);
    }
}
