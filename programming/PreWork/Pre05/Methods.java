import java.io.*;
import java.util.*;

public class Methods {

  public static void main(String[] args) {
    System.out.println(isDivisible(4,2));
    System.out.println(isTriangle(12,2,2));
    System.out.println(ack(3,3));
      }
  
  public static boolean isDivisible(int m , int n) {
    if (m % n == 0) {
      return true;
    }   else {
      return false;
    }
  }
  public static boolean isTriangle(int x, int y, int z) {
    return (x + y > z && y + z > x && x + z > y);
  }

  public static int ack(int m, int n) {
    if (m == 0 ){
      return n + 1;
    } else if (m>0 && n==0){
      return ack(m-1,1);
    } else {
      return ack(m-1,ack(m,n-1));
    }
    }
  }
  
