package dersornek;
//1+ 1/7 + 2/11 + 3/15 ... diye giden serinin ilk 100 teriminin toplamı
public class ornek17 {
    public static void main(String[] args) {
     int a = 1 , b = 7 ;
     double toplam = 1.0 ;
     for(int i =1 ;i<=99; i++){
         toplam = toplam + (double)a/b;
         a=a+1;
         b=b+4;
     }
        System.out.println(toplam);
    }

}
