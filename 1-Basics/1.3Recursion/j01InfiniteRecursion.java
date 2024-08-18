public class j01InfiniteRecursion {
  public static void print() {
    System.out.println(1);
    print();
  }

  public static void main(String[] args) {
    System.out.println("starting");
    print();
  }
}
