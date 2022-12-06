package siniflar2;

public class car {
    String color;
    String type;
    String model;
    int speed;
    int speedLimit;

    car(String model, String type, String color, int speedLimit, int speed) {
        this.model = model;
        this.type = type;
        this.color = color;
        this.speed = speed;
        this.speedLimit = speedLimit;
    }

    void artanspeed(int artan) {
        this.speed = artan + speed;
    }

    void azalanspeed(int azalan) {
        if (this.speed > 0) {
            this.speed = azalan - speed;
        }
    }void genelbilgi(){
        System.out.println("model:" + this.model);
        System.out.println("tpye:"+ this.type);
        System.out.println("color"+ this.color);
        System.out.println("speed"+ this.speed);
        System.out.println("Speed limit :"+ this.speedLimit);
    }
}
