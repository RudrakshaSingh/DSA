// Problem Statement: You are given an array. The task is to reverse the array and print it. 

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class j12Problem10ReverseAnArrayWith2pointer {
  public static void reverseArray(ArrayList<Integer> arr, int r, int l) {

    if (l >= r) {
      System.out.println(arr);
      return;
    }

    // swapping
    Collections.swap(arr, r, l);
    l++;
    r--;

    reverseArray(arr, r, l);
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

    int r = arr.size() - 1;
    int l = 0;
    reverseArray(arr, r, l);
  }
}
