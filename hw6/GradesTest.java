import java.util.Scanner;
class GradesTest{
  public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);

     System.out.print("Enter the number of grades to input: ");
     int numGrades = scan.nextInt();

     int[] Grades_here = new int[numGrades];

     for(int i = 0;i < Grades_here.length; i++){
         System.out.print("Enter grade "+(i+1)+": ");
         Grades_here[i] = scan.nextInt();

         while (Grades_here[i]<0 || Grades_here[i]> 100){
         System.out.print("Invalid grade, reenter grade "+(i+1)+" again (valid grade values are 0 – 100 inclusive): ");
         Grades_here[i] = scan.nextInt();
         }
       }

     Grades obj = new Grades (Grades_here);

     System.out.print("All the grades entered are:");
     for(int i = 0;i < Grades_here.length; i++){
     System.out.print(" " + Grades_here[i]);
     }
     System.out.println();

     System.out.print("The highest grades is " + obj.highest());
     System.out.println();

     System.out.print("The lowest grades is " + obj.lowest());
     System.out.println();

     System.out.print("The number of grades is " + obj.numOfGrades());
     System.out.println();

     System.out.print("The average of grades is " + obj.average());
     System.out.println();

     System.out.print("The number of failling grades is " + obj.numOfFailingGrades(60));
     System.out.println();

     System.out.println("The histogram of grades: ");
     obj.histogram();
 }
}
