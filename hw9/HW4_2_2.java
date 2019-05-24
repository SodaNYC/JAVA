import java.util.Scanner;
import java.util.ArrayList;
class HW4_2_2{
public static void main (String[] args) {

boolean programme = true;
Scanner scan = new Scanner(System.in);


while(programme == true){
  System.out.println("Enter Input {first_name<tab>last_name<tab>zip_code} or type 'quit' to quit:");
  String input = scan.nextLine();
  ArrayList<HW4_2_1> fnlnzc = new ArrayList<HW4_2_1>();
      if(input.contains("quit")) {
      programme = false;
      }

      else{
        String[] space = input.split("\t");
        fnlnzc.add(new HW4_2_1(space[0],space[1],Integer.parseInt(space[2])));

        for(int i=0;i<fnlnzc.size();i++) {
        System.out.println(fnlnzc.get(i).getfn()+"\t"+fnlnzc.get(i).getln()+"\t"+fnlnzc.get(i).getzc());

      }
      }


}
}
}
