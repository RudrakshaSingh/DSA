
// enter no. of rows: 5
//     A
//    ABC
//   ABCDC
//  ABCDEDC
// ABCDEFEDC
import java.util.Scanner;

public class j17 {
  public static void nForest(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        System.out.print(" ");
      }

      char ch = 'A';
      int breakpoint = (2 * i + 1) / 2;
      for (int j = 1; j <= (2 * i) + 1; j++) {
        System.out.print(ch);
        if (j <= breakpoint)
          ch++;
        else
          ch--;
      }

      for (int j = 0; j < n - i - 1; j++) {
        System.out.print(" ");
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
