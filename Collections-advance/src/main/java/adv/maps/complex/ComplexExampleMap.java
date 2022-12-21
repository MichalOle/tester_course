package adv.maps.complex;

import java.util.HashMap;
import java.util.Map;

public class ComplexExampleMap {
    public static void main(String[] args) {
        Map<Student, Grades> school = new HashMap<>();
        Student student = new Student("Adam", "Konieczko");
        Student student2 = new Student("Alan", "Rak");

        Grades grades = new Grades(3.0, 4.0, 5.0);
        Grades grades2 = new Grades(2.0, 4.0, 5.0);


        school.put(student, grades);
        school.put(student2, grades2);
        school.put(new Student("Adam", "Gzik"), new Grades(5.0, 3.5, 6.0, 2.5, 1.0));


        System.out.println(school.get(new Student("Adam", "Gzik")));
        System.out.println(school.get(student2));

        System.out.println(" ");

        for (Map.Entry<Student, Grades> studentGradesEntry : school.entrySet()) {
            System.out.println(studentGradesEntry.getKey().getName() + " " + studentGradesEntry.getKey().getSurname());
            System.out.println(studentGradesEntry.getValue());
            System.out.println("Srednia ocen ucznia wynosi: " + studentGradesEntry.getValue().getAverage());

        }
    }
}
