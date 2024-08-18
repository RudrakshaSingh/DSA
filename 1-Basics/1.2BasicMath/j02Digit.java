// Given a number n. Count the number of digits in n which evenly divide n. Return an integer, total 
// number of digits of n which divides n evenly.

import java.util.Scanner;

public class j02Digit {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Number : ");
    int N = sc.nextInt();
    sc.close();

    int n = N;
    int count = 0;

    while (n > 0) {

      int digits = n % 10;
      if (digits != 0 && N % digits == 0) {
        count++;
      }

      n = n / 10;
    }
    System.out.println(count);
  }
}
