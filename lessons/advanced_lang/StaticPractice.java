package lessons.advanced_lang;

class Test {
    static int x = 10; // static members are common and shared by everyone, meaning if one object changes x=10 to x=20 then everyone will have x=20
    int y = 20;

    void show() {
        System.out.println(x + " " + y); // non-static methods can access both static and non-static members
    }
    static void display() {
        // System.out.println(x + " " + y); static methods can only access static members
        System.out.println(x);
    }
}
public class StaticPractice {
    public static void main(String[] args) {

        Test t1 = new Test();
        t1.show();

        // t1.x = 50;
        Test.x = 50; // static members can be accessed by class name as well as object name
        // they belong to class not object
        t1.y = 100;
        // x value is changed because it is static and common to all. every object refers to same x
        // but y is non-static and every object have its own copy of y, therefore by changing y through t1 object, it didn't affect t2 object

        Test t2 = new Test();
        t2.show();
        
    }
    
}

