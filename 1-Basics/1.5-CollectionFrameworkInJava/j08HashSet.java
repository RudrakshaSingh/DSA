import java.util.HashSet;
import java.util.Set;

public class j08HashSet {
  public static void main(String[] args) {
    Set<Integer> set = new HashSet<>();
    // it does all operation in O(1) //hashSet is most optimized

    // 1) add elements
    set.add(32);
    set.add(2);
    set.add(54);
    set.add(21);
    set.add(54);// will not be added as it does not add duplicate

    System.out.println(set);// gives in random order as it does hASHING INTERNALLY
    // it gives a unique set for ech number like 32 will always have one unique id
    // thewrefore dupluicate cannot be aded and this id called hashcode is put in
    // collection

    // 2) remove elements
    set.remove(54);
    System.out.println(set + "element removed");

    // 3) true if element inside set else false
    System.out.println(set.contains(21));
    System.out.println(set.contains(2221));

    // 4) if set empty then true else false
    System.out.println(set.isEmpty());

    // 5) number of elemenrt imnside set
    System.out.println(set.size());

    // 6) remove all element inside set
    set.clear();
    System.out.println(set);
  }
}