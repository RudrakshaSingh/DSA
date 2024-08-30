
// enter no. of rows: 5
// **********
// ****  ****
// ***    ***
// **      **
// *        *
// *        *
// **      **
// ***    ***
// ****  ****
// **********
import java.util.Scanner;

public class j19 {

  public static void nForest(int n) {
    int space = 0;
    for (int i = 1; i <= n; i++) {

      // stars
      for (int j = 0; j <= n - i; j++) {
        System.out.print("*");
      }

      // space
      for (int j = 0; j < space; j++) {
        System.out.print(" ");
      }

      // stars
      for (int j = 0; j <= n - i; j++) {
        System.out.print("*");
      }
      space += 2;
      System.out.println();
    }

    space = 2 * n - 2;
    for (int i = 1; i <= n; i++) {

      // stars
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }

      // space
      for (int j = 0; j < space; j++) {
        System.out.print(" ");
      }

      // stars
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      space -= 2;
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter no. of rows: ");

    int n = sc.nextInt();
    nForest(n);
    sc.close();
  }

}
