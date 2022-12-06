package dizilerders;

import java.util.Scanner;

// klavyeden 8 kişilik sınıftaki ögrencilerin adı soy adı giriliyor
//a =>bunları tutan programı yapınız
//b => bu stringler içinde  ilk karakteri  t  yada T olanları bulan  bulup ekrana yazan  programı yazınız.
// c = > klavyeden girilen 8 kişinin ad soyadı üzerinde karakter sayısı 4 ve karakter sayısı 5 olanları ekrana yazan program.
public class dizilerornek4 {
    public static void main(String[] args) {
        Scanner k  = new Scanner(System.in);
        String adsoyad[]= new String[8];
        for(int i =0;i<8;i++){
            adsoyad[i]= k.next(); //a cevabı

        }for (int i =0 ; i<8;i++){
            if (adsoyad[i].charAt(0)== 't' || adsoyad[i].charAt(0)== 'T'){
                System.out.println(adsoyad[i]); // b cevabı
            }
        }for ( int i =0 ; i<8 ; i++){
            if(adsoyad[i].length() == 4 || adsoyad[i].length()== 5){
                System.out.println(adsoyad[i]); // c nin cevabı
            }
        }// if ( adsoyad[i].charAt(adsoyad[i].lenght-1 =='a') // dizinin son karakterinin a alup olmadıgını bulan program

    }
}
