import java.io.*;
import java.util.*;

public class Sieve {
  public static void main (String[] args) {
    System.out.println(Arrays.toString(sieve(5)));
    
  }
  public static boolean [] sieve(int n){
    boolean testarray [] = new boolean[n];
    for(int i = 2; i < n; i++)
      testarray[i] = true;
    for(int i2=2; i2 <(int)Math.sqrt(n) ; i2++){
      if(testarray[i2]==true){
        for(int j=i2*i2; j<n ; j += i2){
          testarray[j] = false;
          }
        }
      }
      return testarray;
  } 
  
}