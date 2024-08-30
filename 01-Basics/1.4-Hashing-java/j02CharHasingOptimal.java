import java.util.Scanner;

public class j02CharHasingOptimal {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter String: ");
    String n = sc.nextLine();
    System.out.println();

    // precompute:
    int[] hash = new int[26];
    for (int i = 0; i < n.length(); i++) {
      hash[n.charAt(i) - 'a'] += 1;
    }

    System.out.print("Enter number characters to serach total : ");
    int q = sc.nextInt();
    while (q-- != 0) {
      System.out.println("Enter single character serach : ");

      char character = sc.next().charAt(0);
      // fetching:
      if (character >= 'a' && character <= 'z') {
        // Fetching and printing the count
        System.out.println("Number of times " + character + " appears is: " + hash[character - 'a']);
      } else {
        System.out.println("Character out of range. Please enter a lowercase letter.");
      }
    }
    sc.close();
  }
}
