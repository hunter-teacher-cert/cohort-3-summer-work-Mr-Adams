import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Craps {
  public static void main (String[] args) {
  int rounds;
  int wins = 0, losses = 0;
    System.out.println("Please enter the number of rounds you wouldlike to play. ");
    Scanner input = new Scanner(System.in);
    rounds = input.nextInt();
    for(int i=1;i <= rounds; i++){
      if(round()){
        wins ++;
        System.out.println("Round: " + i + " player wins!");
      }
      else{
        losses ++;
        System.out.println("Round: " + i + " player looses!");
      }
      }
    System.out.println("Player won " + wins + " games and lost " + losses +" games");
    }
  
  public static int roll(int dice_sides) {
    Random random = new Random();
    int dieRoll = random.nextInt(dice_sides) + 1;
		return dieRoll;
  }
  public static int shoot (int dice, int dice_sides){
    int result = 0;
    for(int i = 0; i < dice; i++) {
      result += roll(dice_sides);
        }
        return result;
  }

  public static boolean round(){
    int roll = shoot(2,6);
    if((roll == 2) || (roll == 3) || (roll ==12)){
      return false;
    }
    else if ((roll==7) || (roll == 11)){
      return true;
    }
    else{
    int point = roll;
      while(true){
        roll = shoot(2,6);
        if(point==7){
          return false;
        }
        if(roll == point){
          return true;
        }
      }
    }
  }
}  