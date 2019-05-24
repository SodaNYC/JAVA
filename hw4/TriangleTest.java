class TriangleTest {

  public static void main(String[] args) {

    Triangle t1 = new Triangle();
    boolean t1_triangle1_1;//the test for triangle1 if they are scalene or isosceles or equilateral
    int t1_triangle1_2; //the test for getting the the perimeter of the triangle1

    t1.side1 = 1;
    t1.side2 = 1;
    t1.side3 = 1;

    System.out.println("Side1 of triangle1 is "+ t1.side1);
    System.out.println("Side2 of triangle1 is "+ t1.side2);
    System.out.println("Side3 of triangle1 is "+ t1.side3);

    t1_triangle1_1 = t1.isScalene();
    System.out.println("\"Triangle1 is scalene\" is " + t1_triangle1_1);

    t1_triangle1_1 = t1.isIsosceles();
    System.out.println("\"Triangle1 is isosceles\" is " + t1_triangle1_1);

    t1_triangle1_1 = t1.isEquilateral();
    System.out.println("\"Triangle1 is equilateral\" is " + t1_triangle1_1);

    t1_triangle1_2 = t1.calculatePerimeter();
    System.out.println("The perimeter of triangle1 is " + t1_triangle1_2);






    System.out.println();

    Triangle t2 = new Triangle();
    boolean t2_triangle2_1;//the test for triangle2 if they are scalene or isosceles or equilateral
    int t2_triangle2_2; //the test for getting the the perimeter of the triangle2

    t2.side1 = 1;
    t2.side2 = 2;
    t2.side3 = 2;

    System.out.println("Side1 of triangle2 is "+ t2.side1);
    System.out.println("Side2 of triangle2 is "+ t2.side2);
    System.out.println("Side3 of triangle2 is "+ t2.side3);

    t2_triangle2_1 = t2.isScalene();
    System.out.println("\"Triangle2 is scalene\" is " + t2_triangle2_1);

    t2_triangle2_1 = t2.isIsosceles();
    System.out.println("\"Triangle2 is isosceles\" is " + t2_triangle2_1);

    t2_triangle2_1 = t2.isEquilateral();
    System.out.println("\"Triangle2 is equilateral\" is " + t2_triangle2_1);

    t2_triangle2_2 = t2.calculatePerimeter();
    System.out.println("The perimeter of triangle2 is " + t2_triangle2_2);






    System.out.println();

    Triangle t3 = new Triangle();
    boolean t3_triangle3_1;//the test for triangle3 if they are scalene or isosceles or equilateral
    int t3_triangle3_2; //the test for getting the the perimeter of the triangle3

    t3.side1 = 1;
    t3.side2 = 2;
    t3.side3 = 3;

    System.out.println("Side1 of triangle3 is "+ t3.side1);
    System.out.println("Side2 of triangle3 is "+ t3.side2);
    System.out.println("Side3 of triangle3 is "+ t3.side3);

    t3_triangle3_1 = t3.isScalene();
    System.out.println("\"Triangle3 is scalene\" is " + t3_triangle3_1);

    t3_triangle3_1 = t3.isIsosceles();
    System.out.println("\"Triangle3 is isosceles\" is " + t3_triangle3_1);

    t3_triangle3_1 = t3.isEquilateral();
    System.out.println("\"Triangle3 is equilateral\" is " + t3_triangle3_1);

    t3_triangle3_2 = t3.calculatePerimeter();
    System.out.println("The perimeter of triangle3 is " + t3_triangle3_2);
  }
}
