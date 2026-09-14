package lessons.methods;

import java.util.Scanner;

public class MethodOverloading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Task 1
        
        System.out.print("Enter length and breadth of rectangle: ");
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();
        double result1 = area(length, breadth);

        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();
        double result2 = area(radius);

        System.out.println("Area of rectsngle: " + result1);
        System.out.println("Area of circle: " + result2);

        // Task 2

        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int result3 = reverse(number);
        System.out.println("Reverse of " + number + " is: " + result3);

        int[] arr = new int[5];
        System.out.print("Enter an array of integers: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        reverse(arr);
        System.out.print("Reversed array is: ");
        for(int x: arr){
            System.out.print(x + " ");
        } 

        sc.close();
    }

    static double area(double l, double b){
        return l * b;
    }
    static double area(double r){
        return Math.PI * r * r;
    }
    static int reverse(int x){
        int rev = 0;
        while(x > 0){
            int rem = x % 10;
            rev = rev * 10 + rem;
            x /= 10;
        }
        return rev;
    }
    static void reverse(int[] a){
        int[] copyArr = new int[a.length];
        int j = 0;
        for(int i = a.length-1; i >= 0; i--){
            copyArr[j] = a[i];
            j++;
        }
        // below loop copies the reversed array into our local array which have the same reference as actual array in main so the actual array points/refer to the updated reversed array
        for(int i = 0; i < a.length; i++){
            a[i] = copyArr[i];
        }
    }
    
}

