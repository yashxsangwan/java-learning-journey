package lessons.advanced_lang;

class Test {
    static {
        System.out.println("Block 3");
    }
    static {
        System.out.println("Block 4");
    }
}
// Static blocks are executed first when a class is loaded
public class StaticBlock {   
    static {
        System.out.println("Block 1");
    }
    static {
        System.out.println("Block 2");
    }
    public static void main(String[] args) {

        // Test t2 = new Test(); // first main class is loaded then Test class then main statement
        // static block 3 and 4 is not executed after main statement because they are already executed when t2  object is created/ Test class is loaded
        System.out.println("Main"); // block 1 and 2 are executed first because class StaticBlock is loaded which is main class
        // then statement Main is printed
        // But staic block 3 and 4 was not executed because Test class is not loaded
        // Test t1 = new Test(); // Test class is loaded when object is created
        
    }
    
}

