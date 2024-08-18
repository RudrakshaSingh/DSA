import java.util.Scanner;

public class j12_GCD_Optimal_EuclideanAlgo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Number : ");
    int n1 = sc.nextInt();
    System.out.print("Enter the second Number : ");
    int n2 = sc.nextInt();
    sc.close();

    while (n1 > 0 && n2 > 0) {
      if (n1 > n2) {
        n1 = n1 % n2;
      } else {
        n2 = n2 % n1;
      }
    }
    if (n1 == 0) {
      System.out.println(n2);
    } else {
      System.out.println(n1);
    }
  }
}
