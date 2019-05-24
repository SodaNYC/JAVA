public class Japanese implements Speaker{
  public void speak() {
    System.out.println("Ko ni ji wa");
  }

  public void announce( String str ) {
    System.out.println("The language people speak for greeting: " + str);
}
}
