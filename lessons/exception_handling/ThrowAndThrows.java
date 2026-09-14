package lessons.exception_handling;

class NegativeDimensionException extends Exception { // user defined exception class
    @Override
    public String toString() {
        return "Dimensions of Rectangle cannot be Negative";
    }
}
public class ThrowAndThrows {
    static int area(int l, int b) throws NegativeDimensionException{ // declares that this method will throw exception, the method which calls area must handle the thrown exception
        if(l < 0 || b < 0) 
            throw new NegativeDimensionException(); // creates object of Exception and throw Exception, this is a checked exception and must be handled otherwise compiler will show error
        return l * b;
    }
    static void meth() {
        try {
            int r = area(-10, 5);
            System.out.println(r);
        }
        catch(NegativeDimensionException e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        meth();
    }
    
}

