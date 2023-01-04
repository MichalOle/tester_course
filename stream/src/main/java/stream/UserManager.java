package stream;

import java.util.List;
import java.util.stream.Collectors;

public class UserManager {
    public static void main(String[] args) {
        List<String> usernames = UserRepository.getUserList()
                .stream()
                .filter(u -> u.getGroup().equals("Chemists"))
                .map(User::getUsername)
                .collect(Collectors.toList());

        System.out.println(usernames);
    }
}
