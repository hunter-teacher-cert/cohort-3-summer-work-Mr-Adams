import java.io.*;
import java.util.*;

public class Time {
  public static void main(String[] args) {
    int hour = 22, minute = 49, second = 25, starthour = 22, startminute = 30, startsecond = 0;
    int starttime = startsecond + startminute * 60 + starthour * 3600;
    int totalseconds = second + minute * 60 + hour * 3600;
    System.out.print("Seconds since midnight: ");
    System.out.println(totalseconds);
    System.out.print("Seconds until midnight: ");
    System.out.println(86400 -totalseconds);
    System.out.print("Percentage of day that has passed: ");
    System.out.println((double)totalseconds/86400.0);
    System.out.print("Time elasped on work: ");
    System.out.println( totalseconds - starttime);
    }
}