public class MainExtended {

    String name;
    String surname;
    int age;
    double heights;
    boolean isItProgrammer;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeights() {
        return heights;
    }

    public void setHeights(double heights) {
        this.heights = heights;
    }

    public boolean isItProgrammer() {
        return isItProgrammer;
    }

    public void setItProgrammer(boolean itProgrammer) {
        isItProgrammer = itProgrammer;
    }

    public void Person(String name, String surname, int age, double heights, boolean isItProgrammer) {
this.name =name;
this.surname =surname;
this.age =age;
this.heights =heights;
this.isItProgrammer =isItProgrammer;
    }

    @Override
    public String toString() {
        return "MainExtended{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", heights=" + heights +
                ", isItProgrammer=" + isItProgrammer +
                '}';
    }
}
