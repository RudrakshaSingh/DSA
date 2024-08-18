import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class j07ArrayList_InJava {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>(); // Initial empty ArrayList

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Number : ");
    int n = sc.nextInt();
    sc.close();
    for (int i = 1; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        list.add(i);
        if ((n / i) != i) {
          list.add((n / i));
        }
      }

    }
    Collections.sort(list);
    System.out.println(list);

  }

}
