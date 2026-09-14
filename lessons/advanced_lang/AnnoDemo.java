package lessons.advanced_lang;

// import java.util.*;

abstract class Demo {
    public void display() {}
}
class OverrideAnno extends Demo {
    @Override // points out error if overriding an method, for ex: with this annotation, if method name is wrong it will not show any error
    public void display() {}
}

class DepreDemo {
    public void greetings() {
        System.out.println("Hello");
    } 

    @Deprecated // used when a method should no longer be used or better alternatives are introduced
    public void show() {
        System.out.println("hi");
    }
}

class My<T> { // user-defined Generic class

    // @SafeVarargs // SuppressWarnings can also be used
    /* private void print(T... arg) { // Generic varargs // this method should be private or final
        for(T x : arg)
            System.out.println(x);
    } */
}

@FunctionalInterface // this shows a warning if more than one method is declared in a functional interface 
interface Test { // a functional interface has only one method
    void hello();
    // int sum(int a, int b);
}

public class AnnoDemo {
    // @SuppressWarnings("deprecation") will suppress warning of deprecation
    /* static List l;
    @SuppressWarnings("unchecked") */
    public static void main(String[] args) {
        /* DepreDemo obj = new DepreDemo();
        obj.show(); // will show warning if compiled */

        // l.add(10);

    }
    
}

