// Problem: Print from 1 to N using Recursion

import java.util.Scanner;

public class j04Problem02_1toN {

  public static void f(int i, int N) {
    if (i > N)
      return;
    System.out.println(i);
    f(i + 1, N);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Number : ");
    int N = sc.nextInt();
    sc.close();

    f(1, N);
  }
}
