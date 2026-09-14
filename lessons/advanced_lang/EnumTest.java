package lessons.advanced_lang;

enum Color { // implemented as a class internally, cannot extend classes but can implement interfaces
    // is a special datatype, used to define fixed set of constant values
    RED, GREEN, BLUE, YELLOW, BLACK, WHITE; // by default thsee constants are public static final
    // used in switch statements
    // each constant is of enum type

    private Color() {
        System.out.println("Colors are: " + this);   
    }

    public void display() {
        System.out.println("Color is: " + this);
    }
}
public class EnumTest {
    public static void main(String[] args) {
        Color c1 = Color.RED;
        System.out.println(c1);
        c1.display();

        
    }
    
}

