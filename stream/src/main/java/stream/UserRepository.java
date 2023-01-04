package stream;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    public static List<User> getUserList() {
        List<User> listOfUsers = new ArrayList<>();
        listOfUsers.add(new User("Walter White",47,3,"Chemists"));
        listOfUsers.add(new User("Britney Spears",40,15,"Music"));
        listOfUsers.add(new User("Tuco Salaminka",30,3,"Manager"));
        listOfUsers.add(new User("Robert Lewandowski",35,1,"Sportsmans"));
        listOfUsers.add(new User("Magdalena Gessler",188,188,"Chemists"));
        return listOfUsers;
    }



}
