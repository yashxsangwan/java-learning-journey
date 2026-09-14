package lessons.basics_and_control;

import java.util.Scanner;

public class ReadKeyboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // System.in is used to take input from keyboard
        int a, b, sum;
        System.out.println("Enter two numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        sum = a + b;
        System.out.println("Sum is " + sum);
        System.out.println("Enter your name: ");
        // .nextLine consumes the space left due to previous input
        // we have to consume that extra space
        sc.nextLine();
        String name = sc.nextLine(); // for sentence and .next() for a word
        System.out.println("Name: " + name);

        sc.close();

    }
    
}

