import java.util.* ;
  class hilo {
    public static void main (String[] args) {
      Random  myRandomNumber = new Random();
      int myTwoDigitNumber = Math.abs( myRandomNumber.nextInt() % 100 );

      Scanner scan = new Scanner(System.in);
      System.out.print("Just generated a new number between 0 and 99(inclusive), please guess that number or type -1 to quit: ");
      int number = scan.nextInt();

      while(number != -1) {
        int i = 1;//number of guesses

            while(number<0 || number>100) {
              System.out.print("Reenter a valid number between 0 and 99(inclusive) to guess or type -1 to quit: ");
              number = scan.nextInt();
            }

            {
              while(number != myTwoDigitNumber && number != -1) {
                    if(number<0) {
                      System.out.print("Reenter a valid number between 0 and 99(inclusive) to guess: ");
                      number = scan.nextInt();
                      i--;
                    }
                    else if(number < myTwoDigitNumber){
                      System.out.print("The guess is low, please guess a higher number type -1 to quit: ");
                      number = scan.nextInt();
                    }

                    else if(number > myTwoDigitNumber) {
                      System.out.print("The guess is high, please guess a lower number type -1 to quit: ");
                      number = scan.nextInt();
                    }
                i++;
                }

                    {
                    if(number == -1) {
                    }
                    else if(number == myTwoDigitNumber) {
                    System.out.println("Number of guesses are " + i);
                    System.out.println("The guess " + number +" is correct!");

                    myRandomNumber = new Random();
                    myTwoDigitNumber = Math.abs( myRandomNumber.nextInt() % 100 );

                    System.out.print("Just generated another new number between 0 and 99(inclusive), please guess that number or type -1 to quit: ");
                    number = scan.nextInt();
                    }
                  }

           }
     }
      System.out.println("You just quitted, see you next time!");
  }
}
