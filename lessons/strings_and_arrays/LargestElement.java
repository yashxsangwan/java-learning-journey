package lessons.strings_and_arrays;

import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {1,2,43,8,4,11,670,19,43,15,40,580};
        int largest = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        System.out.print("Largest element in array is: " + largest);
        System.out.println();

        int secondLargest = arr[0];
        for(int j = 0; j < arr.length; j++){
            if(arr[j] < largest && arr[j] > secondLargest){
                secondLargest = arr[j];
            }
        }
        System.out.print("Second largest element is: " + secondLargest);

        sc.close();
    }
    
}

