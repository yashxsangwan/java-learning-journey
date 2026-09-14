package lessons.advanced_lang;

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
public class GenericDemo3 {
    public static void main(String[] args) {

        MyClass<Integer> obj = new MyClass<>();

        obj.append(10);
        obj.append(20);
        obj.append(40);
        obj.append(70);

        obj.display();
        
    }
    
}

