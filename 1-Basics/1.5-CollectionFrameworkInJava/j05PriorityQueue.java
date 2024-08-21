import java.util.Comparator;
import java.util.PriorityQueue;

public class j05PriorityQueue {
  public static void main(String[] args) {

    // used to implement manip and maxip etc
    // To implement Queue but with priority
    // Q is implementing priority queues of all function of queue can be used

    PriorityQueue<Integer> pq = new PriorityQueue<>();
    // or
    // Queue<Integer> pq=new PriorityQueue<>();

    // a) adding
    pq.offer(40);
    pq.offer(12);
    pq.offer(24);
    pq.offer(36);
    System.out.println(pq);
    // gives diffrent order in output as it uses minheap internally

    // b)removes and return elemnt with highest priority(smallest)
    System.out.println(pq.poll());
    System.out.println(pq);

    // c)next element to get out
    System.out.println(pq.peek());

    // d)to make priority of biggest number the highest
    PriorityQueue<Integer> pq1 = new PriorityQueue<>(Comparator.reverseOrder()); // makes use of max-heap now

    pq1.offer(3);
  }
}
