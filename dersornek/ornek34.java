package dersornek;
//1,3,7,9,13,15,19,21... şeklinde giden serinin ilk 100 teriminin toplamını bulan
public class ornek34 {
    public static void main(String[] args) {
        int a=1 ,b=3 , totel1=0 , totel=0;
        for (int i = 1 ; i<=50 ; i++){
            totel = totel +a;
            a= a+6;



        }for(int j =1; j<=50;j++){
            totel1 = totel1 + b;
            b= b+6;

        }
        System.out.println(totel1+totel);
            }
        }


