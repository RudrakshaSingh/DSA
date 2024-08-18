// Problem: Print from N to 1 using Recursion

import java.util.Scanner;

public class j05Problem03_NTo1 {

  public static void f(int i, int N) {
    if (i < 1)
      return;
    System.out.println(i);
    f(i - 1, N);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Number : ");
    int N = sc.nextInt();
    sc.close();

    f(N, N);
  }
}
