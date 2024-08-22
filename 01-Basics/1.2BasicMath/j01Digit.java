// Given an integer N, return the number of digits in N.

import java.util.Scanner;

public class j01Digit {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Number : ");
    int N = sc.nextInt();

    int count = 0;
    while (N > 0) {
      count++;
      N = N / 10;
    }
    System.out.println(count);

    ///////// another way////////////
    System.out.print("Enter the second Number : ");
    int No = sc.nextInt();
    sc.close();
    int co = (int) (Math.log10(No) + 1);
    System.out.println(co);

  }
}
