package lessons.basics_and_control;

import java.util.Scanner;

public class NumberIntoWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        String str = null;

        while(number > 0){
            int rem = number % 10;
            str += rem;
            number /= 10;
        }

        char character = '0';
        System.out.println("----Number in words----");
        for(int i = str.length() - 1; i >= 0; i--){
            character = str.charAt(i);
            switch(character){
                case '0': System.out.print("Zero ");
                break;
                case '1': System.out.print("One ");
                break;
                case '2': System.out.print("Two ");
                break;
                case '3': System.out.print("Three ");
                break;
                case '4': System.out.print("Four ");
                break;
                case '5': System.out.print("Five ");
                break;
                case '6': System.out.print("Six ");
                break;
                case '7': System.out.print("Seven ");
                break;
                case '8': System.out.print("Eight ");
                break;
                case '9': System.out.print("Nine ");
                break;
            }            

        }
        sc.close();
    }
    
}

