//programmed in breakout room one with Will, Latoya, Yanique 
import java.io.*;
import java.util.*;

public class Nim
  {
    public static void main( String[] args )
    {
      int stones = 12;
      int stonesTaken;

      Scanner input = new Scanner(System.in);
        Random rand = new Random();
        while(stones > 0) {
        System.out.print("How many stones do you want to take? (1-3): ");
        stonesTaken = input.nextInt();
            if (stonesTaken>stones)//tests to make sure won't end with negative stones 
            {stonesTaken=stones;
             System.out.println("You cannot have negative stones.  Your guess has been changed to " +stones + " stones");
            }
        while(stonesTaken > 3) {
            System.out.print("You can only pick 1-3 stones please revise your guess: ");
            stonesTaken = input.nextInt();
            input.nextLine();
            if (stonesTaken>stones)//tests to make sure won't end with negative stones 
            {stonesTaken=stones;
             System.out.println("You cannot have negative stones.  Your guess has been changed to " +stones + " stones");
            }
        }
            stones -= stonesTaken;//gives remaining stones
        if (stones <= 0) {
            System.out.println("Player wins");
            input.nextLine();
            break;
        }
            System.out.println(stones + " Remaining");
        //computer turn
            stonesTaken = rand.nextInt(3)+1;
            if (stonesTaken>stones)//tests to make sure won't end with negative stones 
            {stonesTaken=stones;
            }
            System.out.println("The computer took " + stonesTaken + " stones");
            
            
        stones -= stonesTaken;//gives remaining stones
            if (stones <= 0) {
            System.out.println("Computer wins");
                break;
        }
            System.out.println(stones + " Remaining");
            
        //prompt user input (user turn)

        //calculating number of stones remining and print it

        //check for did you win

        //machine takes turn

        //calculating number of stones remining and print it

        
        //check win
//1 stone remaining to win or select the last 3?
        
      }
    }
  }