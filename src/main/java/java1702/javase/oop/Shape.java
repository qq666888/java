package java1702.javase.oop;

/**
 * Created by $qiqi
 * on 2017/3/21.
 * java
 */
public  interface  Shape {//形状
    double getPerimeter() ;
     double getArea();
}

class CircleText implements Shape {//圆
    private double radius;//半径
    private double pi=3.14;

    public CircleText(double radius) {
        this.radius = radius;
    }


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

class Rectangle implements Shape {//长方形
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

class Square implements Shape {//正方形
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

class Triangle implements Shape {//三角形
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getPerimeter() {
        return a+b+c;
    }



    @Override
    public double getArea() {
        double s= (a+b+c)/2;
        return (s*Math.sqrt((s-a)*(s-b)*(s-c)));//sqrt开平方，海伦公式


    }
}

class Trst {//测试
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
    Triangle triangle=new Triangle(1,2,3);
    System.out.println(triangle.getArea());
    System.out.println(triangle.getPerimeter());
    Shape shape=new CircleText(2);//多态的一种形式
    System.out.println(shape.getPerimeter());
        System.out.println(shape.getArea());



}

}
