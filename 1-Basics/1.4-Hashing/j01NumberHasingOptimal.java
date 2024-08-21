// Given an array of integers: [1, 2, 1, 3, 2] and we are given some queries: [1, 3, 4, 2, 10]. 
// For each query, we need to find out how many times the number appears in the array. For example, if 
// the query is 1 our answer would be 2, and if the query is 4 the answer will be 0. 

import java.util.Scanner;

public class j01NumberHasingOptimal {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("EnterSize Of Array: ");
    int n = sc.nextInt();
    System.out.println();

    System.out.println("Enter Elements OF Array: ");
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    // precompute:
    int[] hash = new int[13];
    for (int i = 0; i < n; i++) {
      hash[arr[i]] += 1;
    }

    System.out.print("Enter number elements to serach total : ");

    int q = sc.nextInt();
    System.out.println("Enter number elements to serach");
    while (q-- != 0) {
      int number = sc.nextInt();
      // fetching:
      System.out.println("Number of times " + number + " appaers is : " + hash[number]);
    }
    sc.close();
  }
}
