// 3
// 1 
// 1 2 
// 2 2 3 
import java.util.Scanner;

public class j03 {

  public static void nForest(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j+" ");
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

