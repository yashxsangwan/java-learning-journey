package lessons.advanced_lang;

class A{}
class B extends A{}
class C extends B{}

@SuppressWarnings("unchecked")
class MyClass<T> {
    T[] arr = (T[]) new Object[10];

    int length = 0;
    
    public void append(T v) {
        arr[length++] = v;
    }

    public void display() {
        for(int i = 0; i < length; i++) {
            System.out.println(arr[i]);
        }
    }

}

public class GenericDemo5 {
    // static <E extends Number> void show(E[] list) {}
    static <E> void show(E[] list) {
        for(E x : list) {
            System.out.println(x);
        }
    }
    /*
    static <E> void show2(E... list) { // varargs
        for(E x : list) {
            System.out.println(x);
        }
    }
    */
    
    // static void fun(MyClass<? extends Number> obj) {} , will only accept numeric type arguments
    // static void fun(MyClass<? super Number> obj) {} , both fun method will show error because neither String nor Integer are super class of Number class
    static void fun(MyClass<? super C> obj) { // if i use super A, then bith fun method will show error cuz B and C class are not super class of A
        obj.display(); // if i use super B then i can use class B and class A. If i use super C then i can use C, B and A as well cuz A and B are super classes of C
    }
    // extends for upperbound and super for lowerbound
    //<?> is called wildcard, means any type, unbounded
    
    public static void main(String[] args) {
        show(new String[]{"Hi", "Hello", "Bye"});
        show(new Integer[]{10, 20, 30, 40});

        /* show2("Hola", "Namaste");
        show2(2, 4, 6, 8); */

        MyClass<B> mob1 = new MyClass<>();
        // MyClass<String> mob1 = new MyClass<>();
        /* 
        mob1.append("Hello");
        mob1.append("World");
        */

        MyClass<C> mob2 = new MyClass<>();
        // MyClass<Integer> mob1 = new MyClass<>();
        /* 
        mob2.append(200);
        mob2.append(400);
        */

        fun(mob1);
        fun(mob2);

        
        
    }
    
}

