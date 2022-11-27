public class FirstClass {
    public static void main(String[] args) {
        System.out.println("Hello from FirstClass!");

        MainExtended mainExtended = new MainExtended();
        mainExtended.Person("Michał","Ole",18,1.83,true);


        System.out.println(mainExtended);
    }
}
