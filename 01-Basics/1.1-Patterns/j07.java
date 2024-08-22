// 5
//     *    
//    ***   
//   *****  
//  *******
// *********
import java.util.Scanner;

public class j07 {
  public static void nForest(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n-i-1; j++) {
        System.out.print(" ");
      }
      for (int j = 0; j < 2*i+1; j++) {
        System.out.print("*");
      }
      for (int j = 0; j < n-i-1; j++) {
        System.out.print(" ");
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
