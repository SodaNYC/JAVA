class UnderGraduateStudent extends Student {

  public char getLetterGrade() {

    double avg;
    char letterGrade;

    avg = calcAvg();

    if (avg >= 90)
  letterGrade = 'A';
    else
    if (avg >= 80)
  letterGrade = 'B';
    else
    if (avg >= 70)
  letterGrade = 'C';
    else
    if (avg >= 60)
  letterGrade = 'D';
    else
  letterGrade = 'F';

    return letterGrade;
  }
}
