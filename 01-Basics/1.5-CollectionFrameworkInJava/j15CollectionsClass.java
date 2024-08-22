import java.util.ArrayList;
import java.util.Collections;

public class j15CollectionsClass {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();

    list.add(32);
    list.add(324);
    list.add(43);
    list.add(4);
    list.add(9);
    list.add(4);

    // 1) to find minimum value
    System.out.println(Collections.min(list));

    // 2) to find maximum value
    System.out.println(Collections.max(list));

    // 3) to find frequency of value
    System.out.println(Collections.frequency(list, 4));

    // 4) sort
    System.out.println(list);
    Collections.sort(list);// sorting
    System.out.println(list);

  }
}
