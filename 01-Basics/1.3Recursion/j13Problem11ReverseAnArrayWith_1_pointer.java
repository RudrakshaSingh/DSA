// Problem Statement: You are given an array. The task is to reverse the array and print it. 

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class j13Problem11ReverseAnArrayWith_1_pointer {
  public static void reverseArray(ArrayList<Integer> arr, int i) {
    int n = arr.size();
    if (i >= n / 2) {
      System.out.println(arr);
      return;
    }

    // swapping
    Collections.swap(arr, i, n - i - 1);

    i++;

    reverseArray(arr, i);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Size of array : ");
    int n = sc.nextInt();
    System.out.println();

    ArrayList<Integer> arr = new ArrayList<>();
    System.out.println("Enter elemnts of array");
    for (int i = 0; i < n; i++) {
      arr.add(sc.nextInt());
    }
    sc.close();

    reverseArray(arr, 0);
  }
}
