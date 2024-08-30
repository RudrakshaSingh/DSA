
// enter no. of rows: 5
// *****
// *   *
// *   *
// *   *
// *****
import java.util.Scanner;

public class j21 {

  public static void nForest(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
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
