//Seth Adams, Steve Sabagh, Parmanand Mohanlall, Saranii Muller


import java.io.*;
import java.util.*;

/*

Sort Project:

Part 1:  (BASIC)
✔️  1. Analyze the two constructors - try to figure out how they work.
✔️ 2. Compile and run the program (SortProjectDriver.java and SortProject.java) and confirm
  the behavior of the constructors.

  Part 2: (BASIC)
✔️ 1. Read the description of findSmallestIndex and complete the method.
✔️2. Uncomment the lines in SortProjectDriver to test.

  Part 3: (INTERMEDIATE)
✔️  1. Complete the sort method - read comments for description
✔️  2. Uncomment the lines in sortProjectDriver to test.



Search Project:
  1. Complete the linear search (BASIC)
  2. Complete the binary search (Intermediate)//can't binary search on a non sorted list
  3. Complete the recursive version of binary search (Advanced)
*/

public class SortSearch{

    /* Sort project starts here */
    
    /* Instance Variables */
    private ArrayList<Integer> data;  // to store the data
    
    private Random r; 

    
    public SortSearch(){//default constructor that will make array list of integers
	data = new ArrayList<Integer>(); //new array list of integers called data
	r = new Random(); //creates (instantiates) a new random object called r
	for (int i=0;i<15;i++){ //loops through array list spots 0-14 
	    data.add(r.nextInt(20)); // add a random integer of a value between 0 and 19
	}//default constructor makes an ArrayList with size 15 filled with randomized Ints between 0-19 
	
    }
    
    public SortSearch(int size){//makes array list of integers of a size in the parameter when called
	data = new ArrayList<Integer>();
	r = new Random();
	for (int i=0;i<size;i++){
	    data.add(r.nextInt(20));
	}
	
    }//override constructor makes an ArrayList with parameter size filled with randomized Ints between 0-19 

  
  // make orderd arrayList for testing
  public SortSearch(int size, boolean ordered){
	data = new ArrayList<Integer>(size);
		for (int i=0;i<size;i++){
	    data.add(i);
	}
}

  
    /* Convenience function to get data out of the ArrayList from the driver */
    public int get(int index){
	return this.data.get(index);
    }
    

    /*
      return the index of the smallest data item from index start to the end of the ArrayList. If there are multiple of the smallest value, return any of them.
      
      Example, if the arraylist has:
      5,3,10,6,8

      if start was 2 (start at index 2, value 10) then it would return 3 which is the index of the value 6 which is the index with the smallest value from start to end

      On the other hand, if start was 0, then the method would return 1 since the value 3 is in index 1 and that is the smallest.
      
    */
  public int findSmallestIndex(int start){//created method called findSmallestIndex w/parameter of start
  	int smallIndex = start; //smallIndex is start
  	for(int i=start; i <data.size(); i++){//loop starting at start parameter, increments up until start is less then the size of array
      if(data.get(i) < data.get(smallIndex)){//if the data at the index we are checking is less than the data at our current smallest index then we replace the smallIndex with that index
        smallIndex = i;
      }
    }
	return smallIndex;
    }


    /**
       Implement the selection sort algorithm by sorting the ArrayList data in place.
       Algorithm:
       Loop a variable that represents the ArrayList index from 0 to the end of the ArrayList.
         For each index, find the smallest from that Location to the end of the array and swap it with that index.
    */
    public void sort(){
      //some if loop and then if true we would shift start up one -- replace value from lowest index with current test index (will need temp placeholder variable??)

      int smallIndex = 0;
      int tempInt = 0;
      for(int i = 0/*this is the start*/;i < data.size();i++){ //this is like the j loop and start always moves up with the loop - no need to do a search loop because we already have a search method from find smallest 
        smallIndex = findSmallestIndex(i); //find smallest index starting at 0 ( from find smallest method)
        tempInt = data.get(smallIndex); //temporary variable to hold the smallest int index while looping through
        data.set(smallIndex, data.get(i)); //set index to looped data from start point
        data.set(i, tempInt); //that data now becomes the temp

        //rinse and repeat!
      }
    }



    /* Search project starts here */
    
