import java.util.Scanner;
public class HW3_1 {
public static void main (String[] args) {

System.out.println("*******************************************************");
System.out.println("\t\t\tMenu");
System.out.println("*******************************************************");
System.out.println("1)      Calculate earnings at $10.00/hr");
System.out.println("2)      Calculate earnings at $.10 doubled each hour");
System.out.println("3)      Exit");
System.out.println("*******************************************************");

int option;
int numHours = 0;
double earnings = 0;
double part = 0;

Scanner scan = new Scanner(System.in);

System.out.print("Input the option number 1 or 2 or 3: ");
option = scan.nextInt();

  while(option != 3){
    if(option == 1)
      {
      System.out.print("Input the time: ");
      numHours = scan.nextInt();

          while(numHours<0)
          {
          System.out.print("Reinput the valid time which is equal or more than 0 hour: ");
          numHours = scan.nextInt();
          }

      earnings = 10 * numHours;
      String result = String.format("%.2f", earnings);
      System.out.println();
      System.out.println("1");
      System.out.println("How many hours? " + numHours);
      System.out.println("You will earn $" + result);
      System.out.print("Input the option number 1 or 2 or 3: ");
      option = scan.nextInt();
      earnings = 0;

      }

    else if(option == 2)
      {
      System.out.print("Input the time: ");
      numHours = scan.nextInt();

          while(numHours<0)
          {
          System.out.print("Reinput the valid time which is equal or more than 0 hour: ");
          numHours = scan.nextInt();
          }

      System.out.println();
      System.out.println("2");
      System.out.println("How many hours? " + numHours);


        while(numHours>0){
        part = (Math.pow(2,numHours-1))/10;
        earnings = part + earnings;
        numHours--;
        }
        String result = String.format("%.2f", earnings);
        System.out.println("You will earn $" + result);
        System.out.print("Input the option number 1 or 2 or 3: ");
        option = scan.nextInt();
        earnings = 0;
        }
    else if( (option > 3) || (option<1)){
    System.out.print("Wrong! Input the option number 1 or 2 or 3 please: ");
    option = scan.nextInt();
  }
 }
 }
}
