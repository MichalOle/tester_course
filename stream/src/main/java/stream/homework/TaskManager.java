package stream.homework;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {
    public static void main(String[] args) {
        List<LocalDate> deadlines = TaskRepository.getTasks()
                .stream()
                .filter(a -> a.getDeadline().isAfter(LocalDate.now()))
                .map(a -> a.getDeadline())
                .collect(Collectors.toList());
        System.out.println(deadlines);
    }
}
