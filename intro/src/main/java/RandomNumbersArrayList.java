import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class RandomNumbersArrayList {


    public static void main(String[] args) {

        ArrayList<Integer> losy = new ArrayList<>();

        Random value = new Random();
        System.out.println("Start losowania liczb.");
        int number;
        int sum = 0;
        for (int i = 0; sum <= 5000; i++) {
            losy.add(value.nextInt(30));
            number = losy.get(i);
            sum = sum + number;
            //System.out.println(number);
            if (sum > 5000) {
                System.out.println("Suma wylosowanych liczb osiągneła limit.");
                Integer max = Collections.max(losy);
                Integer min = Collections.min(losy);
                System.out.println("Najwiekszy element kolekcji wynosi "+ max);
                System.out.println("Najmniejszy element kolekcji wynosi "+ min);

            }

        }
//        for (Object x : losy){
//            System.out.println(x);
//        }
    }
}