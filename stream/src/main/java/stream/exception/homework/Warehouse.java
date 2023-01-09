package stream.exception.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Warehouse {

    private  List<Order> listOfOrders = new ArrayList<>();


    public  List<Order> getListOfOrders() {
        return listOfOrders;
    }

    public  void addOrder(Order order) {
        listOfOrders.add(order);
    }

    public  Order getOrder(String number) throws OrderDoesntExistExeption {
        Order order = listOfOrders
                .stream()
                .filter(a -> a.getNumber().equals(number))
                .findFirst()
                .orElseThrow(OrderDoesntExistExeption::new);
        return order;
    }
}
