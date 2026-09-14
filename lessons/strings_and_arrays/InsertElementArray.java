package lessons.strings_and_arrays;

import java.util.Scanner;

public class InsertElementArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        arr[0] = 5;
        arr[1] = 9;
        arr[2] = 6;
        arr[3] = 10;
        arr[4] = 12;
        arr[5] = 7;

        /* System.out.println("Enter an array of integers: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        } */
        System.out.print("Enter a element to insert in the array: ");
        int element = sc.nextInt();
        System.out.print("Enter the index at which element is to be inserted: ");
        int index = sc.nextInt();

        System.out.print("Array before insertion: ");
        for(int x: arr){
            System.out.print(x + " ");
        }

        // int temp = arr[index]; remove it from comment before running
        for(int i = arr.length-1; i >= index; i--){
            arr[i] = arr[i-1];
        }
        arr[index] = element;
        System.out.println();
        System.out.print("Array after insertion: ");
        for(int x: arr){
            System.out.print(x + " ");
        }

        sc.close();
    }
    
}

