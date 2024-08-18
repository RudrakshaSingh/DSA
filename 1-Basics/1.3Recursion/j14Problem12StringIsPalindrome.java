// Problem Statement: "Given a string, check if the string is palindrome or not."  A string is said to 
// be palindrome if the reverse of the string is the same as the string.

import java.util.Scanner;

public class j14Problem12StringIsPalindrome {
  public static boolean palindrome(String str, int i) {
    int n = str.length();
    if (i >= n / 2)
      return true;

    if (str.charAt(i) != str.charAt(n - i - 1))
      return false;

    i++;

    return palindrome(str, i);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the string : ");
    String str = sc.nextLine();
    System.out.println();
    sc.close();

    System.out.println(palindrome(str, 0));

  }
}
