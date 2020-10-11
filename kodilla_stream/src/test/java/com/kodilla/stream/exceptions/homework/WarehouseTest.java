package com.kodilla.stream.exceptions.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarehouseTest {
    @Test
    public void testDoesOrderExists() throws OrderDoesntExistException {
        //given
        Warehouse warehouse = prepareWarehouse();
        Order order = new Order("13");
        //when
        Order result = warehouse.getOrder(order.getNumber());
        //then
        assertEquals(order, result);
    }

    @Test(expected = OrderDoesntExistException.class)
    public void testDoesOrderExists_withException() throws OrderDoesntExistException {
        //given
        Warehouse warehouse = prepareWarehouse();
        Order order = new Order("5");
        //when
        warehouse.getOrder(order.getNumber());
    }

    private Warehouse prepareWarehouse() {
        Order o1 = new Order("1");
        Order o2 = new Order("6");
        Order o3 = new Order("13");
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(o1);
        warehouse.addOrder(o2);
        warehouse.addOrder(o3);
        return warehouse;
    }
}