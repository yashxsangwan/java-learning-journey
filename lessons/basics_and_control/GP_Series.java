package lessons.basics_and_control;

import java.util.Scanner;

public class GP_Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----Geometric Progession(GP) series----");
        System.out.print("Enter first term: ");
        int first = sc.nextInt();
        System.out.print("Enter common ratio: ");
        int commonRatio = sc.nextInt();
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int term = first;
        for(int i = 1; i <= n; i++){
            System.out.print(term + ", ");
            term = term * commonRatio;
        }

        sc.close();
    }
    
}

