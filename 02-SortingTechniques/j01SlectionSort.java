import java.util.Scanner;

//bublle sort time complexity id O(n^2)
public class j01SlectionSort {

  public static void Selection(int[] arr, int n) {
    for (int i = 0; i <= n - 2; i++) {// till second last element
      int minimun = i;
      for (int j = i; j <= n - 1; j++) {
        if (arr[j] < arr[minimun]) {
          minimun = j;
        }

      }
      // swap
      int temp = arr[minimun];
      arr[minimun] = arr[i];
      arr[i] = temp;
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

    Selection(arr, n);

  }
}