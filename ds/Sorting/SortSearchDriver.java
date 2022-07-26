//Seth Adams, Steve Sabagh, Parmanand Mohanlall, Saranii Muller

import java.io.*;
import java.util.*;

public class SortSearchDriver {
    public static void main(String[] args) {


	// Uncomment these to test part 1
// 	SortSearch ssd = new SortSearch();//test defualt constructor
// 	System.out.println(ssd);//test defualt constructor
// 	SortSearch ss = new SortSearch(20);//test overloaded constructor
// 	System.out.println(ss);//test overloaded constructor
	
		
// 	// Uncomment these to test part 2

// 	 int i;
// 	 i = ss.findSmallestIndex(0);
// 	 System.out.println("ss["+ i +"] = "+ss.get(i)+" : " + ss);

// 	 i = ss.findSmallestIndex(9);
// 	 System.out.println("ss["+ i + "] = "+ss.get(i)+" : " + ss);
	
// 	// Uncomment these to test part 3

// 	System.out.println(ss);
// 	ss.sort();
// 	System.out.println(ss);
	
// //Search Test From Taylor Grant From slack
// // for (i = 0; i < 20; i++){
// //   System.out.println("Linear Search:");
// //   System.out.println(i + " is at position: " + ss.linearSearch(i));
// //   System.out.println("Binary Search:");
// //   System.out.println(i + " is at position: " + ss.binarySearch(i));
// //   System.out.println("Binary Search Recursive:");
// //   System.out.println(i + " is at position: " + ss.binarySearchRecursive(i,0,19));
// //   System.out.println("");
// //}
// //sorting search test
      
// int size = 10000;
// ss = new SortSearch(size);
      
// long start,elapsed;
//   System.out.println("Testing Sort on " + size);
//   start = System.currentTimeMillis();
// 	ss.sort();
// 	// System.out.println(ss);
// 	elapsed = System.currentTimeMillis() - start;
// 	System.out.println("Size: " + size + " Time: " + elapsed);
      
// //testing with an ordered list      
// Random rand = new Random();
// int searchValue = rand.nextInt(size);
//       System.out.println("Searching for: " + searchValue);
    
//   //linear search test
// 	start = System.currentTimeMillis();
//   //System.out.println("Start Time: " + start);
//   int indexLinearSearch = ss.linearSearch(searchValue);
// 	elapsed = System.currentTimeMillis() - start;
//  System.out.println("Linear Search");	   
// 	System.out.println("Size: " + size + " Time: " + elapsed);	      

//   //binary search test
//   start = System.currentTimeMillis();
// 	//data.sort();
//   int indexBinarySearch = ss.binarySearch(searchValue);
// 	// System.out.println(ss);
// 	elapsed = System.currentTimeMillis() - start;
//   System.out.println("Binary Search");	   
// 	System.out.println("Size: " + size + " Time: " + elapsed);
    
 //  SortSearch ss = new SortSearch(20);
	// System.out.println(ss);
 //  ArrayList<Integer> a = ss.buildIncreasingList(20);
	// System.out.println(a);

	// // build a second Arralist here
	// ArrayList<Integer> b = ss.buildIncreasingList(25);
	// System.out.println(b);

	// // test your merge routine here
 //      ArrayList<Integer> merged = ss.merge(a, b);
 //      System.out.println(merged);

    int size = 50000;
    long start,elapsed;
	  start = System.currentTimeMillis();
	    // put what you want to test here!
    SortSearch test = new SortSearch(size);
    // System.out.println(test); 
    // System.out.println("sorting"); 
    test.sort();
    // System.out.println(test); 
	  elapsed = System.currentTimeMillis() - start;
	  System.out.println("Size: " + size + " Time: " + elapsed);
      

    start = System.currentTimeMillis();
	    // put what you want to test here!
    test = new SortSearch(size);
    //System.out.println(test); 
   // System.out.println("sorting"); 
    test.msort();
    // System.out.println(test); 
	  elapsed = System.currentTimeMillis() - start;
	  System.out.println("Size: " + size + " Time: " + elapsed);
    }
}