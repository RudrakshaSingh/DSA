
// enter no. of rows: 5
// *        *
// **      **
// ***    ***
// ****  ****
// **********
// ****  ****
// ***    ***
// **      **
// *        *
import java.util.Scanner;

public class j20 {

  public static void nForest(int n) {
    int space = 2 * n - 2;

    for (int i = 1; i <= 2 * n - 1; i++) {
      int stars = i;
      if (i > n) {
        stars = 2 * n - i;
      }

      // stars
      for (int j = 1; j <= stars; j++) {
        System.out.print("*");
      }

      // space
      for (int j = 0; j < space; j++) {
        System.out.print(" ");
      }

      // stars
      for (int j = 1; j <= stars; j++) {
        System.out.print("*");
      }

      if (i >= n) {
        space += 2;
      } else {
        space -= 2;
      }
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
