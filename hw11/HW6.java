import java.util.*;
import java.io.*;

class HW6 {
  public static void main(String[] args) throws Exception {

      Scanner scan = new Scanner(new File("attendance.txt"));
      String input;

      TreeMap<String,ArrayList<String>> hm = new TreeMap<String,ArrayList<String>>();


      while (scan.hasNextLine()) {
        input = scan.nextLine();

        Email email_address = new Email();
        email_address.setEmail(input);
        String company = email_address.getCompany();
        String pname =  email_address.getName();


        if(pname.contains("bill.gates")) {
        System.out.println("Bill Gates attended conference.");
        System.out.println();
        }

        if (hm.containsKey(company)) {
          ArrayList<String> tmpAl;
          tmpAl = hm.get(company);
          tmpAl.add(pname);
          hm.put(company,tmpAl);
          Collections.sort(tmpAl);
        } else {
           ArrayList<String> al = new ArrayList<String>();
           al.add(pname);
           hm.put(company,al);
          }
      }



        Iterator it = hm.entrySet().iterator();

        while (it.hasNext()) {
           Map.Entry<String,ArrayList<String>> pair = (Map.Entry)it.next();
           String  company_al = pair.getKey();
           ArrayList<String> pname_key = pair.getValue();


           System.out.print(company_al + ":");
           for (String s : pname_key){
               System.out.print("*");}
               System.out.println();

              for (String s : pname_key) {

                  System.out.println(company_al+"\t"+s);


              }
}


        String text = "My name is Hao Dong\r\n";
                	BufferedWriter output = null;
                	try {
                    	    File file = new File("example.txt");
                    	    output = new BufferedWriter(new FileWriter(file));
                    	    output.write(text);
                	} catch ( IOException e ) {
                    	    e.printStackTrace();
                	} finally {
                                 if ( output != null ) {
                                          output.close();  // need to close file to write to a file
                  	}
                }



}
}
