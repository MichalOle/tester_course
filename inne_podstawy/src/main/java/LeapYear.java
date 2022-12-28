import java.util.Random;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
//        System.out.println("Podaj rok. Sprawdzimy czy to rok przestępny");
//        Scanner scanner = new Scanner(System.in);
//        int year = scanner.nextInt();
//
//        int score = year%4;
//
//        if(score == 0){
//
//            System.out.println("Podany rok  jest rokiem przestępnym");
//        }
//        else {
//            System.out.println("Rok  nie jest rokiem przestępnym");
//        }

        RandomTest randomTest = new RandomTest();
        System.out.println(randomTest.getCountOfRandomNumber(10));


    }
}
