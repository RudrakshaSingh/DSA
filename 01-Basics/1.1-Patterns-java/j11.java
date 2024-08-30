// 5
// 1
// 01
// 101
// 0101
// 10101
import java.util.Scanner;

public class j11 {
  public static void nForest(int n) {
    int star=1;

    for (int i = 1; i <= n; i++) {

      if (i%2==0) {
        star=0;
      }else{
        star=1;
      }
      for (int j = 1; j <=i ; j++) {
        System.out.print(star);
        star=1-star;
      }
      System.out.println();
    }
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    nForest(n);
    sc.close();
  }
}
