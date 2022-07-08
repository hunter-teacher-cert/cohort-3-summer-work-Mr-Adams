import java.io.*;
import java.util.*;


/**
 * Driver class for Time class  by Team LucidThinkeren
 * Seth Adams
 * Collaborators: Yanique, Harrison, and Taylor
 */

/**
   INSTRUCTIONS:

   This file contains the Driver starter code for our Time class.
   
   Add code in main to test all your methods
   
   Place this file in a folder named programming/5/Driver.java

*/


public class Driver {

    public static void main(String[] args) {

	//declare a var of appropriate type to assign an instance of Time to
	Time t;

	//assign var the address of a newly-apportioned Time object
	    t = new Time(1,44,5);
      System.out.print("Initial Time: ");
      System.out.println(t);
      t.set (12,30,30);
      System.out.print("After setting new time: ");
      System.out.println(t);
      Time addT = new Time(1,32,45);
      t.add(addT);
      System.out.print("Time after adding some time: ");
      System.out.println(t);   
      Time ot1 = new Time(4,48,10);
      System.out.print("Time to compare with: ");
      System.out.println(ot1);
      if(t.equals(ot1)){
        System.out.println(t + " does equal " + ot1);
      } else {
        System.out.println(t + " does not equal " + ot1);
      }
      if(t.compareTo(ot1)==1){
        System.out.println(t + " is greater than " + ot1);
      }else if (t.compareTo(ot1)==0){
        System.out.println(t + " is equal to " + ot1);
      } else {
        System.out.println(t + " is less than " + ot1);
      }

      
    }//end main()

}//end class