import java.util.Locale;
import java.util.Scanner;

public class ListenerClass {

    public static String getValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwsza litere koloru:");
        String val = scanner.nextLine();
        return val;
    }

    public static void main(String[] args) {
        String color = getValue().toUpperCase();
        switch (color) {
            case "W":
                System.out.println(Colours.WHITE.toString().toLowerCase());

                break;
            case "B":
                System.out.println(Colours.BLACK);

                break;
            case "Y":
                System.out.println(Colours.YELLOW);

                break;
            default:
                System.out.println("Nie ma koloru w bazie");
        }
    }
}
