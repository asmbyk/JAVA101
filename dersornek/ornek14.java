package dersornek;
//s12- 1'den 3'e kadar ve 1'den 5'e kadar olan sayıların toplamı
public class ornek14 {
    public static void main(String[] args) {
        int toplam = 0 ;
        for (int i = 1 ; i<3 ; i++){
            toplam = i + toplam ;
        }for (int j = 1 ; j<5 ; j++){
            toplam = toplam + j;
        }
        System.out.println(toplam);

    }
}
