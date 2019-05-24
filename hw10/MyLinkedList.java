class MyLinkedList {

  private Node head;

  MyLinkedList() {
    head = null;
  }

  public void add(Node n) { // add a Node to end of the LinkedList

     Node trav;

     if (head==null) {
        head = n;
     } else {
        trav = head;
        while (trav.next != null)
           trav = trav.next;

        trav.next = n;

     }
  }

  public void printList() { // print each element in the LinkedList

    Node trav;
    trav = head;

    while (trav != null) {
      System.out.println(trav.name);
      trav = trav.next;
    }

  }



   public void insertBefore (int index,  Node n)  { // adds Node n before index value

     Node trav;

         if (index == 0) {

           n.next = head;
           head = n; //change the head position

         }

         else if (index > 0) {
         trav = head;

             for(int i = 0; i<index-1; i++) {

             trav = trav.next;
             }

               if(trav.next != null) {
                 n.next = trav.next;
                 trav.next = n;}

         }

     }

     public void insertAfter (int index,  Node n)  { // adds Node n after index value

       Node trav;

       if(index > 0) {
         trav = head;

             for(int i = 0; i<index-1; i++) {

             trav = trav.next;
             }

               if(trav != null) {
                 n.next = trav.next;
                 trav.next = n;
               }
               else
                 trav.next = n;
       }
     }


     public int  indexOf (String  str) { //returns index of where String str  is at.  Returns -1 if String str is not in LinkedList }

     Node trav;
     int index = 0;

     trav = head;


         while (trav != null) {
             if (str.equals(trav.name)) {
               return index;
             }
             index++;
             trav = trav.next;
         }
         return -1;
    }


     public void removeNodeAt(int index) { // removes Node at index value

      Node trav;

      if(index == 0) {
      trav = head;
      head = trav.next;



      }
      else if(index>0) {
      trav = head;

          for(int i = 0; i<index-1; i++) {
          trav = trav.next;
          }

            if(trav.next.next != null)
            trav.next = trav.next.next;
            else
            trav.next = null;
      }
   }

}
