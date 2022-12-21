package adv.maps.complex;

import java.util.ArrayList;
import java.util.List;

public class Grades {

    private List<Double> listOfGrades = new ArrayList<>();

    public Grades(double... listOfGrades) {
        for (double grade : listOfGrades) {
            this.listOfGrades.add(grade);
        }
    }

    public double getAverage() {
        double sum = 0;
        for (Double listOfGrade : listOfGrades) {
            sum += listOfGrade;
        }
        return sum / listOfGrades.size();
    }

    @Override
    public String toString() {
        return "Grades{" + listOfGrades.toString() +
                '}';
    }
}

