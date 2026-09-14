package lessons.methods;

import java.util.Scanner;

public class MethodPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean result1 = isPrime(num);
        System.out.println(num + " is prime? " + result1);

        System.out.print("Enter two numbers for gcd: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int result2 = gcd(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + result2);

        sc.close();
    }

    static boolean isPrime(int n){
        for(int i = 2; i <= n/2; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    static int gcd(int a, int b){
        while(true){ // problem if input is zero, runs infinitely
            if(a > b){     
                a -= b;
            }
            else if(b > a){
                b -= a;
            }
            else{
                return a;
            }
        }
    }
    
}

