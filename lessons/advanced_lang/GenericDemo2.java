package lessons.advanced_lang;

public class GenericDemo2<T> {

    private T obj;

    public void setData(T v) {
        obj = v;
    }

    public T getData() {
        return obj;
    }

    public static void main(String[] args) {
    
        // must pass type of parameter in diamond operators to tell which type of data i will use so compiler will show error if i mistakenly use other data
        GenericDemo2<String> gd = new GenericDemo2<>();
        // GenericDemo2<String> gd2 = new GenericDemo2<String>(); // can also write it this way

        gd.setData("Hi");
        String str = gd.getData();

        System.out.println(str);

        
    }
    
}

