package stream.exception.homework;

import java.util.ArrayList;
import java.util.List;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();

        warehouse.addOrder(new Order("123"));
        warehouse.addOrder(new Order("abc"));
        warehouse.addOrder(new Order("a2c"));

        try {
            System.out.println(warehouse.getOrder("abc").getNumber());
            System.out.println(warehouse.getOrder("1234").getNumber());
        }
        catch (OrderDoesntExistExeption e){
            System.out.println("Nie ma takiego zamówienia!");
        }
    }
}
