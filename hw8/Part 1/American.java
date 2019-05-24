public class American implements Speaker{
  public void speak() {
    System.out.println("Hello");
  }

  public void announce( String str ) {
    System.out.println("The language people speak for greeting: " + str);
  }
}
