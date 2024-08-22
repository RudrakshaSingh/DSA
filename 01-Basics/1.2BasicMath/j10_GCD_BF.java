//GCD orHCF
// Problem Statement: Given two integers N1 and N2, find their greatest common divisor.

// The Greatest Common Divisor of any two integers is the largest number that divides both integers.

import java.util.Scanner;

public class j10_GCD_BF {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Number : ");
    int n1 = sc.nextInt();
    System.out.print("Enter the second Number : ");
    int n2 = sc.nextInt();
    sc.close();

    int gcd = 1;
    int n = Math.min(n1, n2);
    for (int i = 1; i <= n; i++) {
      if (n1 % i == 0 && n2 % i == 0) {
        gcd = i;
      }
    }
    System.out.println(gcd);
  }
}
