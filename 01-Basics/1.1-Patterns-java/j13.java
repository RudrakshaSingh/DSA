// enter no. of rows: 5
// 1
// 2  3
// 4  5  6
// 7  8  9  10
// 11 12 13 14 15
import java.util.Scanner;

public class j13 {

  public static void nForest(int n) {
    int  num=1;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        if (num<10) {
          System.out.print(num+"  ");
        } else {
          System.out.print(num+" ");
          
        }
        num++;
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter no. of rows: ");

    int n = sc.nextInt();
    nForest(n);
    sc.close();
  }

}

