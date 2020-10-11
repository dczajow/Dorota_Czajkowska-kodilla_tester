package execution_model.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ShopTestSuite {

    Shop shop = new Shop();
    Order order1 = new Order(100, LocalDate.of(2019,01,20),"john123");
    Order order2 = new Order(201, LocalDate.of(2017,02,11),"vero_20");
    Order order3 = new Order(300, LocalDate.of(2018,01,03),"john123");
    Order order4 = new Order(199.99, LocalDate.of(2019,05,05),"michael9050");
    Order order5 = new Order(39.99, LocalDate.of(2020,06,18),"john123");
    Order order6 = new Order(112.50, LocalDate.of(2020,07,14),"michael9050");
    Order order7 = new Order(100, LocalDate.of(2019,01,20),"john123"); // duplicated order, won't be added

    @BeforeEach
    public void addSeveralOrdersToTheShop() throws IncorrectOrderException {
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
        shop.addOrder(order4);
        shop.addOrder(order5);
        shop.addOrder(order6);
        shop.addOrder(order7);
    }

    @Test
    public void shouldReturnZeroAsNumberOfAddedOrders(){
        shop.getOrders().clear();
        assertEquals(0, shop.getOrders().size());
    }


    @Test
    public void shouldReturnCorrectNumberOfAddedOrders(){
        int expected = 6;
        assertEquals(expected, shop.getOrders().size());
    }

    @Test
    public void shouldCheckIfAddedOrderIsEqualAsPassed() throws IncorrectOrderException {
        shop.getOrders().clear();
        Order order = new Order(6999.0, LocalDate.of(2020,07,14),"adam13");
        shop.addOrder(order);
        boolean hasOrder = shop.getOrders().contains(order);
        assertTrue(hasOrder);
    }

    @Test
    public void shouldNotAddDuplicatedOrder() throws IncorrectOrderException {
        int expectedOrderCount = shop.getOrdersCount();
        shop.addOrder(new Order(100, LocalDate.of(2019,01,20),"john123"));
        int actualOrderCount = shop.getOrdersCount();
        assertEquals(expectedOrderCount, actualOrderCount);
    }

    @Test
    public void shouldThrowAnExceptionOnAttemptOfAddingOrderWithNullOrEmptyValues(){
        Order order = new Order(0,null,"");
        Assertions.assertThrows(IncorrectOrderException.class, () -> {
            shop.addOrder(order);
        });
    }

    @Test
    public void shouldNotAllowToAddOrderWithNegativeValueAndThrowAnException(){
        Assertions.assertThrows(IncorrectOrderException.class, () -> {
            shop.addOrder(new Order(-200,LocalDate.of(2020,01,01), "adam123"));
        });
    }

    @Test
    public void shouldNotAllowToAddOrderWithIncorrectDateAndThrowAndException(){
        Assertions.assertThrows(IncorrectOrderException.class, () -> {
            shop.addOrder(new Order(1900, LocalDate.of(1940,01,20), "adam123"));
        });
        Assertions.assertThrows(IncorrectOrderException.class, () -> {
            shop.addOrder(new Order(1900, LocalDate.of(2021,01,20), "adam123"));
        });
    }

    @Test
    public void shouldThrowAnExceptionIfEndDateIsBeforeStartDate(){
        Assertions.assertThrows(IncorrectDateException.class, () -> {
            shop.getOrderFromBetweenTwoDates(LocalDate.of(2020,06,01), LocalDate.of(2019,01,01));
        });
    }

    @Test
    public void shouldReturnZeroListSizeIfNoOrdersBetweenTwoDatesAreFound() throws IncorrectDateException {
        int listSize = shop.getOrderFromBetweenTwoDates(LocalDate.of(2015,01,01), LocalDate.of(2016,01,01)).size();
        assertEquals(0, listSize);
    }

    @Test
    public void shouldReturnCorrectListSizeIfOrdersBetweenTwoDatesAreFound() throws IncorrectDateException {
        int listSize = shop.getOrderFromBetweenTwoDates(LocalDate.of(2019,01,01), LocalDate.of(2020,07,18)).size();
        assertEquals(4, listSize);
    }

    @Test
    public void shouldReturnTrueIfSearchingByDateRangeReturnsCorrectOrderObject() throws IncorrectDateException {
        List<Order> ordersFound  = shop.getOrderFromBetweenTwoDates(LocalDate.of(2017,02,11), LocalDate.of(2017,02,12));
        Order actualOrder = ordersFound.get(0);
        Order expectedOrder = new Order(201, LocalDate.of(2017,02,11),"vero_20");
        assertEquals(expectedOrder, actualOrder);
    }

    @Test
    public void shouldReturnZeroAsOrdersValueIfNoOrdesInTheList(){
        shop.getOrders().clear();
        assertEquals(0, shop.getOrdersTotalValue());
    }

    @Test
    public void shouldReturnCorrectOrdersValue(){
        assertEquals(953.48, shop.getOrdersTotalValue());
    }


}
