import java.io.*;
import java.util.*;


/**
 * Time class by Team LucidThinkeren
 * Seth Adams
 * collaborators: In group with Yanique, Harrison, and Taylor.  We did coding individually and shared what worked.
 */

/**
   INSTRUCTIONS:

   This file contains the starter code for our Time class.

   The class here uses ints for hours, minutes, and seconds but you
   could decide to change the internal representation to just store
   an int representing a number of seconds.

   Place this file in a folder named programming/5/Time.java

   Basic level (complete all):
   - public Time(int hrs, int mins, int secs) - constructor
   - public void toString()
   - public void set(int hrs, int mins, int secs)

   Intermediate level (complete Basic methods plus this method):
   - public void add(Time other)
   - public boolean isEquals(Time other)

   
   Advanced level (complete Basic + Intermediate + these two methods):
   - public int compareTo(Time other)
   
*/



public class Time {
    // Instance Variable(s)
    // You can change this if you want to use the alternate
    // implementation of just storing the overall seconds.
    
    int hours;
    int minutes;
    int seconds;

    // Constructors
  public Time(){
	  this.hours = 0;
	  this.minutes = 0;
	  this.seconds = 0;
	
    }

    /**
       Parameters:
       - hrs, mins, secs - the time you want to create the class as

       Initialize this instance to represent hrs:mins:secs as the time.
       
     */
    public Time(int hrs, int mins, int secs){//constructs the time once/first time
	    hours = hrs;
      minutes = mins;
      seconds = secs;
    }
    
    
    // Methods

    /**
       returns a string representation of the time
    */
  //from Java Fu Marieke Thomas, ALICIA WADE, @Moo Joon Park, Kate Maschmeyer to use formating
     public String toString(){
	  return(String.format("%02d:%02d:%02d", this.hours, this.minutes, this.seconds));
  }
    /**
       Parameters:
       - hrs,mins,secs - ints representing a time

       modifies this instance to represent the time hrs:mins:secs
    */
    public void set(int hrs, int mins, int secs){//after constructor and can be used/filled with existing or new times
      hours = hrs;
      minutes = mins;
      seconds = secs;
    }
    /**
       Parameters:
       - other - a variable of type Time

       modifies this instance to represent the result of adding it and
       the time other.
    */
    public void add(Time other){
      int extraMins=0; int extraHours = 0;
      seconds += other.seconds;
      extraMins = seconds / 60;//tests if there are more than 60 seconds using integer division
      seconds = seconds % 60;//keeps the remaining seconds from mod division
      minutes = minutes + other.minutes + extraMins;
      extraHours = minutes / 60; //tests if there are more than 60 mins using integer division
      minutes = minutes % 60;//keeps the remaining mins from mod division
      hours = hours + other.hours + extraHours;
      hours = hours % 24;
      
      
	// add the code to add the time represented by other
	// to this instance.
    
    }


    /**
       Parameters:
       other - a variable of type Time

       Returns:
       True if this instance and other represents the same time
       false otherwise.
    */
    public boolean equals(Time other){
	// your code here)
      if(other.hours==hours && other.minutes==minutes && other.seconds == seconds){
        return true;
      } else {
	    return false; // change this
      }    
    }
      

    /**
       Parameters:
       other - a variable of type Time

       Returns:
       A positive number if this instance represents a time greater
       than the time of other (this > other)

       A negative number if this instance represents a time less
       than the time of other (this < other)

       0 if the two instances represent the same time.

    */
    public int compareTo(Time other){
	// your code here)
      int totalSecs = (hours * 3600) + (minutes * 60) + seconds;
      int totalOtherSecs = (other.hours * 3600) + (other.minutes * 60) + other.seconds;
      if (totalSecs > totalOtherSecs){
        return 1;
      }
      else if (totalSecs == totalOtherSecs) {
        return 0;
      } else {
        return -1;
      }
    
    }

    
}//end class