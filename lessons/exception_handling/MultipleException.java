package lessons.exception_handling;

public class MultipleException {
    public static void main(String[] args) {
        int[] arr = {10, 20, 0, 40, 50};

        try {
            int c = arr[1] / arr[0]; // if error occurs here then other statements will not be executed of try block
            // it will execute ArithmeticException catch block and then bye statement
            System.out.println(c);
            System.out.println(arr[8]);
        }
        // Multiple catch blocks can used for a single try block
        // But I should remember the hierachy of Exception classes
        // If i write a superclass first and then subclass then that superclass will shadow the subclass exception
        catch(ArithmeticException e) {
            System.out.println("Divison by zero");
        }
        catch(IndexOutOfBoundsException e) {
            System.out.println("Invalid index " + e);
        }
        System.out.println("Bye");
        

    }
    
}

