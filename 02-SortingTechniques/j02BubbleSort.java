//bublle sort avg case and worst case id O(n^2)
//best case is O(n) with optimization

import java.util.Scanner;

public class j02BubbleSort {
  public static void bubble(int[] arr, int n) {
    for (int i = n - 1; i >= 1; i--) {
      for (int j = 0; j <= i - 1; j++) {

        if (arr[j] > arr[j + 1]) {
          // swap
          int temp = arr[j + 1];
          arr[j + 1] = arr[j];
          arr[j] = temp;
        }
      }
    }

    for (int i : arr) {
      System.out.print(i + " ");
      // for eACH LOOP ITERATES OVER VALUES OF ARRAY NOT index therefore dont use
      // arr[i]
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size of array : ");
    int n = sc.nextInt();
    System.out.println();

    int arr[] = new int[n];

    System.out.println("Enter elements of arrays to store: ");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    sc.close();

    bubble(arr, n);

  }
}