package lessons.advanced_lang;

// import java.lang.reflect.*;

class My {
    public int a;
    // private double b;
    protected float c;
    char d; // default access modifier

    public My() {}

    public My(int a, int b) {}

    public void display() {}
    public int show(int a) { return 0; }
}
public class ReflectAPIDemo {
    public static void main(String[] args) {
        /* 
        Class obj = My.class;

        My m1 = new My();
        Class c1 = m1.getClass();

        String name = obj.getName();
        System.out.println(name);

        Field[] field = obj.getFields();
        for(Field f : field) {
            System.out.println(f);
        }

        Method[] method = obj.getMethods();
        for(Method m : method) {
            System.out.println(m);
        }

        Constructor[] cons = obj.getConstructors();
        for(Constructor ct : cons) {
            System.out.println(ct);
        }
        */
       
    }
    
}

