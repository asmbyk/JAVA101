package ahmetcinarcalisma;

public class ornek8 {
    public static void main(String[] args) {
        int toplam = 0, sayac = 0;

        System.out.println("3e tam bölünen sayılar" );
        for(int i =0; i<100 ; i++){
            if(i%3 ==0){
                System.out.print(i);
                toplam = toplam + i ;
                sayac++ ;

            }

        }System.out.println(" 3e bölünenlerin toplamı :");
        System.out.println(toplam);
        System.out.println("3e bölünenlerin ortlaması");
        System.out.println(toplam/sayac);
    }
}
