// enter no. of rows: 
// 5
// 1        1
// 12      21
// 123    321
// 1234  4321
// 1234554321

import java.util.Scanner;

public class j12 {
  public static void nForest(int n) {

    int space=2*(n-1);
    for (int i = 1; i <= n; i++) {

        for (int j = 1; j <= i; j++) {
          System.out.print(j);
        }

        //space
        for (int j = 1; j <= space; j++) {
          System.out.print(" ");
        }

        for (int j = i; j >= 1; j--) {
          System.out.print(j);
        }

      System.out.println();
      space-=2;

    }
  }
  
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter no. of rows: ");
    int n = sc.nextInt();
    nForest(n);
    sc.close();
  }
}
