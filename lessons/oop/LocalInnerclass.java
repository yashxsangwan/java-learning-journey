package lessons.oop;

class Outer {
    public void meth() {
        class Inner {
            public void display() {
                System.out.println("Hello");
            }
        }
        Inner i = new Inner();
        new Inner().display(); // Anonmyous object
        i.display();
    }
}
public class LocalInnerclass {
    public static void main(String[] args) {

        Outer obj = new Outer();
        obj.meth();
        
    }
    
}

