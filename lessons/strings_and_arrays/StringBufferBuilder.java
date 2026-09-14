package lessons.strings_and_arrays;

public class StringBufferBuilder {
    public static void main(String[] args) {
        
        String s1 = new String("Hello"); // immutable(cannot be modified), slowest

        StringBuffer s2 = new StringBuffer("Hello"); // mutable, faster, thread-safe(no 2 thread can access at same time, synchronized)

        StringBuilder s3 = new StringBuilder("Hello"); // mutable, fastest, not thread-safe

        s1.concat( "World");
        s2.append(" World");
        s3.append( " World");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
    
}

