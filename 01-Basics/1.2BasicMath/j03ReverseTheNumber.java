import java.util.Scanner;

public class j03ReverseTheNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Number : ");
    int N = sc.nextInt();
    sc.close();

    int revNo = 0;
    while (N > 0) {
      int lastDigir = N % 10;
      N = N / 10;
      revNo = (revNo * 10) + lastDigir;
    }
    System.out.println(revNo);
  }
}
