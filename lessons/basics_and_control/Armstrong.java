package lessons.basics_and_control;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Armstrong number

        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int initialNum = number;
        int sum = 0;
        while(number > 0) {
            int rem = number % 10;
            sum += rem * rem * rem;
            number /= 10;
        }
        if(sum == initialNum) {
            System.out.println(initialNum + " is an Armstrong number.");
        } else {
            System.out.println(initialNum + " is not an Armstrong number.");
        }

        sc.close();

    }
    
}

