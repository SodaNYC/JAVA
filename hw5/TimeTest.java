class TimeTest {

  public static void main(String[] args) {

     Time est = new Time(20,25,59);
     est.printTime();

     est.tick();
     est.printTime();

     for (int i=0; i<60; i++)
        est.tick();


      est.printTime();
  }

}
