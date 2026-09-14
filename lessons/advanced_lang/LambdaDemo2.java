package lessons.advanced_lang;

@FunctionalInterface
interface MyLambda {
    public int sum(int a, int b);
}
public class LambdaDemo2 {
    public static void main(String[] args) {
        // MyLambda obj = (a, b)-> { return a+b; };
        MyLambda obj = (a, b)-> a + b; // not necessary to mention return here, cuz it already know it have to return int type

        int r = obj.sum(10, 20);
        System.out.println(r);

        
    }
    
}

