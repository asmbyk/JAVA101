package dersornek;

import java.util.Scanner;

//klavyeden girilen sayının kaç basamaklı olduğunu bulma
public class ornek23 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int sayac=0;
        while(a>0){
            a = a / 10;
            sayac++;
        }
        System.out.println(sayac);
    }
}

