import java.util.Scanner;
class HW4_1{
public static void main (String[] args) {

int[] Array = new int[51];
for(int i=0;i<51;i++){
Array[i]=0;
}

Scanner scan = new Scanner(System.in);
System.out.print("Enter a value between 0 and 50 [ -1 to end ]: ");
int number = scan.nextInt();

while(number != -1) {
    if(number>50 || number<0) {
    System.out.print("the number is invalid, please reenter a value between 0 and 50 again[ -1 to end ]: ");
    number = scan.nextInt();
    }
    else{
    Array[number]=Array[number]+1;
    System.out.print("Enter a value between 0 and 50 [ -1 to end ]: ");
    number = scan.nextInt();
    }
  }

  {
  for(int i=0;i<51;i++){
    if(Array[i]>0)
    System.out.println("The value of " + i + " has " + Array[i] + " occurrences.");
  }
  }

 }
}
