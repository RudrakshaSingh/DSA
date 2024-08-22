import java.util.ArrayList;
import java.util.Iterator;;

public class j01ArrayList {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();

    // add a new element at end
    list.add(1);
    list.add(2);
    System.out.println(list + "add a new element at end");

    // add ro a particular index
    list.add(1, 22);
    System.out.println(list + "add ro a particular index");

    // add another list to current list
    ArrayList<Integer> newList = new ArrayList<>();
    newList.add(111);
    newList.add(222);

    list.addAll(newList);
    System.out.println(list + "add another list to current list");

    // to get element from arraylist
    System.out.println(list.get(4) + " to get element from arraylist");

    // remove element from index
    list.remove(1);
    System.out.println(list + "remove element from index 1");

    // remove element directly not by position
    list.remove(Integer.valueOf(222));
    System.out.println(list + " remove element directly not by position");

    // to remove all elements
    list.clear();
    System.out.println(list + " to remove all elements");

    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);

    // to update value of element at index
    list.set(4, 55);
    System.out.println(list);

    // to check if element is present
    System.out.println(list.contains(55));

    // iterating over arraylist 3 ways

    // a)for loop
    for (int i = 0; i < list.size(); i++) {
      System.out.println("the elemnt using for loop is : " + list.get(i));
    }

    // b)foreach loop
    for (Integer element1 : list) {
      System.out.println("the elemnt using foreach loop is : " + element1);

    }

    // c)Iterator
    Iterator<Integer> it = list.iterator();

    while (it.hasNext()) {
      System.out.println("iterator " + it.next());
    }
  }
}
