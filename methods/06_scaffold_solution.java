//1. Before you start, be sure to import the two Java API.

import java.io.*;
import java.util.*;



public class activity {
  public static void main (String[] args){
    double[] a = {0, 1, 2, 3};
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

  // when you finish
    // System.out.print("The index of max is: ");
    // System.out.println(indexOfMax(a));
  }

  
  public static int size (double[] a){
    int size = 0;
    for (int i = 0; i <a.length; i++){
      size++;
    }
    return size;
  }
 // 
  public static int sum (double [] a){
    int sum = 0;  
    for ( int i = 0; i < a.length; i++){
        sum += a[i];
      }
    return sum;
  }

 public static void powArray(double[] a, int pow){
    double[] b = new double[a.length];
    for (int i = 0; i < a.length; i++) { 
      b[i] = Math.pow(a[i], pow);
    }
    System.out.println(Arrays.toString(b));
  }

  
  public static int indexOfMax(double[] a){
    int maxitemindex = 0;
    for(int i = 1; i < a.length; i++)
      if(a[i] > a[maxitemindex]){
        maxitemindex = i;
      }
    return maxitemindex;
  } 
  }