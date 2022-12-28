public class FirstClassGrade {
    public static void main(String[] args) {
        Grades grades = new Grades();

        grades.add(10);
        grades.add(5);
//        grades.add(4);
//        grades.add(4);
//        grades.add(4);
//        grades.add(4);
//        grades.add(4);
//        grades.add(4);
//        grades.add(2);

        grades.lastGrade();
        grades.aritmeticAverage();
        System.out.println();
        grades.add(2);
        grades.aritmeticAverage();

    }
}
