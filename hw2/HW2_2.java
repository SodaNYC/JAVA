import java.util.Random;
import java.util.Scanner;
public class HW2_2{
  public static void main (String[] args){
    Random myRandomNumber = new Random();
    int myOneDigitNumber1 = Math.abs( myRandomNumber.nextInt () % 10);
    int myOneDigitNumber2 = Math.abs( myRandomNumber.nextInt () % 10);
    int answer = myOneDigitNumber1 * myOneDigitNumber2;

    System.out.println("How much is " + myOneDigitNumber1 + " times " + myOneDigitNumber2 + "?");
    Scanner scan = new Scanner (System.in);
    System.out.print("answer: ");
    answer = scan.nextInt();

    while(answer != -1 )
    {
      if(answer != myOneDigitNumber1 * myOneDigitNumber2)
      {
      System.out.println("No. Please try again.");
      System.out.println("How much is " + myOneDigitNumber1 + " times " + myOneDigitNumber2 + "?");
      System.out.print("answer: ");
      answer = scan.nextInt();
      }

      else
      {
      System.out.println("Very Good!");
      myRandomNumber = new Random();
      myOneDigitNumber1 = Math.abs( myRandomNumber.nextInt () % 10);
      myOneDigitNumber2 = Math.abs( myRandomNumber.nextInt () % 10);
      System.out.println("How much is " + myOneDigitNumber1 + " times " + myOneDigitNumber2 + "?");
      System.out.print("answer: ");
      answer = scan.nextInt();
      }
    }
    System.out.println("You exit the program, see you next time!");
    System.exit(0);

 }
}
