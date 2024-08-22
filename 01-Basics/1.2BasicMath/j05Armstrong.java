// Problem Statement: Given an integer N, return true it is an Armstrong number otherwise return false.

// An Amrstrong number is a number that is equal to the sum of its own digits each 
// raised to the power of the number of digits.

import java.util.Scanner;

public class j05Armstrong {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Number : ");
    int N = sc.nextInt();
    sc.close();

    int k = Integer.toString(N).length();

    int sum = 0;
    int dup = N;
    while (N > 0) {
      int ld = N % 10;
      sum += Math.pow(ld, k);
      N = N / 10;
    }
    if (sum == dup) {
      System.out.println("Armstrong");
    } else {
      System.out.println("Not Armstrong");
    }
  }
}
