package dersornek;

import java.util.Scanner;

// klavyeden girilen 10 sayının eit olup olmadıgını bulan program
public class ornek33 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int esit ,sayac =1;
        for(int i =1; i<=10 ;i++){
            int a = k.nextInt();
            esit = a;
            if(esit ==a){
                sayac++ ;
            }if (sayac==10){
                System.out.println("bütün sayılar eşittir");
            }else {
                System.out.println("esit degildir");
            }
        }
    }
}
