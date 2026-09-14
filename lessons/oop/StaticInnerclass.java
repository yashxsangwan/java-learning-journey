package lessons.oop;

class Outer {
    static int x = 10;
    int y = 20;

    static class Inner {
        void display() {
            System.out.println(x);
            // System.out.println(y); static class can only access static members
        }
    }
}
public class StaticInnerclass {
    public static void main(String[] args) {

        Outer.Inner obj = new Outer.Inner(); // doesn't have to use new 2 times, just use Outer class name to access inner class 
        obj.display();

        
    }
    
}

