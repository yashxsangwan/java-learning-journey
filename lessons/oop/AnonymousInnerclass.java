package lessons.oop;

interface InterfaceTest {
    void meth1();
}
abstract class AbstractTest {
    public abstract void meth2();
}
public class AnonymousInnerclass {
    public static void main(String[] args) {

        // Interface and Abstract class object cannot be created only reference variable can be created 
        // but we are overriding the methods in this object creation which makes it a concrete class
        // but this class doesn't have a name, its know anonymous inner class, which we will see later frequently in java
        
        /* 
        InterfaceTest obj1 = new InterfaceTest() {
            public void meth1() {
                System.out.println("Hello 1");
            }
        };

        AbstractTest obj2 = new AbstractTest() {
            public void meth2() {
                System.out.println("Hello 2");
            }
        };
        */
    }
    
}

