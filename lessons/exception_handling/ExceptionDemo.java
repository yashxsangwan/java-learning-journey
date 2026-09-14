package lessons.exception_handling;

public class ExceptionDemo {
    public static void main(String[] args) {

        // exception handling used for error free smooth handling of exception without causing program crash
        int a = 10, b = 0, c;
        try { // block in which error/exception may occur
            c = a / b;
            System.out.println(c);
        }
        catch(ArithmeticException e) { // catches the error/exception
            System.out.println("Cannot divide bt zero, try again! " + e);
            // System.out.println(e);
            // System.out.println("Divison by zero");
        }
        System.out.println("Bye"); // without exception handling the program would have crashed/stopped before executing this line
    }
    
}

