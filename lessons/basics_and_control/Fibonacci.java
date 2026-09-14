package lessons.basics_and_control;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----FIbonacci series----");
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
        int first = 0;
        int second = 1;
        
        System.out.print(first + ", " + second + ", ");
        for(int i = 0; i < n; i++){
            int fibo = first + second;
            System.out.print(fibo + ", ");
            first = second;
            second = fibo;
        }

        sc.close();
    }
    
}

