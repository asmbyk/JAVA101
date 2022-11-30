package ahmetcinarcalisma;
//1 den 100 kadar olan tek sayıların topalamını bulup ekrana yazan programı yazınız.
public class sinav3 {
    public static void main(String[] args) {
        int toplam = 0 ;
        for ( int i=0 ; i<100; i++){
            if (i%2==1){
                toplam += i ;
            }
        }
        System.out.println("1den 100e kadar olan tek sayılaın toplamı:"+ toplam);
    }
}
