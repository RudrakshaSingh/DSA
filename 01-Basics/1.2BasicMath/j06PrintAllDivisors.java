// Problem Statement: Given an integer N, return all divisors of N.

// A divisor of an integer N is a positive integer that divides N without leaving a remainder. In other words, 
// if N is divisible by another integer without any remainder, then that integer is considered a divisor of N.

import java.util.Scanner;

public class j06PrintAllDivisors {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Number : ");
    int n = sc.nextInt();
    sc.close();

    for (int i = 1; i <= n; i++) {
      if (n % i == 0) {
        System.out.print(i + " ");
      }
    }
    System.out.println();
    //////////////////////// better approch////////////////
    System.out.println("better approch in j07");
  }
}
