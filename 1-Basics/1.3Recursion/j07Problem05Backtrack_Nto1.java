// Problem statement: Given a number ‘N’, print N to 1(but by backtracking)

import java.util.Scanner;

public class j07Problem05Backtrack_Nto1 {

  public static void f(int i, int N) {
    if (i > N)
      return;
    f(i + 1, N);
    System.out.println(i);

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Number : ");
    int N = sc.nextInt();
    sc.close();

    f(1, N);
  }
}
