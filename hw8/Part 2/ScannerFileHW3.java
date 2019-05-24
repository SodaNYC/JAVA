import java.io.File;
import java.util.Scanner;

public class ScannerFileHW3 {

  public static void main(String[] args) throws Exception {

     String filename="textfile.txt";
     File f = new File(filename);

     Scanner scan1 = new Scanner(f);

     int lineCnt=0;


     while(scan1.hasNextLine()) {
       String line = scan1.nextLine();


      System.out.println(line);

       String[] s_arr1 = line.split("  ");
       for (int i=0; i<s_arr1.length; i++)
           lineCnt++;
     }

     System.out.println("Number of lines in the file is " + lineCnt);


     Scanner scan2 = new Scanner(f);

     int numCnt=0;

      while(scan2.hasNextLine()) {
        String line = scan2.nextLine();

        String[] s_arr2 = line.split(" ");
        for (int i=0; i<s_arr2.length; i++)
            numCnt++;
      }

      System.out.println("Number of words in the file is " + numCnt);
  }

}
