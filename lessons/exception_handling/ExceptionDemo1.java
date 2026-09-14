package lessons.exception_handling;

public class ExceptionDemo1 {
    static void fun1() {
        int a = 10, b = 0, c;
        try {
            c = a / b;
            System.out.println(c);
        }
        catch(Exception e) { // Parent class of all exceptions
            System.out.println(e.getMessage());
            e.printStackTrace(); // prints method calling sequence of exception?
        }
    }
    static void fun2() {
        fun1();
    }
    static void fun3() {
        fun2();
    }
    public static void main(String[] args) {
        fun3();
        
    }
    
}

