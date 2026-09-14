package lessons.oop;

class Super {
    public void display() {
        System.out.println("Super class display");
    }
}
class Sub extends Super {
    @Override
    public void display() { // Method Overriding
        System.out.println("Sub class display");
    }
}
public class DynamicDispatch {
    public static void main(String[] args) {
        
        Super obj1 = new Super();
        obj1.display();

        Sub obj2 = new Sub();
        obj2.display(); // Super class method is shadowed and Sub class method is called

        Super obj3 = new Sub(); // Dynamic method dispatch: if a overirided method is called using Super class reference variable but object is of Sub class, then the called method will be object type not reference type.
        obj3.display();

        // Sub obj4 = new Super(); Error
        // obj4.display();
    }
    
}

