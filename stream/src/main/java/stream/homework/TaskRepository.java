package stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {

public static List<Task> getTasks(){
    LocalDate currentDate = LocalDate.now();
    LocalDate deadline1 = LocalDate.of(2023,6,30);
    LocalDate deadline2 = LocalDate.of(2027,6,30);
    LocalDate deadline3 = LocalDate.of(2023,1,30);
    LocalDate deadline4 = LocalDate.of(2023,1,15);
    LocalDate deadline5 = LocalDate.of(2022,1,15);
    LocalDate startDateOftask = LocalDate.of(2022,1,1);

    List<Task> tasks = new ArrayList<>();
    tasks.add(new Task("semestr",currentDate,deadline1));
    tasks.add(new Task("studia pełne",currentDate,deadline2));
    tasks.add(new Task("zwrot zakupów przez internet",currentDate,deadline3));
    tasks.add(new Task("czas na odpowiedź reklamacji produktu",currentDate,deadline4));
    tasks.add(new Task("wyprzedaz garazowa",startDateOftask,deadline5));
    return tasks;
}

}
