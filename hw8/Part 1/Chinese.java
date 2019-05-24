public class Chinese implements Speaker{
  public void speak() {
    System.out.println("Ni Hao");
  }

  public void announce(String str) {
    System.out.println("The language people speak for greeting: " + str);
  }
}
