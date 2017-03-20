package java1702.javase.basic;

/**
 * Created by SONY on 2017/3/15.
 */
public class Vehicle {
    //int age;
    double price;//价格
    double weight;
    //String spacious;//宽敞的
    String name;
    char color;

    public Vehicle(double price,double weight,String
                   name,char color) {
        System.out.println("vehicle");
    }
    }
    // public void start() {
       // System.out.println("Vchicle is");
   // }

   // public void stop() {
     //   System.out.println("vchicle is stopped");
   // }


//}


class Bicycle extends Vehicle {
    String type;

    public Bicycle(double price, double weight, String name, char color) {
        super(price, weight, name, color);

    }
    /*int wheel;//轮子

    public void run() {
        System.out.println("Bicycle");
    }*/



}

class Ship extends Vehicle {
    public Ship(double price, double weight, String name, char color) {
        super(price, weight, name, color);
    }
   /* String anchor;//船锚

    public String power() {//动力
        System.out.println("Ship");
        return "ship spacious";
    }*/

//    public Ship() {
//        System.out.println("ship");
//    }
}

class Plane extends Vehicle{
   /* String chair;//椅子

    public String fly() {
        System.out.println("Plane");
        return "";
    }*/

//    public Plane() {
//        System.out.println("plane");
//    }

    public Plane(double price, double weight, String name, char color) {
        super(price, weight, name, color);
    }
}


class VehicleTest {
    public static void main(String[] args) {
       /* Vehicle vehicle = new Vehicle();
        System.out.println(vehicle.price);
        vehicle.start();*/
       // Bicycle bicycle = new Bicycle();
       // bicycle.run();
       // Plane plane=new Plane();

    }
}
