package lessons.basics_and_control;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true){
            System.out.println("----Basic Calculator----");

            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            if(choice == 5){
                System.out.println("Exiting...");
                break;
            }

            System.out.print("Enter first number: ");
            float num1 = sc.nextFloat();
            
            System.out.print("Enter second number: ");
            float num2 = sc.nextFloat();

            switch(choice){
                case 1:
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Result: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Result: " + (num1 * num2));
                    break;
                case 4:
                    if(num2 == 0){
                        System.out.println("Cannot divide by zero.");
                    } else {
                        System.out.println("Result: " + (num1/ num2));
                    }
                    break;
                default:
                    System.out.println("Invalid option.");
            }

        }

        sc.close();

    }

}

