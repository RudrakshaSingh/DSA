// Problem: Print your Name N times using recursion

import java.util.Scanner;

public class j03Problem01NameNTimes {

  public static void f(int i, int N) {
    if (i > N)
      return;
    System.out.println("Rudra");
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
