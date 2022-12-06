package siniflar;
// araba diye bir sınıfımız olsun sınıflar nesneyi üretmek için bir sablon olarak kulanılır.
public class car {
    String type = "Sedan";
    //varsıyalan bir degeri burda tanımladık
    // nitelikler sınıfın başında tanımlanması dogru olan bir programlama yaklaşımı
    String model ;
    // metotlar sayesinde davranıs veriyoruz.
    int speed;
    int speedLimit = 180 ;
    void increasespeed(int increment){ // metotlar davnanıs vermemizde yardımcı olabilir istedigimiz yerde cagırabiliriz.
        if((speed+ increment)<speedLimit){
            speed +=increment;
        }
    }
    void decreasespeed(int decrease){
        if(speed>0){// mantıken duran arabanın hızı düşemez
            speed -=decrease;
        }
    }
    void  printSpeedy(){
        System.out.println( model +"hızınız  --->    " + speed);
    }
}
// sınıfın üstündeki bölümde tanımladıgımız ir degişkeni metot içinde kulanmamız mümkün fakat metot içinde tanımladıgımız
// bir degişkeni  bulundugu class içinde kulanamayız.