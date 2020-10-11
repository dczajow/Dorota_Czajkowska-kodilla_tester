package execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Shop {

    private Set<Order> orders = new HashSet<>();

    public static void main(String[] args) throws IncorrectOrderException, IncorrectDateException {
        Shop shop = new Shop();
        Order order1 = new Order(100, LocalDate.of(2019,01,20),"john123");
        Order order2 = new Order(201, LocalDate.of(2017,02,11),"adam123");
        Order order3 = new Order(300, LocalDate.of(2018,01,03),"john123");
        Order order4 = new Order(100, LocalDate.of(2019,01,20),"john123"); // duplicated order, won't be added

        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
        shop.addOrder(order4);

        LocalDate startDate = LocalDate.of(2018,01,01);
        LocalDate endDate = LocalDate.of(2020, 06,01);
        List<Order> ordersFound = shop.getOrderFromBetweenTwoDates(startDate, endDate);
        System.out.println("Oders between two dates : " + ordersFound);

        System.out.println("Ordes count: " + shop.getOrdersCount());
        System.out.println("Total shop orders value: " + shop.getOrdersTotalValue());

        List<Order> ordersWithinSpecifiedvalues = shop.getOdersBetweenAmounts(100,202);
        System.out.println("Orders with values between 100 and 2002 : " + ordersWithinSpecifiedvalues);
    }

    public Set<Order> getOrders() {
        return orders;
    }

    public void addOrder(Order order) throws IncorrectOrderException {
        if(order.getValue() >= 0 && order.getCustomerLogin() != null && order.getCustomerLogin() != "" && order.getDate() != null){
            if(order.getDate().getYear() > 1950 && order.getDate().getYear() <= LocalDate.now().getYear() ){
                this.orders.add(order);
            } else {
                throw new IncorrectOrderException("Incorrect order date");
            }
        } else {
            throw new IncorrectOrderException("Incorrect order details");
        }

    }

    public List<Order> getOdersBetweenAmounts(double min, double max){
        if(orders.size() == 0)
            return null;
        List<Order> filteredOrders = new ArrayList<>();
        for(Order order: orders){
            if(order.getValue() >= min && order.getValue() <= max)
                filteredOrders.add(order);
        }
        return filteredOrders;
    }

    public List<Order> getOrderFromBetweenTwoDates(LocalDate startDate, LocalDate endDate) throws IncorrectDateException {
        if(endDate.isBefore(startDate)){
            throw new IncorrectDateException("End date must be after start date");
        }
        if(orders.size() > 0){
            List<Order> filteredOrders = new ArrayList<>();
            for(Order order: orders){
                if(startDate.compareTo(order.getDate()) * order.getDate().compareTo(endDate) >= 0 ){
                    filteredOrders.add(order);
                }
            }
            return filteredOrders;
        }
        return null;
    }

    public int getOrdersCount(){
        return orders.size();
    }

    public double getOrdersTotalValue(){
        if(orders.size() == 0)
            return 0;
        double sum = 0;
        for(Order order: this.orders){
            sum += order.getValue();
        }
        return sum;
    }
}
