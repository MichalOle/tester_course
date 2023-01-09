package stream.homework;

import stream.UserRepository;

public class ForumStats {
    public static void main(String[] args) {
        double avgPostsPerUserAbove40YearsOld = UserRepository.getUserList()
                .stream()
                .filter(u -> u.getAge() >= 40)
                .map(u -> u.getNumberOfPost())
                .mapToInt(u -> u)
                .average()
                .getAsDouble();
        System.out.println(avgPostsPerUserAbove40YearsOld);


        double avgPostsPerUserUnder40YearsOld = UserRepository.getUserList()
                .stream()
                .filter(u -> u.getAge() < 40)
                .map(u -> u.getNumberOfPost())
                .mapToInt(u -> u)
                .average()
                .getAsDouble();
        System.out.println(avgPostsPerUserUnder40YearsOld);
    }

}

