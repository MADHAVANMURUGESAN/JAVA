import java.util.*;

public class QueueConcept {
    public static void main(String[] args) {
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(12);
        priorityQueue.add(8);
        priorityQueue.add(24);
        priorityQueue.add(5);
        System.out.println("priorityQueue: " + priorityQueue);
        System.out.println("priorityQueue.peek(): " + priorityQueue.peek());
        System.out.println("priorityQueue: " + priorityQueue);
        System.out.println("priorityQueue.poll(): " + priorityQueue.poll());
        System.out.println("priorityQueue: " + priorityQueue);
        priorityQueue.add(36);
        System.out.println("priorityQueue: " + priorityQueue);


        // Initializing an deque
        ArrayDeque<Integer> de_que
                = new ArrayDeque<Integer>(10);
        // add() method to insert
        de_que.add(10);
        de_que.add(20);
        de_que.add(30);
        de_que.add(40);
        de_que.add(50);
        System.out.println("de_que: " + de_que);
        // clear() method
        de_que.clear();
        System.out.println("de_que.clear(): " + de_que);
        // addFirst() method to insert the
        // elements at the head
        de_que.addFirst(564);
        de_que.addFirst(291);
        // addLast() method to insert the
        // elements at the tail
        de_que.addLast(24);
        de_que.addLast(14);
        System.out.println("de_que: " + de_que);
        de_que.remove();
        System.out.println("de_que.remove(): " + de_que);
        de_que.add(56);
        System.out.println("de_que: " + de_que);

        Queue<Integer> linkedQueue = new LinkedList<>();
        linkedQueue.add(2);
        linkedQueue.add(1);
        linkedQueue.add(3);
        linkedQueue.add(0);
        System.out.println("linkedQueue: " + linkedQueue);
        linkedQueue.poll();
        System.out.println("linkedQueue.poll(): " + linkedQueue);
        System.out.println("linkedQueue.peek(): " + linkedQueue.peek());

        Deque<Integer> linkedDeQueue = new LinkedList<>();
        linkedDeQueue.add(5);
        linkedDeQueue.add(1);
        linkedDeQueue.add(4);
        linkedDeQueue.add(9);
        linkedDeQueue.add(null);
        linkedDeQueue.add(null);
        System.out.println("linkedDeQueue: " + linkedDeQueue);
        System.out.println("linkedDeQueue.peek(): " + linkedDeQueue.peek());
        System.out.println("linkedDeQueue.poll(): " + linkedDeQueue.poll());
        System.out.println("linkedDeQueue: " + linkedDeQueue);
    }
}
