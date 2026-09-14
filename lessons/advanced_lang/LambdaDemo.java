package lessons.advanced_lang;

@FunctionalInterface
interface MyLambda {
    public void display();
}

/* class My implements MyLambda {
    public void display() {
        System.out.println("Hello World");
    }
} */

public class LambdaDemo {
    public static void main(String[] args) {
        /* My obj = new My();
        obj.display(); */

        /* MyLambda obj = new My();
        obj.display(); */

        /* MyLambda obj = new MyLambda() {
            public void display() {
                System.out.println("Hello World");
            }
        }; */

        MyLambda obj = ()-> { System.out.println("Hello World"); }; // Lambda Expression
        /* The brackets are empty because no parameter is declared, it is refering to display method, 
        it does not confuse any other method because obj is of MyLambda type and there is no other method in MyLambda interface */

        obj.display();


        
    }
    
}

