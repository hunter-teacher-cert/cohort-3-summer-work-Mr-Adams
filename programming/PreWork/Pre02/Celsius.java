import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Celsius {
  public static void main(String[] args) {
    double celsius , fahrenheit;
    Scanner in = new Scanner(System.in);
    System.out.print("Enter degress in Celsius: ");
    celsius = in.nextDouble();
    fahrenheit = celsius * (9.0/5.0) + 32.0;
        in.nextLine();
    System.out.println(celsius + " C " + fahrenheit + " F");
    }
}