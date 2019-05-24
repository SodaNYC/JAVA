public class MyLinkedListTest {

   public static void main(String[] args) {

      MyLinkedList ml = new MyLinkedList();

      ml.add(new Node("bill"));
      ml.add(new Node("jill"));
      ml.add(new Node("sue"));

      ml.insertBefore(0,new Node("hao"));
      ml.insertBefore(3,new Node("mark"));
      ml.insertBefore(4,new Node("david"));

      ml.insertAfter(3,new Node("raya"));
      ml.insertAfter(6,new Node("daniel"));
      ml.insertAfter(8,new Node("rob"));

      ml.removeNodeAt(0);
      ml.removeNodeAt(5);
      ml.removeNodeAt(6);

      System.out.println("The string hao is at " + ml.indexOf("hao") + " in LinkedList");
      System.out.println("The string bill is at " + ml.indexOf("bill") + " in LinkedList" );
      System.out.println("The string jill is at " + ml.indexOf("jill") + " in LinkedList" );
      System.out.println("The string raya is at " + ml.indexOf("raya") + " in LinkedList" );
      System.out.println("The string mark is at " + ml.indexOf("mark") + " in LinkedList" );
      System.out.println("The string david is at " + ml.indexOf("david") + " in LinkedList" );
      System.out.println("The string daniel is at " + ml.indexOf("daniel") + " in LinkedList" );
      System.out.println("The string sue is at " + ml.indexOf("sue") + " in LinkedList" );
      System.out.println("The string rob is at " + ml.indexOf("rob") + " in LinkedList" );

      ml.printList();
   }

}
