package com.kodilla.stream.exceptions.homework;

public class WarehouseApp {
    public static void main(String[] args){
        Order o1 = new Order("1");
        Order o2 = new Order("6");
        Order o3 = new Order("13");
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(o1);
        warehouse.addOrder(o2);
        warehouse.addOrder(o3);

        processOrder("5", warehouse);
        processOrder("13", warehouse);
    }

    private static void processOrder(String orderNumber, Warehouse warehouse) {
        try {
            Order order = warehouse.getOrder(orderNumber);
            System.out.println("Znaleziono zamówienie " + orderNumber);
        } catch (OrderDoesntExistException e) {
            System.out.println("Zamówienie z numerem " + orderNumber + " nie istnieje");
        }
    }
}