import java.util.Scanner;

public class j11_GCD_BF2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Number : ");
    int n1 = sc.nextInt();
    System.out.print("Enter the second Number : ");
    int n2 = sc.nextInt();
    sc.close();

    int gcd = 1;
    int n = Math.min(n1, n2);
    for (int i = n; i >= 1; i--) {
      if (n1 % i == 0 && n2 % i == 0) {
        gcd = i;
        break;
      }
    }
    System.out.println(gcd);
  }
}
