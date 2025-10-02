/*
* implementation of queue using collection framework
* there are two ways-
 1. Queue using LinkedList
Queue<Integer> q = new LinkedList<>();
Underlying Data Structure: Doubly Linked List.
Memory: Each element requires extra memory (for storing references to next and previous nodes).
Performance:
add() / offer() → O(1) (just link a new node)
remove() / poll() → O(1) (unlink head node)
peek() → O(1) (just return head node)
Flexibility: Can be used as both a Queue and a List (since LinkedList implements both List and Deque).
Best suited when: You have frequent insertions/deletions in the middle (though as a queue, mostly head/tail ops).


* 2. Queue using ArrayDeque
Queue<Integer> q = new ArrayDeque<>();
Underlying Data Structure: Resizable circular array.
Memory: More memory-efficient (no node objects, just array storage).
Performance:
add() / offer() → Amortized O(1) (but resizing is O(n) when array expands).
remove() / poll() → O(1) (just move head pointer).
peek() → O(1).
Limitations:
Cannot store null values (throws NullPointerException).
Not thread-safe (like LinkedList too, unless you use ConcurrentLinkedQueue).
Best suited when: You want a fast, memory-efficient queue without the overhead of linked nodes.
 */
package queue;
import java.util.*;
public class Q4_implementationUsingJavaCollectionF {
    public static void main(String[] args) {
       // Queue<Integer> q= new LinkedList<>();
        //here queue is interface while LL is class , object is create for class only not for interface .

        //implement using ArrayDeque
        Queue<Integer> q=new ArrayDeque<>(10);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }


    }
}
