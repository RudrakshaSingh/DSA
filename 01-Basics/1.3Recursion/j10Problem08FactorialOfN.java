import java.util.Scanner;

public class j10Problem08FactorialOfN {
  public static int f(int N) {
    if (N == 1) {
      return 1;
    }
    return N * f(N - 1);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Number : ");
    int N = sc.nextInt();
    sc.close();

    int sum = f(N);
    System.out.println(sum);
  }
}