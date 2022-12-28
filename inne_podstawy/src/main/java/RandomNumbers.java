import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {

    public static void main(String[] args) {
        int number;
        int sum = 0;
        System.out.println("Start losowania liczb.");

        Random value = new Random();

        int heights =0;
        int lowest = 30;
        for (int i = 0; sum <= 5000; i++){
            number = value.nextInt(30);
            sum = sum + number;
  //          System.out.println(number);
            i++;
            if ( number > heights ){
                heights = number;
            }
            else if (lowest > number){
                lowest = number;
            }
            if (sum > 5000){
                System.out.println("Suma wylosowanych liczb osiągneła limit.");
                System.out.println("Najmniejsza wylosowana liczba wynosi: "+ lowest);
                System.out.println("Największa wylosowana liczba wynosi: " + heights);
                int average = sum/i;
                System.out.println("Srednia liczb wynosi: " + average);

            }
        }



    }
}
