package dersornek;

//1+ 1/2 + 2/3 + 3/4 ... diye giden serinin ilk 100 teriminin toplamı
public class ornek16 {
    public static void main(String[] args) {
        double s =0 ;
        for (int i = 0; i <=100; i++) {
            s=s+(i*1.0)/(i+1.0);
        } System.out.println(s);
    }
}

