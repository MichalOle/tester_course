package stream.Optional;

import stream.User;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        User user = new User("user1", 30, 100, "Test");
        User user2 = null;
        Optional<User> OptionalUser = Optional.ofNullable(user);
        Optional<User> OptionalUser2 = Optional.ofNullable(user2);

//        String username =
//        OptionalUser2.orElse(new User("", 0, 0, "")).getUsername();
//        System.out.println(username);

        OptionalUser2.ifPresent(u -> System.out.println(u.getUsername()));
    }

}
