package lessons.advanced_lang;

interface A{}
class B implements A{}
class C extends B{}

// class MyClass2<T, K, M> {} //i can pass multiple parameters here
// i dont have to use implemets keyword here for interfaces
@SuppressWarnings("unchecked")
class MyClass<T> { // Add a bound here when every use of T must share a common type.
    // it can also extend user defined classes
    // if i use an interface 
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
// class MyClass3 extends MyClass{} if i dont pass anything then MyClass3 will be of object type
// class MyClass3 extends MyClass<String> if i pass string or other type then MyClass3 will only accept string type arguments and will show error i pass other type like integr when using methods like append(10)
class MyClass3<T> extends MyClass<String> {  // the class extending generic class must also be generic

}
public class GenericDemo4 {
    public static void main(String[] args) {
        MyClass<Integer> obj = new MyClass<>();
        MyClass3<String> obj3 = new MyClass3<>();
        // MyClass2<String, Integer, Float> obj2 = new MyClass2<>(); can pass different types of parameters

        // MyClass obj2 = new MyClass(); if i dont use parameters then it becomes an object, it will not show error cuz all arguments will be of object type

        obj3.append("10"); // cuz obj3 is of string type
        obj.append(20);
        obj.append(40);
        obj.append(70);

        obj.display();
        
    }
    
}

