package java1702.javase.oop;

/**
 * Created by $qiqi
 * on 2017/3/21.
 * java
 */
public abstract class Shape {//形状
    public abstract double getPerimeter() ;
    public  abstract double getArea();


    public static void main(String[] args) {
        CircleText circleText=new CircleText(2);
        System.out.println(circleText.getArea());
        System.out.println(circleText.getPerimeter());
       Rectangle rectangle=new Rectangle(2);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
        Square square=new Square(2);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());
        }
    }

class CircleText extends Shape {
    private double radius;//半径
    private double pi=3.14;

    public CircleText(double radius) {
        this.radius = radius;
    }
    //    private double x;
//    private  double y;

    @Override
    public double getPerimeter() {
        return 2*pi*radius;
    }

    @Override
    public double getArea() {
//        return pi*radius*radius;
        return  pi*Math.pow(radius,2);
    }
}

class Rectangle extends Shape {
    private double side;

    public Rectangle(double side) {
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return 4*side;
    }

    @Override
    public double getArea() {
//        return side*side;
        return Math.pow(side,2);
    }
}

class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return side*4;
    }

    @Override
    public double getArea() {
        return side*side;
    }
}
