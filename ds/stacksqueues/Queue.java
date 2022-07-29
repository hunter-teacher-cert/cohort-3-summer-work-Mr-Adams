import java.io.*;
import java.util.*;

// a queue is a First In First Out (Fifo) structure (think stack of plates) so you never have to tell it where to remove from

// You should implement the following methods

// A constructor with no parameters - DONE
// void enqueue(int value) - add value to the end of the queue - DONE
// int dequeue() - remove and return the top value from front of the queue - DONE
// int front() - return but do not remove the top value from the front of the queue - DONE
// boolean isEmpty() - return true of the queue is empty, false otherwise - DONE
// int size() - return the number of elements currently in the queue - DONE
// boolean isFull() - returns true if the queue is full, false otherwise - only implement this if you use an array for implementation - NOT APPLICABLE TO ARRAY LISTS ONLY TO ARRAYS
// toString() - return a string with all the data in the stack - DONE


public class Queue
{
    //I chose an ArrayList to build the queue because it can accomodate any number of elements.     //I know a linked list can also do this, but I find them more confusing.
    //we decided to make the end of the arraylist our "front" of queue
  
    // Place private instance variables here
    private ArrayList<Integer> queue;

    // Place constructors here
    //constructors get curly braces, not semi-colons
    public Queue()
    {
      queue = new ArrayList<Integer>();
    }

  

    // Place methods here
    //add value to the end of the queue
    public void enqueue(int value)
    {
      queue.add(value);//this is returning a void and it's calling the add() method

    }

    // int dequeue() - remove and return the top value from front of the queue
    //Queue should be FIRST IN, FIRST OUT
    //Oldest item added is now in index 0
    public Integer dequeue()
    {
      if(isEmpty()){
        return null;
      }
      return queue.remove(0);
    }

    // int front() - return but do not remove the top value from the front of the queue
    public Integer front()
    {
      if(isEmpty()){
        return null;
      }
      //return int value = queue.get(queue.size()-1); <- this int value and "=" sign are redundant bc program expects and int return anyways so you don't even need to declare and instantiate it.
      return queue.get(0);
    }

    // boolean isEmpty() - return true of the queue is empty, false otherwise
    public boolean isEmpty()
    {
      return queue.size() == 0; 
      // return queue.isEmpty(); this isEmpty method is included in the array lists class. 
      //This method is equivalent to return queue.size() == 0.
      // return queue.size() == 0 ? true : false; the question will check if true then assign first value before colon and if false assign value after colon. 
      //This method is equivalent to return queue.size() == 0.
    }
    // int size() - return the number of elements currently in the queue
    public int size ()
    {
      return queue.size();// this returns the total number of elements
    }

    // toString() - return a string with all the data in the stack
    public String toString()
    {
      return "" + queue;
    }

}
