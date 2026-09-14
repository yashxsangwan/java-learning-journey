package lessons.exception_handling;

public class FinallyBlock {
    static void meth1() throws Exception {
        throw new Exception();
    }
    public static void main(String[] args) throws Exception { // jvm handles the exception 
        try {
            meth1();
        }
        finally { // genrally used when catch block is not used or exception is not handled or to close resources, this block will definitely execute
            System.out.println("Final message");
        }
        
    }
    
}

