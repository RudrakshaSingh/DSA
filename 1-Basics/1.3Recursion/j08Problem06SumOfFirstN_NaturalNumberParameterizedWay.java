// Problem statement: Given a number ‘N’, find out the sum of the first N natural numbers.

import java.util.Scanner;

public class j08Problem06SumOfFirstN_NaturalNumberParameterizedWay {

  public static void f(int i, int sum) {
    if (i < 0) {
      System.out.println(sum);
      return;
    }
    f(i - 1, sum + i);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Number : ");
    int N = sc.nextInt();
    sc.close();

    f(N, 0);
  }
}