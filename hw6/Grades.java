class Grades {

  private int[] values;

  Grades () {
  System.out.println("in Grades() constructor");
  }
  Grades (int[] myArray) {
  System.out.println("in Grades (int[] myArray) constructor");
  values = myArray;
  }

  public void setValues(int[] myArray) {
  values = myArray;
  }

  public int[] getValues() {
  return values;
  }

  public int highest() {
  int highest = values[0];
  for(int i=0;i<values.length;i++){
    if(values[i]>highest) {
    highest = values[i];
    }
  }
  return highest;
  }

  public int lowest() {
  int lowest = values[0];
  for(int i=0;i<values.length;i++){
    if(values[i]<lowest) {
    lowest = values[i];
    }
  }
  return lowest;
  }

  public int numOfGrades() {
  int count=0;
  for(int i=0;i<values.length;i++){
  count++;
  }
  return count;
  }

  public double average() {
  double sum=0;
  for(int i=0;i<values.length;i++){
  sum=sum+values[i];
  }
  double avg = sum/values.length;
  return avg;
  }

  public int numOfFailingGrades(int gradeValue) {
  int count = 0;
  for(int i=0;i<values.length;i++){
    if(values[i]<gradeValue){
    count++;
    }
  }
  return count;
  }

  public void histogram() {
  char star = '*';
  System.out.print("90 – 100 | ");
  for(int i=0;i<values.length;i++){
    if(values[i]>= 90 && values[i]<=100){
    System.out.print(star);}
  }
  System.out.println();

  System.out.print("80 – 89  | ");
  for(int i=0;i<values.length;i++){
    if(values[i]>= 80 && values[i]<=89){
    System.out.print(star);}
    }
    System.out.println();

  System.out.print("70 – 79  | ");
  for(int i=0;i<values.length;i++){
    if(values[i]>= 70 && values[i]<=79){
    System.out.print(star);}
    }
    System.out.println();

  System.out.print("60 – 69  | ");
  for(int i=0;i<values.length;i++){
    if(values[i]>= 60 && values[i]<=69){
  System.out.print(star);}
  }
  System.out.println();

  System.out.print("<60      | ");
  for(int i=0;i<values.length;i++){
    if(values[i]<60){
  System.out.print(star);}
  }
  System.out.println();
 }
}
