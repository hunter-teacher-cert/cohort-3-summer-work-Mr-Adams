import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.util.Random;


public class Guess {
  public static void main(String[] args) {
    int number, guess;
    Random random = new Random();
    number = random.nextInt(100) + 1; 
    System.out.println("I'm thinking of a number between 1 and 100");
    System.out.println("(including both). Can you guess what it is?");
    Scanner in = new Scanner(System.in);
    System.out.print("Type a number: ");
    guess = in.nextInt();
    System.out.println("Your guess is: " + guess);
    System.out.println("The number I was thinking of is: " +number);
    System.out.println("You were off by: " + (guess-number));
    }
}