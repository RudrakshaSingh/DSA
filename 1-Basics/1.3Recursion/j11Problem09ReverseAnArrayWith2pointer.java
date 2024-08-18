// Problem Statement: You are given an array. The task is to reverse the array and print it. 

import java.util.Arrays;
import java.util.Scanner;

public class j11Problem09ReverseAnArrayWith2pointer {
  public static void reverseArray(int[] arr, int r, int l) {

    if (l >= r) {
      System.out.println(Arrays.toString(arr));
      return;
    }

    // swapping
    int temp = arr[l];
    arr[l] = arr[r];
    arr[r] = temp;
    System.out.println(l + " " + r);
    l++;
    r--;

    reverseArray(arr, r, l);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Size of array : ");
    int n = sc.nextInt();
    System.out.println();

    int arr[] = new int[n];
    System.out.println("Enter elemnts of array");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();

    int r = arr.length - 1;
    int l = 0;
    reverseArray(arr, r, l);
  }
}
