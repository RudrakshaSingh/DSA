// enter no. of rows: 5
// A
// B B
// C C C
// D D D D
// E E E E E
import java.util.Scanner;

public class j16 {

  public static void nForest(int n) {
    for (int i = 0; i < n; i++) {
      char ch = (char)('A'+i);
      for(int j=0 ; j<=i ; j++){
        System.out.print(ch + " ");
        
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

