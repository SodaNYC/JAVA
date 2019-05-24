class StudentTest {
public static void main(String[] args) {
UnderGraduateStudent Hao1 = new UnderGraduateStudent();
Hao1.setMidtermExam(90);
Hao1.setFinalExam(95);
System.out.println("The average score is "+ Hao1.calcAvg() + " and Lettergrade of Hao1 is "+Hao1.getLetterGrade());

UnderGraduateStudent Hao2 = new UnderGraduateStudent();
Hao2.setMidtermExam(81);
Hao2.setFinalExam(90);
System.out.println("The average score is "+ Hao2.calcAvg() + " and Lettergrade of Hao2 is "+Hao2.getLetterGrade());

UnderGraduateStudent Hao3 = new UnderGraduateStudent();
Hao3.setMidtermExam(72);
Hao3.setFinalExam(80);
System.out.println("The average score is "+ Hao3.calcAvg() + " and Lettergrade of Hao3 is "+Hao3.getLetterGrade());

UnderGraduateStudent Hao4 = new UnderGraduateStudent();
Hao4.setMidtermExam(65);
Hao4.setFinalExam(60);
System.out.println("The average score is "+ Hao4.calcAvg() + " and Lettergrade of Hao4 is "+Hao4.getLetterGrade());

UnderGraduateStudent Hao5 = new UnderGraduateStudent();
Hao5.setMidtermExam(52);
Hao5.setFinalExam(20);
System.out.println("The average score is "+ Hao5.calcAvg() + " and Lettergrade of Hao5 is "+Hao5.getLetterGrade());

System.out.println();

GraduateStudent Jimmy1 = new GraduateStudent();
Jimmy1.setMidtermExam(90);
Jimmy1.setFinalExam(95);
System.out.println("The average score is "+ Jimmy1.calcAvg() + " and Lettergrade of Jimmy1 is "+Jimmy1.getLetterGrade());

GraduateStudent Jimmy2 = new GraduateStudent();
Jimmy2.setMidtermExam(81);
Jimmy2.setFinalExam(90);
System.out.println("The average score is "+ Jimmy2.calcAvg() + " and Lettergrade of Jimmy2 is "+Jimmy2.getLetterGrade());

GraduateStudent Jimmy3 = new GraduateStudent();
Jimmy3.setMidtermExam(72);
Jimmy3.setFinalExam(80);
System.out.println("The average score is "+ Jimmy3.calcAvg() + " and Lettergrade of Jimmy3 is "+Jimmy3.getLetterGrade());

GraduateStudent Jimmy4 = new GraduateStudent();
Jimmy4.setMidtermExam(65);
Jimmy4.setFinalExam(60);
System.out.println("The average score is "+ Jimmy4.calcAvg() + " and Lettergrade of Jimmy4 is "+Jimmy4.getLetterGrade());

GraduateStudent Jimmy5 = new GraduateStudent();
Jimmy5.setMidtermExam(52);
Jimmy5.setFinalExam(20);
System.out.println("The average score is "+ Jimmy5.calcAvg() + " and Lettergrade of Jimmy5 is "+Jimmy5.getLetterGrade());
}
}
