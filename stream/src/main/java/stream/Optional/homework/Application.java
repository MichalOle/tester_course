package stream.Optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Grabara",new Teacher("Bak")));
        students.add(new Student("Piotrkowski",new Teacher("Bak")));
        students.add(new Student("Adamek",new Teacher("Ryk")));
        students.add(new Student("Borkowski", null));


        for (Student student : students) {
            System.out.println(student);
        }
    }
}
