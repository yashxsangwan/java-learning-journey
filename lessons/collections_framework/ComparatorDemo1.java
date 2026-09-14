package lessons.collections_framework;
//package lessons.ComparatorDemo;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorDemo1 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();

        Comparator<Integer> com = new Comparator<>()
        {
            public int compare(Integer num1, Integer num2) {
                if(num1 % 10 > num2 % 10)
                    return 1;
                else
                    return -1;
            }

        };

        nums.add(27);
        nums.add(39);
        nums.add(41);
        nums.add(63);
        nums.add(72);

        Collections.sort(nums, com);

        System.out.println(nums);

    }
    
}
