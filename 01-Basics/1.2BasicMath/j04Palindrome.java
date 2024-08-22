// Problem Statement: Given an integer N, return true if it is a palindrome else return false.

// A palindrome is a number that reads the same backward as forward. For example, 121, 1331, and 4554 
// are palindromes because they remain the same when their digits are reversed.

import java.util.Scanner;

public class j04Palindrome {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Number : ");
    int N = sc.nextInt();
    sc.close();

    int n = N;
    int revNo = 0;
    while (N > 0) {
      int lastDigir = N % 10;
      N = N / 10;
      revNo = (revNo * 10) + lastDigir;
    }
    if (n == revNo) {
      System.out.println("it is palindrome");
    } else {
      System.out.println("it is not palindrome");

    }
  }
}
