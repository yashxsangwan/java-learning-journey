package lessons.oop;

class Test {
    final int PRICE = 100; // 1st method to initialize
    // static final int PRICE = 100;
    // final float PI;
    static {
        // final int DAY = 5; // 2nd way to initialize
        // PI = 3.14f; static block can only access static members
    }
    final double PI;
    public Test() {
        PI = 3.14; // 3rd way to initialize
    }
}
final class Test1 {

}

// class Test2 extends Test1 {} // final class cannot be extended or inherited
public class FinalPractice {
    static final void hello() {
        System.out.println("hello");
    }

    public static void main(String[] args) {

        hello(); // final methods cannot be overrided

        // Test.PRICE = 20; final variables cannot be changed, also known as Constants and written in CAPITAL

        // System.out.println(Test.PRICE); can't access without declaring it static if defined in class
        
    }
    
}

