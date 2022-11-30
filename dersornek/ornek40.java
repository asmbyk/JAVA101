package dersornek;
import  java.util.Scanner;
//a,b ve c klaveyden girilmek üzere ax^2+bx+c=0 şeklindeki bir denklemin köklerini bulan program
public class ornek40 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        double a= s.nextInt();
        double b= s.nextInt();
        double c= s.nextInt();
        double delta=(b*b)-(4*a*c);
        if(delta>0){
            double x1=((-1*b)-Math.sqrt(delta))/(2*a);
            double x2=((-1*b)+Math.sqrt(delta))/(2*a);
            System.out.println("x1="+x1+" x2="+x2);
        }
        if(delta<0){
            System.out.println("Denklemin gerçel kökü yoktur");
        }
        if(delta==0){
            double x=(-1*b)/(2*a);
            System.out.println("x1=x2="+x);
        }
    }

}
