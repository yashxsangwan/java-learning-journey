package lessons.basics_and_control;

import java.util.Scanner;

public class Area{
    public static void main(String[] args) {
        double length, breadth, radius;
        Scanner sc = new Scanner(System.in);
        Area obj = new Area();

        System.out.print("Enter length of rectangle: ");
        length = sc.nextDouble();
        System.out.print("Enter breadth of rectangle: ");
        breadth = sc.nextDouble();

        double areaOfRectangle = obj.areaOfRectangle(length, breadth);
        System.out.println("Area of Rectangle: " + areaOfRectangle);

        System.out.print("Enter radius of circle: ");
        radius = sc.nextDouble();

        double areaOfCircle = obj.areaOfCircle(radius);
        System.out.println("Area of circle: " + areaOfCircle);

        sc.close();
    
    }
    public double areaOfRectangle(double l, double b){
        return (l * b);
    }
    public double areaOfCircle(double r){
        return (3.14f * r * r);
    }

}
