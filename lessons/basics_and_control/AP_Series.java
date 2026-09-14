package lessons.basics_and_control;

import java.util.Scanner;

public class AP_Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----Arithmetic Progession(AP) series----");
        System.out.print("Enter first term: ");
        int first = sc.nextInt();
        System.out.print("Enter common difference: ");
        int d = sc.nextInt();
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int term = first;
        
        for(int i = 0; i < n; i++){
            System.out.print(term + ", ");
            term += d;
        }

        sc.close(); 
    }
    
}

