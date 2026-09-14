package lessons.strings_and_arrays;

import java.util.Scanner;

public class DeleteElementArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10,20,30,40,50,60};
        
        System.out.print("Enter the element's index to delete: ");
        int index = sc.nextInt();

        if (index < 0 || index >= arr.length) {
            System.out.println("Invalid index");
        } else {
            System.out.print("Array before deletion: ");
            for(int x: arr){
                System.out.print(x + " ");
            }
            System.out.println();
            System.out.println("Deleted element: " + arr[index]);
            for (int i = index + 1; i < arr.length; i++) {
                arr[i - 1] = arr[i];
            }

            System.out.print("Array after deletion: ");
            for (int i = 0; i < arr.length - 1; i++) {
                System.out.print(arr[i] + " ");
            }
        }

        sc.close();
    }
    
}

