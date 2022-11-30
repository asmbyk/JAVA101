package dersornek;
//1/2!+ 1/3! + 1/4!+ ... + 1/10! olan seriyi hesaplayan program
public class ornek52 {
    public static void main(String[] args) {
        double toplam =0 ,fak =1 ;
        for( double i=2 ;i<=10;i++){
            for(double j=1 ;j<=i ; j++){
                fak = fak*j;
            }toplam= toplam+1/fak;
        }
        System.out.println(toplam);
    }
}
