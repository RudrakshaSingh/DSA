import java.util.ArrayDeque;

public class j06Arraydeque {
  public static void main(String[] args) {
    // We can implement stack from Ara deque
    // spoken as array deck

    // It is a doubly ended queue. it can enter or pull element from both sides and
    // peak from both sides
    // It has been implemented by Queue so it has all the methods of it

    // it has its own unique prop also

    ArrayDeque<Integer> adq = new ArrayDeque<>();

    // a) add elemnt
    adq.offer(13); // add from end
    adq.offerFirst(12);
    adq.offerLast(14); // add from end

    System.out.println(adq);

    // b) pull of remove elemnt
    // adq.poll(); // remove from front
    // adq.pollFirst();// remove from front
    // adq.pollLast();

    // c) peek
    adq.peek();
    adq.peekFirst();
    adq.peekLast();

    System.out.println(adq);
  }
}
