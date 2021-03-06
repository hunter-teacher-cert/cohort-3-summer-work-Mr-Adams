import java.io.*;
import java.util.*;

/** Methods to write

Basic level:
------------
public static ArrayList<Integer> buildRandomList(int size, int maxval)
public static int sumOfList(ArrayList<Integer> dataList)

Intermediate level:
-------------------
public static void swapElements(ArrayList<Integer> dataList, int indexA,int indexB)
public static void removeValue(ArrayList<Integer> dataList, int valueToRemove)

Challenge level:
-------------------
public static ArrayList<Integer> sumLists(ArrayList<Integer>ListA,ArrayList<Integer>ListB)
public static ArrayList<Integer> zipLists(ArrayList<Integer>ListA,ArrayList<Integer>ListB)
*/


public class AlPractice
{
  /**
  Parameters:
  - size - an integer representing how many items to add to the list
  - maxval - the largest value to store in the list
  Preconditions:
  - size >= 0
  - maxVal > 0
  Returns:
  - A new ArrayList of Integers with each value being a random
    number between 0 and maxval (not including maxval).
  */
  public static ArrayList<Integer> buildRandomList(int size, int maxval)
  {
    Random r = new Random();//random object is a random number generator
    //create ArrayList to store random
    ArrayList<Integer> values = new ArrayList<Integer>(size);
    for (int i = 0; i <= size; i++)
    {
      //randomly pick values from 0 up to excluding maxVal
      //0  <= nextInt() < maxval
      values.add(r.nextInt(maxval)); 
    }
    //return null;//placeholder to compile.
    return values;
  }

  /**
  Parameters:
  - dataList - an ArrayList of integer values.
  Returns:
  - The sum of all of the elements of the ArrayList.
  */
  public static int sumOfList(ArrayList<Integer> dataList)
  {
    int sum = 0;
    for (int i = 0; i < dataList.size(); i++)//loops through
    {
      sum = sum + dataList.get(i);//adds each value in the indexes 
    }
    return sum;//placeholder to compile.
  }

  /**
  Parameters:
  - dataList - an ArrayList of Integers
  - index1, index2 - the two locations to swap.
  Preconditions:
  - index1 and index2 are valid indecies of dataList
  Postconditions:
  - The ArrayList is modified such that
    The value that was in dataList[index1] is now in dataList[index2], and
    the value  that was in dataList[index2] is now in dataList[index1].
  - No other values should be modified.
  */
  public static void swapElements(ArrayList<Integer> dataList, int index1,int index2)
  {
    int temp1 = dataList.get(index1);//makes a temp variable to take index 1 value
    dataList.set(index1,dataList.get(index2));///this gets the data at index 2 and enters it at index 1
    dataList.set(index2,temp1);//takes temp value and enters it at index 2
  }
  
  /**
  Parameters:
  - dataList - an AraryList of Integers
  - valueToRemove - the value to remove
  Postconditions:
  - The dataList is modified such that all occurances of valueToRemove are removed.
  */
  public static void removeValue(ArrayList<Integer> dataList, int valueToRemove)
  {
    for(int i = dataList.size()-1; i > 0; i --){
      if (dataList.get(i)==valueToRemove){
        dataList.remove(i);
      }
    }
  }


  /**
  Parameters:
  - ListA,ListB - ArrayLists of integer values.
  Preconditions:
  - ListA and ListB have equal lengths.
  Returns:
  - A new ArrayList that contains the sum of the corresponding indecies of the two arraylists.
    e.g. sumLists( [1,2,3], [4,0,5]) would return: [5,2,8]
  Postconditions:
  - The parameter ArrayLists should not be modified.
  */
  /*public static ArrayList<Integer> sumLists(ArrayList<Integer>ListA,ArrayList<Integer>ListB)
  {
    ArrayList<Integer> totals = new ArrayList<Integer>();
    int sumOfListA = sumOfList(ListA);
    int sumOfListB = sumOfList(ListB);
    totals.add(sumOfListA);
    totals.add(sumOfListB);
    return totals;//placeholder to compile.
  } Coded by partner Sam.  My attempt is below*/
  public static ArrayList<Integer> sumLists(ArrayList<Integer>ListA,ArrayList<Integer>ListB)
  {
    ArrayList<Integer> totals = new ArrayList<Integer>();
    for(int i = 0, j = 0; i < ListB.size(); i ++, j ++){
      totals.add(ListA.get(i) + ListB.get(j));
    }
    return totals;
  }

  /** zipLists
  Parameters:
  - ListA,ListB - ArrayLists of integer values.
  Returns:
  - A new ArrayList that contains all of the elements from both ArrayLists in alternating order starting with ListA's first element.
    When one list has no more values to add, continue adding the remaining values of the longer list.
    e.g. zipLists( [1,2,3,4], [8,9]) would return: [1,8,2,9,3,4]
  Postconditions:
  - The parameter ArrayLists should not be modified.
  */
  public static ArrayList<Integer> zipLists(ArrayList<Integer>ListA,ArrayList<Integer>ListB)
  {
    
    return null;//placeholder to compile.
  }

  public static void main(String[] args)
  {
    ArrayList<Integer> al = new ArrayList<Integer>();
    ArrayList<Integer> al2 = new ArrayList<Integer>();
    ArrayList<Integer> sumOfAls = new ArrayList<Integer>();

    // Uncomment these to test buildRandomList
    al = buildRandomList(10,100);
    al2 = buildRandomList(10,100);
    System.out.println(al);
    System.out.println(al2);
    System.out.println(sumOfList(al));
    swapElements(al,1,2);
    System.out.println(al);

    // Uncomment these to test swapElements
    swapElements(al, 2,6);
    System.out.println(al);

    // Uncomment these to test removeValue
    al.add(5);
    al.add(10);
    al.add(5);
    al.add(13);
    al.set(2,5);
    al.set(3,5);
    System.out.println(al);
    System.out.println("Remove test of value 5.");
    removeValue(al,5);
    System.out.println(al);

    //inserting the sums of lists A and B into
    //the sumList arrayList
    System.out.println("");
    System.out.println("");
    System.out.println("List A is: " + al);
    System.out.println("List B is: " + al2);
    System.out.println(" The sum array is: " + sumLists(al,al2));
    // sumOfAls = sumLists(al,al2);
    // System.out.println("The sums of al and al2 are " + sumOfAls.get(0) + " and " + sumOfAls.get(1));
  }
}