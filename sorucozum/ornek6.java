package sorucozum;


import java.util.Scanner;

// klavyeden girilen sayının basamak degerlerini yazan program
// 3245 3 binler2 yüzler 4 onlar 5 birler
public class ornek6 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in) ;
        int sayi , a , b ,c;
        sayi = k.nextInt();
        a = sayi/1000;
        System.out.println(a + "BİNLER BASAMAGI VARDIR.");
        b =( sayi-(1000*a))/100 ;
        System.out.println(b + "YÜZLER BASAMAGI VARDIR ");


    }
}
