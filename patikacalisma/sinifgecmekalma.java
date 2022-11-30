package patikacalisma;

import java.util.Scanner;

public class sinifgecmekalma {
    public static void main(String[] args) {
       //Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik
        //Geçme Notu : 55
        double mat ,fiz ,turk ,kim ,miz ,ortnot, not;
        Scanner kal = new Scanner(System.in) ;
        System.out.println("matematik notunuz");
        mat = kal.nextDouble();
        System.out.println("fizik notunuz");
        fiz = kal.nextDouble();
        System.out.println("türkce notunuz");
        turk = kal.nextDouble();
        System.out.println("kimya notunuz");
        kim = kal.nextDouble();
        System.out.println("müzük notunuz");
        miz= kal.nextDouble();
        not = mat+fiz+turk+kim+miz;
        ortnot = not/5;
        if (ortnot<=55){
            System.out.println("Kaldınız");

        }else{
            System.out.println("geçtiniz");
        }

    }
}
