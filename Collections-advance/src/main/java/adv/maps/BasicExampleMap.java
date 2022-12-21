package adv.maps;

import java.util.HashMap;
import java.util.Map;

public class BasicExampleMap {
    public static void main(String[] args) {
        Map<String, Double> grades = new HashMap<>();
        grades.put("Math", 5.0);
        grades.put("Physics", 4.0);
        grades.put("Chemistry", 3.5);
        System.out.println(grades.get("Math"));
        System.out.println(grades.size());
        //entrySet without loop displays pairs but in one line
        System.out.println(grades.entrySet());
        //entrySet displays pairs
        for (Map.Entry<String, Double> s : grades.entrySet()) {
            System.out.println(s);
        }
        System.out.println(" ");

        for (Map.Entry<String, Double> s : grades.entrySet()) {
            System.out.println("Grade of "+ s.getKey()+ " totals " + s.getValue());
        }

        System.out.println(" ");
        //statemaent displays only set of keys
        for (String s : grades.keySet()) {
            System.out.println(s);
        }
// work correctly or not? displayed good value but previusly I put wrong defaultValue
        System.out.println(grades.getOrDefault("Math", 4.0));
    }
}
