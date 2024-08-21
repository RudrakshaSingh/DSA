import java.util.Stack;

public class j02Stack {
  public static void main(String[] args) {
    Stack<String> animals = new Stack<>();

    // to add elements in stack
    animals.push("lion");
    animals.push("bear");
    animals.push("rabbit");
    animals.push("butterfly");
    System.out.println(animals);

    // to check element at top
    System.out.println(animals.peek());

    // to pop/remove element at top of stack
    System.out.println(animals.pop());
    System.out.println(animals);

  }
}
