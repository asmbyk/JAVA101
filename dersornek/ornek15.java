package dersornek;
// 1'den 3'e kadar ve 1'den 4'e kadar olan sayıların çarpımının toplamı
public class ornek15 {
    public static void main(String[] args) {
        int carp = 1, carp1 = 1 ;
        for(int i = 1 ; i<3; i++){
            carp = i*carp;
        }for(int j =1 ; j<4 ;j++){
            carp1 = j*carp1;
        }
        System.out.println(carp1+carp );
    }
}
