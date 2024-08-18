import java.util.Scanner;

public class j09CheckForPrimeOptimal {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Number : ");
    int n = sc.nextInt();
    sc.close();

    int count = 0;
    for (int i = 1; i * i <= n; i++) {
      if (n % i == 0) {
        count++;
        if ((n / i) != i) {
          count++;
        }
      }
    }
    if (count == 2) {
      System.out.println("prime");
    } else {
      System.out.println("not prime");
    }
  }
}
