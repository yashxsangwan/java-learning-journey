package lessons.oop;

abstract class Shape {
    public abstract double perimeter();
    public abstract double area();
}
class Circle extends Shape {

    private double radius;

    public Circle(double r) {
        radius = r;
    }

    @Override
    public double perimeter() {
        return 2 * 3.14 * radius;
    }
    @Override
    public double area() {
        return 3.14 * radius * radius;
    }
}
class Rectangle extends Shape {

    private double length;
    private double breadth;

    public Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    @Override
    public double perimeter() {
        return 2 * (length + breadth);
    }
    @Override
    public double area() {
        return length * breadth;
    }
    
}
public class AbstractTest {
    public static void main(String[] args) {

        Shape obj1 = new Circle(5);
        Shape obj2 = new Rectangle(2, 4);

        System.out.println(obj1.perimeter());
        System.out.println(obj1.area());
        System.out.println(obj2.perimeter());
        System.out.println(obj2.area());
        
    }
    
}

