import java.io.*;
import java.util.*;

public class Max {
  public static void main (String[] args) { 
    int [] testarray = {1,4,5,7,8,2,4,7,9};
    indexOfMax(testarray);
    System.out.println(indexOfMax(testarray));
     System.out.println(indexOfMaxenhancedforloop(testarray));
    }
  public static int indexOfMax(int[] testarray){
    int maxitemindex = 0;
    for(int i = 1; i < testarray.length; i++)
      if(testarray[i] > testarray[maxitemindex]){
        maxitemindex = i;
      }
    return maxitemindex;
  } 
 public static int indexOfMaxenhancedforloop(int[] testarray){
   int maxitemindex = 0;
   int i = 0;    
    for(int number : testarray){
            if(testarray[i] > testarray[maxitemindex]){
        maxitemindex = i;
          }
       i++;
      }
    return maxitemindex;
  }  
}
