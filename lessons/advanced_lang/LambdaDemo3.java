package lessons.advanced_lang;

interface MyLambda {
    public void display();
}

class UseLambda {
    public void callLambda(MyLambda ml) {
        ml.display();
    }
}

class Demo {
    public void method1() {
        UseLambda ul = new UseLambda();
        ul.callLambda(() -> {
            System.out.println("Hello");
        });

        /*
         * Java treats the above line as similar to the code mentioned below
         * MyLambda obj = new MyLambda() {
         * public void display() {
         * System.out.println("Hello");
         * }
         * };
         * ul.callLambda(obj);
         */

        /*
         * MyLambda obj = () -> {
         * System.out.println("Hello");
         * };
         * 
         * ul.callLambda(obj);
         */
    }
}

public class LambdaDemo3 {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.method1();

    }

}

