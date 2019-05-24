public class Grades {

  private int[] values;

  Grades() {
  }

  Grades(int[] myArray) {
  values = myArray;
  }

  public void setValues(int[] myArray) {
  values = myArray;
  }

  public int[] getValues() {
    return values;
  }

  public int numOfGrades() {
  return values.length;
  }

/*
  public int highest() {// returns the highest value in array };
  public int lowest() {// returns the lowest value in array };
  public double average() { // returns the average of array };
  public int numOfFailingGrades(int gradeValue) { // returns the number of values in the array that are less than input value, gradeValue };
  public void histogram() { // prints the histogram of grades };
*/
}
