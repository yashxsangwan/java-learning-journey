package lessons.basics_and_control;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to see its multiplication table: ");
        int num = sc.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.println(num + " * " + i + " = " + (num * i));
        }

        System.out.print("Enter a number 'n' to see sum of 'n' numbers: ");
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;
        while(i <= n){
            sum = sum + i;
            i++;
        }
        System.out.println("Sum of " + n + " numbers is: " + sum);

        System.out.print("Enter a number to see the reverse of it: ");
        int initialNum = sc.nextInt();
        int number  = initialNum;
        int rev = 0;
        while(initialNum > 0){
            int rem = initialNum % 10;
            rev = rev * 10 + rem;
            initialNum /= 10;
        }
        System.out.println("Reverse of " + number + " is: " + rev);

        System.out.print("Enter a number to find its factorial: ");
        int f_num = sc.nextInt();
        int value = f_num;
        int fact = 1;
        while(f_num > 0){
            fact = fact * f_num;
            f_num--;
        }
        System.out.println("Factorial of " + value + " is: " + fact);

        sc.close();

    }
    
}

