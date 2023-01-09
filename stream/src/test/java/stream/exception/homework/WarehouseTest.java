package stream.exception.homework;

//import org.junit.jupiter.api.Test;

import org.junit.Test;

import static org.junit.Assert.*;



class WarehouseTest {

    @Test(expected = OrderDoesntExistExeption.class)
    public void assertThatGetOrderThrowsExceptions() throws OrderDoesntExistExeption {
        //given
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("1"));
        //when
        warehouse.getOrder("2");
        //then

    }
}