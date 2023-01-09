package stream;

import static java.util.Arrays.stream;

public class AverageAge {
    public static void main(String[] args) {
        double avg = UserRepository.getUserList()
                .stream()
                .map(u -> u.getAge())
                .mapToInt(u -> u)
                .average()
                .getAsDouble();
        System.out.println(avg);

    }
}
