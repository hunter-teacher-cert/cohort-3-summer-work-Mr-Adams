import java.io.*;
import java.util.*;
import java.util.Scanner;


public class Array {
  public static void main (String[] args) {
    double[] a = new double[] {1.0, 2.0, 3.0, 4.0};
    double power;
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the power you would like to raise the array to.");
    power = in.nextDouble();
    powArray(a,power);
    System.out.println(Arrays.toString(a));
    int counters = 55;
    int [] scores = randomArray(counters);
    //next line prints array
    System.out.println(Arrays.toString(scores));
    //next line prints the historgram
    System.out.println(Arrays.toString(historgram(scores, counters)));
    }
    
    
  public static double[] powArray(double[] a, double power) {
    for (int i = 0; i < a.length; i++) {
    a[i] = Math.pow(a[i], power); 
   }
    return a;
    }
  
  public static int [] historgram(int[] scores, int counters) {
    int[] counts = new int[counters];
    for (int score : scores) {
    counts[score]++;
    }
    return counts;
  }
  //makes the random array of count size to test for historgram
  public static int[] randomArray(int size) {
    Random random = new Random();
    int[] a = new int[size];
    for (int i = 0; i < a.length; i++) {
        a[i] = random.nextInt(size);
    }
    return a;
}
}