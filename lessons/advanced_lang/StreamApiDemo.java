package lessons.advanced_lang;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
// import java.util.function.Consumer;

public class StreamApiDemo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(3, 7, 9, 4, 6);

        // Consumer<Integer> con = n -> System.out.println(n); 
        // since we are assigning this expression to con, we can use this exp. instead of con, shown below and don't need Consumer object

        /*
        Stream<Integer> s1 = nums.stream();

        // s1.forEach(n -> System.out.println(n)); // can only be used once
        // s1.forEach(n -> System.out.println(n)); // will show error

        Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);
        // s2.forEach(n -> System.out.println(n));
        Stream<Integer> s3 = s2.map(n -> n * 2);
        // s3.forEach(n -> System.out.println(n));
        int result = s3.reduce(0, (c, e) -> c + e); // performs same function as the loop mentiond last/lowest  in program

        System.out.println(result);
        */

        int result = nums.stream()
                        .filter(n -> n % 2 == 0)
                        .map(n -> n * 2)
                        .reduce(0, (c, e) -> c + e);

        System.out.println(result);

        /* Explanation
        nums.stream() will create a stream
        on that stream, I am apllying filter() so only even number wil be kept
        again a new stream will be created
        on that stream, I am applying map() which will double each remaining number
        again a new stream will be created
        on that stream, I am applying reduce() combines all values into a sum
        */
        


        //nums.forEach(n -> System.out.println(n));

        /*
        Consumer<Integer> con = new Consumer<Integer>() {

            public void accept(Integer n) { // accept() accepts value and we define what do with the value
                System.out.println(n); // in this case, we want to print it
            }
        };
        */

        // nums.forEach(con); // forEach() methods return one value at a time. that value goes into Consumer object which has only one method accept()

        /*
        for(int n : nums) {
            System.out.println(n);
        }
        */

        /*
        for(int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
        }
        */

        /*
        int sum = 0;
        for(int n : nums) {
            if(n % 2 == 0) {
                n = n * 2;
                sum = sum + n;
            }
        }

        System.out.println(sum);
        */
        
    }
    
}
