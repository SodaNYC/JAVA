import java.util.Scanner;
public class HW2_1Ans {
public static void main (String[] args) {

Scanner scan = new Scanner (System.in);
int input;
int sum = 0;

System.out.print("Input an integer value: ");
input = scan.nextInt();

while (input >= 2){
  if(input % 2 == 0)
    sum = sum + input;
    input --;
  }
  System.out.println("the sum is " + sum);
 }
}
