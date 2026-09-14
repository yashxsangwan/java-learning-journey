package lessons.oop;

class Parent {
    public Parent() {
        System.out.println("Non-param parent cnstructor");
    }
    public Parent(int a) {
        System.out.println("Param parent constuctor");
    }
}
class Child extends Parent {
    public Child() {
        System.out.println("Non-param child constructor");
    }
    public Child(int a){ // super is a keyword used to call parent class or super class properties/methods/constructors
        super(a); // have to exlicitly call the parametrized constructor of super class, and this should be the first line in subclass/child class constructor
        System.out.println("Param child constructor");
    }
}
public class InheritConstructor {
    public static void main(String[] args) {

        // Parent p = new Parent();
        // Child c1 = new Child();
        // Child c2 = new Child(25);
        // Object obj = new Object(); Super class of all classes
        
    }
    
}

