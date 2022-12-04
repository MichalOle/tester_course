public class User {

         String name;
         int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public static void main(String[] args) {
        User adam = new User("Adam", 19);
        User magda = new User("Magda", 28);
        User piotr = new User("Piotr", 16);
        User angela = new User("Angela", 33);

        User[] userTab = new User[]{adam, magda, piotr, angela};
        double average;
        int sum = 0;
        for (User user : userTab) {
            sum = sum + user.age;
        }
        average = (double)sum/ userTab.length;
        System.out.println("Srednia wieku: " + average);
        for (User user : userTab) {
            if (user.age >= average){
                System.out.println(user.name + " jest starszy/a niż średnia wieku tabeli.");
            }
        }


    }
}

