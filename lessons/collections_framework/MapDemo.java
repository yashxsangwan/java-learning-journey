package lessons.collections_framework;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();

        students.put("Rahul", 89);
        students.put("Vicky", 92);
        students.put("Pooja", 78);
        students.put("David", 67);
        students.put("Rahul", 75); // Existing key updates the value instead of creating a duplicate

        // A Map key behaves like a Set because duplicate keys are not allowed.
        System.out.println(students);
        System.out.println(students.keySet());
        System.out.println(students.get("David"));
        System.out.println(students.size());

        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
