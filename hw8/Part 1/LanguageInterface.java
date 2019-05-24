import java.util.ArrayList;

public class LanguageInterface {

  public static void main(String[] args) {
    String str;

    Chinese c = new Chinese();
    c.speak();
    c.announce("Chinese");

    American a = new American();
    a.speak();
    a.announce("English");

    Japanese j = new Japanese();
    j.speak();
    j.announce("Japanese");

    System.out.println("Interface data type:");
    Speaker s;
    s=c;
    s.speak();
    s.announce("Chinese");
    s=a;
    s.speak();
    s.announce("English");
    s=j;
    s.speak();
    s.announce("Japanese");

    System.out.println("Gretting Expressions:");
    ArrayList<Speaker> GE = new ArrayList<Speaker>();
    GE.add(new Chinese());
    GE.add(new American());
    GE.add(new Japanese());

    for(int i=0;i<GE.size();i++) {
      Speaker sk = GE.get(i);
      sk.speak();
    }
  }

}
