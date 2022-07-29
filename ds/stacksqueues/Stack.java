import java.io.*;
import java.util.*;

// Date: 7/29/22
// Group 11
// Collaborators: Alana R., Seth. A., Théa W.
// Recall, a stack is a Last In First Out (Lifo) structure.

// You should implement the following methods

// A constructor with no parameters - DONE
// void push(int value) - add value to the top of the stack - DONE
// int pop() - remove and return the top value from the stack - DONE
// int top() - return but do not remove the top value from the stack - DONE
// boolean isEmpty() - return true of the stack is empty, false otherwise - DONE
// int size() - return the number of elements currently in the stack - DONE
// boolean isFull() - returns true if the stack is full, false otherwise - only implement this if you use an array for implementation
// toString() - return a string with all the data in the stack - DONE

public class Stack
{

    // Place private instance variables here
    private ArrayList<Integer> stack;

    // Place constructors here
    // A constructor with no parameters
    public Stack()
    {
      stack = new ArrayList<Integer>();
    }

    // Place methods here
    public void push(int value)
    {
      stack.add(0, value);//
    }
    
    // int pop() - remove and return the top value from the stack
    // What should be returned if there is an error?
    // We are returning an Integer object because it can send a null,
    // while a primitive int will have always have to pass a value
    // (which may be already be an item value in the list)
    public Integer pop() //throws Exception
    {
      if (stack.isEmpty())
      {
        return null;
        //throw new Exception("empty array"); //an exception is thrown when you can't return anything (-1 can't be used because it is considered a value that could work in the list)
      } 
      
      else 
      {
        return stack.remove(0);//returns the element and then removes it
      }    
    }
  
    // int top() - return but do not remove the top value from the stack
    public Integer top() //throws Exception
    {
      if (stack.isEmpty())
      {
        return null;
        //throw new Exception("empty array"); //an exception is thrown when you can't return anything (-1 can't be used because it is considered a value that could work in the list) 
      }
      
      else 
      {
        return stack.get(0);//returns the element and then removes it
      }
    }

    // boolean isEmpty() - return true of the stack is empty, false otherwise
    public boolean isEmpty()
    {
      return stack.isEmpty();
    }
    
    // int size() - return the number of elements currently in the stack
    public int size()
    {
      return stack.size();
    }
   
    // toString() - return a string with all the data in the stack
    public String toString()
    {
      return "" + stack;
    }
    
}