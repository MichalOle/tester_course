package collections.sets;

import java.util.HashSet;
import java.util.Set;

public class OrderApplication {
    public static void main(String[] args) {
        Set<Order> hashset = new HashSet<>();
        hashset.add(new Order("1/2022","Wycieraczki Bosch",3));
        hashset.add(new Order("2/2022","Kompresor Bosch",1));
        hashset.add(new Order("3/2022","Zapach do sam. Bosch",100));
        hashset.add(new Order("4/2022","Zapach do sam. Bosch",100));
        //if each element of new object is same like another elements of object included in the set - object is ignored
        hashset.add(new Order("1/2022","Wycieraczki Bosch",3));

        for (Order order : hashset) {
            System.out.println(order);
        }
        System.out.println(hashset.size());

    }
}
