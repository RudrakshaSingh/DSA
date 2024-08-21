import java.util.HashMap;
import java.util.Map;

public class j12HashMap {
  public static void main(String[] args) {
    // keys are all unique in it
    // O(1)

    Map<String, Integer> num = new HashMap<>();

    // 1) add value
    num.put("one", 1);
    num.put("two", 2);
    num.put("three", 3);
    num.put("four", 4);
    num.put("five", 5);
    num.put("five", 55);// it will overwrite the above value

    System.out.println(num);

    // 2) add if not present
    num.putIfAbsent("five", 555);

    // ---- or
    if (!num.containsKey("two")) {
      num.putIfAbsent("five", 555);
    }

    System.out.println(num);

    // 3)remove element
    num.remove("five");
    System.out.println(num + "removing");

    // 4) check if key is present(true) else false
    System.out.println(num.containsKey("four"));

    // 5) check if value is present(true) else false
    System.out.println(num.containsValue(4));

    // 6)Iterating over map

    for (Map.Entry<String, Integer> e : num.entrySet()) {
      System.out.println(e);

      // for only key
      System.out.println(e.getKey());

      // for value only
      System.out.println(e.getValue());
    }

    // ---- for iterating only on keys
    System.out.println("for iterating only on keys");
    for (String key : num.keySet()) {
      System.out.println(key);
    }

    // ---- for iterating only on values
    System.out.println("for iterating only on values");
    for (Integer value : num.values()) {
      System.out.println(value);
    }

    // 7) to cheeck if map is empty(true) or not
    System.out.println(num.isEmpty());

    // 8) to clear map
    num.clear();
    System.out.println(num);
  }

}
