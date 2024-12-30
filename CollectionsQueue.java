import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.ArrayDeque;
import java.util.Queue;

public class CollectionsQueue {
    public static void main(String[] args){

        // LinkedList
        Queue<String> fruits1 = new LinkedList<>();
        System.out.println("----------LinkedList String---------");
        fruits1.offer("Apple"); // Adding elements to Queue
        fruits1.offer("tomato");
        fruits1.offer("Banana");
        fruits1.offer("apple");
        System.out.println(fruits1);
        System.out.println("Removed Element: " + fruits1.poll());// Removing elements from Queue
        System.out.println("Accessed Element: " + fruits1.peek());// Accessing elements from Queue
        fruits1.offer("Cherry");
        System.out.println(fruits1);
        System.out.println();

        Queue<Integer> fruits2 = new LinkedList<>();
        System.out.println("----------LinkedList Integer---------");
        fruits2.offer(3); // Adding elements to Queue
        fruits2.offer(8);
        fruits2.offer(4);
        fruits2.offer(1);
        System.out.println(fruits2);
        System.out.println("Removed Element: " + fruits2.poll());// Removing elements from Queue
        System.out.println("Accessed Element: " + fruits2.peek());// Accessing elements from Queue
        fruits2.offer(12);
        System.out.println(fruits2);
        System.out.println();


        // ArrayDeque
        ArrayDeque<Integer> fruits3 = new ArrayDeque<>();
        System.out.println("----------ArrayDeque---------");
        fruits3.push(3); // Adding elements to Queue
        fruits3.offer(8);
        fruits3.offer(4);
        fruits3.offer(1);
        System.out.println(fruits2);
        System.out.println("Removed Element: " + fruits3.poll());// Removing elements from Queue
        System.out.println("Accessed Element: " + fruits3.peek());// Accessing elements from Queue
        fruits3.offer(12);
        System.out.println(fruits3);
        System.out.println();


        // PriorityQueue
        Queue<Integer> fruits4 = new PriorityQueue<>();
        System.out.println("----------PriorityQueue---------");
        fruits4.offer(3); // Adding elements to Queue
        fruits4.offer(8);
        fruits4.add(4);
        fruits4.offer(1);
        System.out.println(fruits4);
        System.out.println("Removed Element: " + fruits4.poll());// Removing elements from Queue
        System.out.println("Accessed Element: " + fruits4.peek());// Accessing elements from Queue
        fruits4.offer(12);
        System.out.println(fruits4);




    }
}

