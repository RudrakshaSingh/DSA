import java.util.Arrays;

public class j14ArraysClass {
  public static void main(String[] args) {
    // as collection framework is done previously .
    // arrays class and collections class provides some other functionalities

    // 1) binary search- work only on sorted array
    int num[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

    int index = Arrays.binarySearch(num, 4);
    System.out.println(index);

    // 2) sort
    int num2[] = { 2, 4, 2, 32, 23, 5, 21, 543 };
    Arrays.sort(num2);
    for (int i : num2) {
      System.out.print(i + " ");
    }
    System.out.println();

    // 3) to fill a array with same value
    Arrays.fill(num2, 12);
    for (int i : num2) {
      System.out.print(i + " ");
    }
    System.out.println();
  }
}
