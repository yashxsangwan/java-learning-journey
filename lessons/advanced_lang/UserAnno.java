package lessons.advanced_lang;

@interface MyAnno { // user defined annotation main purpose is hold metadata(information), metadata is data about data
    String name(); // elements-> doesn't have body, parmeters, etc
    String project(); 
    String version() default "1.0"; // generally string datatype or any other predefined or constant is preferred over int, foat other types
    String date() default "22/8/26"; // can pass default values or force other person to pass like version and so
}

@MyAnno(name = "Ajay", project = "Demo", version = "2.0")
public class UserAnno {
    // @MyAnno can be defined for classes, methods, local or instance variables, parameters
    // int x = 10;
    // @MyAnno
    public static void main(/*@MyAnno*/ String[] args) {
        // @MyAnno
        // int y = 20;
        
    }
    
}

