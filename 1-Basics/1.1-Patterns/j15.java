// enter no. of rows: 5
// A B C D E
// A B C D
// A B C
// A B
// A
import java.util.Scanner;

public class j15 {

  public static void nForest(int n) {
    for (int i = 0; i < n; i++) {
      for(char ch = 'A'; ch<'A'+n-i;ch++){
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

