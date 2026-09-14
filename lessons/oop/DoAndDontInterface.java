package lessons.oop;

interface Test {
    final static int x = 10; 
    int y = 20; // final static by default

    // Once a interface is created, it should not be changed. If changed then all implementing classes will become abstract
    // But if a interface really have to changed, then using default method, we don't have to worry about classes becoming abstract

    void meth1(); // public abstract ny default
    public static void meth2() { // interfaces can have static method
        System.out.println("Static method");
    }
    // Check versions of java when these changes are first introduced like default methods and private methods
    default void meth3() { // interfaces can have default method
        System.out.println("Default method");
    }
    private void meth4() { // Cannot be accessed so we have to use default method to access it
        System.out.println("Private method");
    }
    default void meth5() {
        meth4();
    }
}
interface Test2 extends Test { // Interface can extend each other
    void meth6();
}
class InterfaceTest implements Test2 {
    public void meth1(){}
    public void meth6(){}
}
public class DoAndDontInterface {
    public static void main(String[] args) {

        Test.meth2();
        InterfaceTest t = new InterfaceTest();
        t.meth3();
        t.meth5();

    }
    
}

