package lessons.strings_and_arrays;

public class RotateArray {
    public static void main(String[] args) {
        // Left rotation
        int[] arr = {2,5,1,7,9,23,56,32,27,19};
        for(int x: arr){
            System.out.print(x + " ");
        }
        System.out.println();
        int temp = arr[0];
        for(int i = 1; i < arr.length; i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
        for(int x: arr){
            System.out.print(x + " ");
        }
    }
    
}

