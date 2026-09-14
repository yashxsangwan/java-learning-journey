package lessons.oop;

abstract class Super { // if a class contains an abstract method, then that class must be declared as an abstract class
    public Super() {
        System.out.println("Super class"); // constructors are not inherited but they are invoked automatically or explicitly when subclass object is created
    }
    public abstract void display(); // abstract method cannot have a body
}
class Sub extends Super { // if a subclass inherits an abstract class, then all abstract methods must be defined/overrided, if not then subclass must also be an abstract class
    @Override
    public void display() {
        System.out.println("Sub display");
    }
    public void show() {
        System.out.println("Hello");
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        // Super s = new Super(); Abstract class cannot be instantiated or object cannot be created
        // Super obj; // Reference varaible can be created
        // Sub sub = new Sub();
        // obj = sub;
        // obj.display();

        Super obj = new Sub(); // dynamic method dispatch, dynamic because object is created during runtime not compile time, dispatch means call or invoke
        // Sub obj = new Super(); cannot be done this way
        obj.display();
        // obj.show(); cannot call subclass methods by superclass reference
        
    }
    
}

