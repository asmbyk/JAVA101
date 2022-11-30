package patikacalisma;

import java.util.Scanner;
public class kdvhesaplama {
    public static void main(String[] args) {
        double tutar, kdvoran = 0.8,kdvli , tutar2;
        Scanner input = new Scanner(System.in);
        System.out.println("tutarı giriniz : ");
        tutar = input.nextDouble();
        tutar2 =tutar*kdvoran;
        kdvli=tutar+tutar2 ;
        System.out.println("kavli tutarınız :"+ kdvli);



    }
}
