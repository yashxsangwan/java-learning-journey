package lessons.strings_and_arrays;

public class Strings{
    public static void main(String[] args) {
        
        String name = "Yash";
        String str1 = new String("Java");
        String str2 = "Java";
        String str3 = "Java";
        System.out.println(name);
        System.out.println(str1 == str2); // checks reference
        System.out.println(str2 == str3);
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        String str4 = "     welcome     ";
        str4 = str4.trim(); // removes spaces
        System.out.println(str4);
        System.out.println(name.length());
        System.out.println(str4.substring(3));
        System.out.println(str4.substring(0,5));
        System.out.println(str4.concat(name));
        System.out.println(str4.charAt(5));
        System.out.println(str4.replace("e", "a"));
        System.out.println(str2.equals(str3)); // checks content

    }

}
