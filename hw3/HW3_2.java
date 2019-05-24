public class HW3_2{
public static void main (String[] args){

int numHours = 1;
double earnings_1 = 0;
double earnings_2 = 0;
double n = 0;
double part = 0;
int result;

while(earnings_1 >= earnings_2){
earnings_1 = 10 * numHours;

    while(n < numHours){
    part = (Math.pow(2,n))/10;
    earnings_2 = part + earnings_2;
    n++;
    }

numHours++;

}
result = numHours - 1 - 1;//When number of hours = 10, the earnings_1 = 100 and earnings_2 = 102.3. Afterwards, we will go back to the first while loop again to determine that earnings_2 is larger than earnings_1, but it's too late to output the number of hours, becasue the first while loop set the numHours++ statement at the end, that means the number of hours will be automatically added a extra one which will be turning to 11 before the programme check if earnings_2 is finally larger than earnings_1, thus, we need let number of hours minus one first. Also, since the question is said word BEFORE, To output the right number of hours required BEFORE the second method becomes more beneficial than the first method(when it's 10 hours, second method is already more beneficail than the first one), we need let number of hours minus one one more time.
System.out.println("The number of hours required before the second method becomes more beneficial than the first method is " + result + " hours.");
  }
}
