
import java.util.Scanner;
import java.util.Random;

public class Guess {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int input;
    int numGuess = 1;

    Random  myRandomNumber = new Random();
    int myTwoDigitNumber = Math.abs( myRandomNumber.nextInt() % 100 );

    System.out.println("Random number is: " + myTwoDigitNumber);

    System.out.println("Guess a number:");
    
    input = scan.nextInt();
/*
    if (input == myTwoDigitNumber) {
       System.out.println("Guess is correct");
    } else if (input > myTwoDigitNumber) {
       System.out.println("Guess is too high");
    } else
       System.out.println("Guess is too low");
*/

    while (input != -1) {
      
      if (input == myTwoDigitNumber) {
       System.out.println("Correct");
       myTwoDigitNumber = Math.abs( myRandomNumber.nextInt() % 100 );
       System.out.println("Random number is: " + myTwoDigitNumber);
       System.out.println("Number of guess: " + numGuess);
       numGuess = 1;
       
      } else 
      if (input > myTwoDigitNumber) {
       System.out.println("Guess is too high");
       numGuess++;
      } else {
       System.out.println("Guess is too low");
       numGuess++;
      }

      

      System.out.println("Guess a number or -1 to quit:");
      input = scan.nextInt();
    }

    

  }

}