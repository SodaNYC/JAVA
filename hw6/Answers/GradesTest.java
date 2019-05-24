public class GradesTest{
  public static void main(String[] args) {

    int[] myValues = {90,80,60,70,97,89};

    Grades cs502 = new Grades();
    cs502.setValues(myValues);

    //Grades cs502 = new Grades(myValues);//this one is super faster

    System.out.println("length is " +cs502.numOfGrades());
  }
}