    /**
       performs a linear search. Returns the index of the first occurence of
       value in the ArrayList data or -1 if not found.

       This works by starting at the first element and searching one element at a time 
       until either the element is found or you've looked at all the elements.

       This algorithm works on any ArrayList.

    */
  public int linearSearch(int value){
	 for(int i = 0; i < data.size(); i++)/*loops through each element and tests each for the value and returns the index if there is a match*/
   {
      if(data.get(i) == value)
      {
        return i;
      }
    }
	    return -1; 
  }
	
    
    /**
       Implement a binary search as specified by the comments
       
       This algorithm only works on sorted ArrayLists.
    */
    public int binarySearch(int value)
    {
      int high = data.size() -1;
      int low = 0;
      int middle;
      while (high >= low)
        {
          middle = (high+low)/2;
          if (data.get(middle)==value)
            {
		          return middle;
	          } else if (data.get(middle) > value)
              {
		            high = middle - 1;
	            } else 
                {
                  low = middle + 1;
	              }
	    
		    }
	    return -1;
    }
      
  
    /**
       Implement a RECURSIVE binary search as specified by the comments
       
       This algorithm only works on sorted ArrayLists.
    */

    public int binarySearchRecursive(int value, int lowIndex, int highIndex){
      if (lowIndex>highIndex){
        return -1;
      }
      int middle = (lowIndex + highIndex) / 2;
      if (data.get(middle)==value)
        {
	        return middle;
	      } else if (data.get(middle) > value)
          {
	          return binarySearchRecursive(value,lowIndex,middle-1);
	        } else 
            {
	            return binarySearchRecursive(value,middle+1,highIndex);
	          }
    }

    
	
    public String toString(){
	return ""+data;
    };


    public void builtinSort(){
	Collections.sort(data);
	
    }
    
 /* Merge Sort Stuff after here */
    /**
       Builds and returns an ArrayList that's already in increasing order.
       You can use this method to test your merge method.
    */
    public ArrayList<Integer> buildIncreasingList(int size){
	ArrayList<Integer>  newlist = new ArrayList<Integer>();
	Random r = new Random();
	int nextval = r.nextInt(20)+1;
	for (int i=0;i<size;i++){
	    newlist.add(nextval);
	    nextval = nextval + r.nextInt(20);
	}

	return newlist;
	}

    /**
       this routine should create and return a new ArrayList of
       integers and fill it by merging list1 and list2 into the new
       list.
       list1 and list2 are already sorted in increasing order.
       Example:
       If list1 contains [1,5,17,25]
       and list2 contains [3,6,10,30,40,50]
       The new list will contain:
       [1, 3, 5, 6, 10, 17, 25, 30, 40, 50]
       
    */
       
    public ArrayList<Integer> merge(ArrayList<Integer> list1,
				    ArrayList<Integer> list2){
      // code for merge
      ArrayList<Integer> mergedList = new ArrayList<Integer>();
      //int minSize = Math.min(list1.size(), list2.size());
      int i = 0,j = 0;
       while (list1.size() != i && list2.size() != j ){
        if(list1.get(i) < list2.get(j)) {
         mergedList.add(list1.get(i));
          i++;
         } else {
         mergedList.add(list2.get(j));
         j++;
        }
       }    
        if(list1.size() > i) {
        for(i = i ; i < list1.size(); i++) {
          mergedList.add(list1.get(i));
        }
      } 
         if(list2.size() > j ) {
         for(j=j; i < list2.size(); i++) {
          mergedList.add(list2.get(i));
        }
         }
       

      
      // while (list1.size() > 0 && list2.size() > 0 ) {
      //   if(list1.get(0) < list2.get(0)) {
      //    mergedList.add(list1.get(0));
      //    list1.remove(0);
      //  } else {
      //    mergedList.add(list2.get(0));
      //    list2.remove(0);
      //  }    
      // }
      // if(list1.size() > 0) {
      //   for(int i = 0; i < list1.size(); i++) {
      //     mergedList.add(list1.get(i));
      //   }
      // } 
      // if(list2.size() > 0 ) {
      //    for(int i = 0; i < list2.size(); i++) {
      //     mergedList.add(list2.get(i));
      //   }
      // }
	    return mergedList; 
    }



  public ArrayList<Integer> mergeSort(ArrayList<Integer> list){
      int size = list.size();
      // check for base case
      if(size < 2) {
        return list;
      } else {
        ArrayList<Integer> listLeft = new ArrayList<Integer>(list.subList(0, size/2)); // lower half
        ArrayList<Integer> listRight = new ArrayList<Integer>(list.subList(size/2, size)); // upper half
        ArrayList<Integer> sortedLeft = mergeSort(listLeft); // sorted lower
        ArrayList<Integer> sortedRight = mergeSort(listRight); // sorted upper
        ArrayList<Integer> sorted = merge(sortedLeft, sortedRight);
        return sorted;
      }
    
      // if not the base case
      // split in two lists
      // meregSort the left half
      // mergeSort the right half
      // merge them together into a new list
      // return that new list 

  }


  public void msort(){
      data = mergeSort(data);
  }    

}
    

    
