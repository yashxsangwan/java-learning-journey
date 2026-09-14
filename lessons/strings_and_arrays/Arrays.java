package lessons.strings_and_arrays;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Sum of array elements
        int[] arr1 = new int[5];
        System.out.print("Enter integer values in array: ");
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i = 0; i < arr1.length; i++){
            sum = sum + arr1[i]; // or sum += arr1[i];
        }
        System.out.print("Sum of array is: " + sum);
        System.out.println();

        // Searching a element using linear search
        int[] arr2 = {2,4,1,3,5,9,8,7,0};
        int key = 99;
        for(int i = 0; i < arr2.length; i++){
            if(key == arr2[i]){
                System.out.print("Found key element " + key + " at index: " + i);
                // System.exit(0); program stops here 
            }
        }
        // System.out.println("Key element not found."); this will only run if element not found due to .exit() method not executed
        sc.close();
    }
    
}

