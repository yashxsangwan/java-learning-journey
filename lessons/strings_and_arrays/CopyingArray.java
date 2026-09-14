package lessons.strings_and_arrays;

public class CopyingArray {
    public static void main(String[] args) {
        int[] a = {10,20,30,40,50};
        int[] b = new int[a.length];

        /* 
        for(int i = 0; i < a.length; i++){
            b[i] = a[i];
        }
        for(int x: b){
            System.out.print(x + " ");
        }
        */

        // Reverse copying an array

        int j = 0;

        for(int i = a.length-1; i >= 0; i--){
            b[j] = a[i];
            j++;
        }
        System.out.print("Array (a): ");
        for(int x: a){
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.print("Reverse copied array (b): ");
        for(int x: b){
            System.out.print(x + " ");
        }
        System.out.println();

        // Increasing the size of array
        // This is the simpler internal implementation of ArrayList which automatically increases its size

        int[] c = {11,22,33,44,55};
        int[] d = new int[2*c.length];

        System.out.println("Length of c before increasing size: " + c.length);

        for(int i = 0; i < c.length; i++){
            d[i] = c[i];
        }
        c = d;
        d = null;

        System.out.println("Length of c after increasing size: " + c.length);
        
    }
    
}

