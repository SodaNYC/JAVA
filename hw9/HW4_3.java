import java.io.File;
import java.util.Scanner;

public class HW4_3 {

  public static void main(String[] args) throws Exception {

     String filename="Input File.txt";
     File f = new File(filename);

     Scanner scan = new Scanner(f);


     while(scan.hasNextLine()) {
       String line = scan.nextLine();
       System.out.println(line);


  }
}
}
