import java.util.Scanner;
public class HW1_2{
  public static void main (String[] args) {
    Scanner scan = new Scanner (System.in);

    int number;
    int change;
    int Quarters;
    int remain;
    int Dimes;
    int Nickels;
    int Pennies;

    System.out.print("Enter the purchase amount: ");
    number = scan.nextInt();

    while(number < 0 || number > 100)
    {
    System.out.print("Invalid input. Please reenter: ");
    number = scan.nextInt();
    }

    change = 100 - number;
    Quarters = change/25;
    remain = change % 25;
    Dimes = remain / 10;
    remain = remain % 10;
    Nickels = remain/5;
    Pennies = remain % 5;

    System.out.println("Your change of " + change + " cents is given as:");
    System.out.println(Quarters + " Quarters");
    System.out.println(Dimes + " Dimes");
    System.out.println(Nickels + " Nickels");
    System.out.println(Pennies + " Pennies");
  }
}
