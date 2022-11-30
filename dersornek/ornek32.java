package dersornek;

import java.util.Scanner;

//-klavyeden girilen 10 tam sayının küçükten büyüğe doğru sıralı olup olmadığını bulan program
public class ornek32 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int max=0 , min=0, sayac=1;
        for (int i=1 ; i<=10 ; i++){
            int a = k.nextInt();
            max = a ;
            if(max>min){
                min = max ;
                sayac ++ ;

            }else {
                System.out.println("sayılar dogru sıralı degil");

            break ;
            }
            System.out.println("dogru");

        }
    }
}
