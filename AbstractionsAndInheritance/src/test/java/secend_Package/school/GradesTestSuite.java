package secend_Package.school;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GradesTestSuite {
    @Test
    public void shouldHaveZeroLength() {
        Grades grades = new Grades();
        int[] values = grades.getValues();
        assertEquals(0, values.length);
    }
    @Test
    public void getAverage(){
        Grades grades = new Grades();
        grades.add(2);
        grades.add(4);
        grades.add(4);
        //delta wymagana przy typie double - Java nie zaokragala wartosci przez co np zamiast oczekiwanego 3.33 wyjdzie blad bo kompilator przemielil wartosci 3.333333
        assertEquals(3.33,grades.getAverage(),0.01);
    }
    @Test
    public void shouldReturnAverageEqualsZeroForEmptyArray(){
        Grades grades = new Grades();
        assertEquals(0,grades.getAverage(),0.0001);
    }
    @Test
    public void shouldAddTwoElementsToArray() {
        Grades grades = new Grades();
        grades.add(4);
        grades.add(2);
        int[] grad = grades.getValues();
        assertEquals(2, grad.length);
        assertEquals(4, grad[0]);
        assertEquals(2, grad[1]);
    }
    @Test
    public void listOfStudents(){
        Student student1 = new Student("Michal");
        Student student2 = new Student("Karol");
        Student student3 = new Student("Iza");

    }

}
