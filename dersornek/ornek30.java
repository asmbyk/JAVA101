package dersornek;

import java.util.Scanner;

//klavyeden girilen sayınının 1000 e kadar aralarindaki olan sayıların asal olanlarını ekrana yazan
public class ornek30 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int sayac=0;
        for(int i=a;i<=1000;i++){
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    sayac++;
                }
            }
            if(sayac==0){
                System.out.println(i+" ");
            }
            sayac=0;
        }
    }
}
