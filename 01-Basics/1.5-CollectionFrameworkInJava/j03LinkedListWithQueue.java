import java.util.LinkedList;
import java.util.Queue;

public class j03LinkedListWithQueue {
  public static void main(String[] args) {
    Queue<Integer> queue = new LinkedList<>();

    // ----------------to add element in
    // queue-------------------------------------------------------------

    // queue.offer(element)=> if task succesfull return true else false
    queue.offer(12);
    queue.offer(13);

    // queue.add(element)=>if successfully added return true else throws an
    // exception and crashes the program
    queue.add(14);
    queue.add(15);

    System.out.println(queue);

    // -------------------to take element out of
    // queue-----------------------------------------------
    // queue.poll()=> remove as well as return the removed value.give null if queue
    // is empty
    System.out.println(queue.poll());

    // queue.remove()=>remove as well as return the removed value. throws an
    // exception and crashes the program if queue is null
    System.out.println(queue.remove());

    System.out.println(queue);

    // -----------------------which elemnt is next to get
    // out------------------------------------------------
    // queue.peek()=>return the element else null if empty
    System.out.println(queue.peek());

    // queue.element()=>return the element else throws an
    // exception and crashes the program if queue is null
    System.out.println(queue.element());

  }
}
