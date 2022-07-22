//1. Before you start, be sure to import the two Java API.

import java.io.*;
import java.util.*;


//Directions: 
// Please complete these methods in order
// 1. size
// 2. sum
// 3. indexOfMax
// 4. powArray
//Once complete unmark the section of the main to test each method

public class activity {
  public static void main (String[] args){
    
    double[] a = {0, 4, 7, 2};
    
    System.out.println(Arrays.toString(a));
   //when you finish size uncomment the next two lines to test
    // System.out.print("The size of the array is ");
    // System.out.println(size(a));

   // when you finish sum uncomment these lines to test
    // System.out.print("The sum of array is: ");
    // System.out.println(sum(a));

  // when you finish powArray uncomment these lines to test
    // System.out.print("This is the array to power of 4: ");
    // powArray(a, 4); 

  // when you finish indexOfMax ucomment these lines to test
    // System.out.print("The index of max is: ");
    // System.out.println(indexOfMax(a));
  }
  //provide cheat sheet scafold of ++, += notation, for loops, or reference our code wall
  
  //Write a method to find the size of a 1D array
  public static int size (double[] a){
    int size = 0;//provided?
    
    //put your code in here

    
    return size;//provided
  }

  
 // Write a method here to determine the sum of all of the elements in an array. You will do this by iterating over the array and updating the provided sum variable.
  public static int sum (double [] a){
    int sum = 0;  //provided
   
    //put your code in here

     
    return sum;//provided
  }

 

  //Write a method here to find the index of the Max value in an array
  public static int indexOfMax(double[] a){
    int maxitemindex = 0;//provided
    
    //put your code in here

    
    return maxitemindex;//provided
  } 

  
    //Write a method here to raise each intem in an array to some power
  public static void powArray(double[] a, int pow){
      double[] b = new double[a.length];//provided
      
    //put your code in here

   
    System.out.println(Arrays.toString(b));//provided
    }
  
  }