import java.io.*;
import java.util.*;

public class Date {
  public static void main(String[] args) {
    String day = "Saturday";
    int date = 23;
    String month = "April";
    int year = 2022;
    System.out.println("American format:");
    System.out.println(day + ", " + month + " " + day + ", " + year);
    System.out.println("European format:");
    System.out.println(day + " " + date + " " + month + " " + year);
    }
}