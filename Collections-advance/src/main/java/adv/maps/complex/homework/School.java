package adv.maps.complex.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class School {
    private int numberOfStudents;
    private String schoolName;
    List<Integer> school = new ArrayList<>();

    public School(String schoolName, Integer...school ){
        this.schoolName=schoolName;
        for (Integer integer : school) {
            numberOfStudents += integer;
            this.school.add(integer);
        }
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        School school1 = (School) o;
        return Objects.equals(schoolName, school1.schoolName) && Objects.equals(school, school1.school);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schoolName, school);
    }

    @Override
    public String toString() {
        return "( " + schoolName + " " +
                 school + ")[Licząca łącznie "+ getNumberOfStudents() +" liczbę uczniów.]";
    }
}
