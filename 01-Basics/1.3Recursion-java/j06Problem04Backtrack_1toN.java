// Problem statement: Given a number ‘N’, print 1 to N(but by backtracking)

import java.util.Scanner;

public class j06Problem04Backtrack_1toN {

  public static void f(int i, int N) {
    if (i < 1)
      return;
    f(i - 1, N);
    System.out.println(i);

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Number : ");
    int N = sc.nextInt();
    sc.close();

    f(N, N);
  }
}
