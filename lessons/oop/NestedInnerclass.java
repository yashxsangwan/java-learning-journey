package lessons.oop;

class Outer {
    int x = 10;
    // Inner i = new Inner(); This can also work

    class Inner { 
        int y = 20;
        public void innerDisplay() {
            System.out.println(x + ", " + y);
        }
    }
    public void outerDisplay() {
        Inner i = new Inner();
        i.innerDisplay();
        System.out.println(i.y);
    }
}
public class NestedInnerclass {
    public static void main(String[] args) {

        Outer obj = new Outer();
        obj.outerDisplay();

        Outer.Inner obj1 = new Outer().new Inner(); // other way to call inner class fields and methods, but not used much, instead call using outer class object like above
        obj1.innerDisplay();
        
    }
    
}

