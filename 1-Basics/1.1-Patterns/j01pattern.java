// Enter the size of the forest (n): 5
// * * * * * 
// * * * * * 
// * * * * * 
// * * * * *
// * * * * *

import java.util.Scanner;

public class j01pattern {
    public static void nForest(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the forest (n): ");
        int n = scanner.nextInt();

        nForest(n);

        scanner.close();
    }
}