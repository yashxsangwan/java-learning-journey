package lessons.advanced_lang;

interface MyLambda {
    public void display(String str);
}

public class LambdaDemo4 {
    public static void reverse(String str) {
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
    }
    public static void main(String[] args) {
        MyLambda obj = System.out::println;

        obj.display("Hello");

        // its equivalent to MyLambda obj = (str) -> System.out.println(str);

        /*
         * `MyLambda obj = System.out::println;` assigns a method reference to `obj`.
         * The `MyLambda` interface requires one method, `display(String str)`, which
         * accepts a `String` and returns nothing.
         * 
         * `System.out::println` refers to the `println` method of Javaâ€™s standard
         * output object. Java uses the expected `MyLambda` type to determine which
         * `println` overload to useâ€”in this case, the version that accepts a `String`.
         * 
         * This is equivalent to creating a lambda that receives a string and prints it:
         * `str -> System.out.println(str)`. The method is not executed when `obj` is
         * assigned. It runs later when `obj.display("Hello")` is called.
         */

        MyLambda ml = LambdaDemo4::reverse;

        // if reverse was non-static then 
        // create LambdaDemo4 obj = new LambdaDemo4();
        // then MyLambda my = obj::reverse; called using object instead of class name

        ml.display("Hello World");

    }

}

