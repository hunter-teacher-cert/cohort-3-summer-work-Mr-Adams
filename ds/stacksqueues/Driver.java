import java.io.*;
import java.util.*;

public class Driver
{

    public static void main(String[] args)
    {
      
	    Stack s = new Stack();
	    Queue q = new Queue();
      
      System.out.println("\n----------TESTS FOR STACK METHODS----------");

      System.out.println("\n----empty-stack pop method test----");
      System.out.println(s.pop());
      System.out.println("Stack s: " + s.toString());
      
      System.out.println("\n----------push method test----------");
      for(int i = 1; i <= 10; i++)
      {
        s.push(i);
      }
      System.out.println("Stack s: " + s.toString());

      System.out.println("\n----------pop method test----------");
      System.out.println("Popped a value: " + s.pop());
      System.out.println("Stack s: " + s.toString());

 System.out.println("\n----------top method test----------");
      System.out.println("Top value: " + s.top());
      System.out.println("Stack s: " + s.toString());

      System.out.println("\n----------isEmpty method test----------");
      System.out.println("Is it Empty? " + s.isEmpty());
      System.out.println("Stack s: " + s.toString());

      System.out.println("\n----------size method test----------");
      System.out.println("Size of Stack " + s.size());
      System.out.println("Stack s: " + s.toString());
     
      
      System.out.println("\n\n\n----------TESTS FOR QUEUE METHODS----------");

      System.out.println("\n----empty-queue dequeue method test----");
      System.out.println(q.dequeue());
      System.out.println("Queue q: " + q.toString());
      
      System.out.println("\n----------enqueue method test----------");
      for(int i = 1; i <= 10; i++) 
      {
        q.enqueue(i);
      }
      System.out.println("Queue q: " + q.toString());
     
      System.out.println("\n----------dequeue method test----------");
      System.out.println(q.dequeue());//prints the removed element
      
      System.out.println("Queue q: " + q.toString());
//prints the queue after dequeue method (removal of element from "front", which is the back of our arraylist)
      
      System.out.println("\n----------front method test----------");
      q.front();
      System.out.println(q.front());
            System.out.println("Queue q: " + q.toString());
      
      System.out.println("\n----------isEmpty method test----------");
      q.isEmpty();
      System.out.println(q.isEmpty());
      System.out.println("Queue q: " + q.toString());
      
      System.out.println("\n----------size method test----------");
      q.size();
      System.out.println(q.size());

      
      System.out.println("\n----------toString method test----------");
      System.out.println("Queue q: " + q.toString());

    }
}

