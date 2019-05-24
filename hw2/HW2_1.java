import java.util.Scanner;

public class HW2_1{

  public static void main (String[] args) {

    Scanner scan = new Scanner (System.in);

    int number;//input value
    int sum; //arithmetic series
    int n;//number of even integers between 2 and the input integer value

    System.out.print("Input an integer value: ");
    number = scan.nextInt();

    while(number<2)
    {
    System.out.print("Please reenter an integer value: ");
    number = scan.nextInt();
    }

    n = number/2;
    sum = (2+2*n) * n /2;

    System.out.println("The sum of all even integers between 2 and its input value is " + sum);

  }
}
