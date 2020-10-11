package execution_model.homework;

import java.time.LocalDate;
import java.util.Objects;

public class Order {
    private double value;
    private LocalDate date;
    private String customerLogin;

    public Order(double value, LocalDate date, String customerLogin) {
        this.value = value;
        this.date = date;
        this.customerLogin = customerLogin;
    }

    public double getValue() {
        return value;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getCustomerLogin() {
        return customerLogin;
    }

    @Override
    public String toString() {
        return "Order{" +
                "value=" + value +
                ", date=" + date +
                ", customerLogin='" + customerLogin + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Double.compare(order.value, value) == 0 &&
                Objects.equals(date, order.date) &&
                Objects.equals(customerLogin, order.customerLogin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, date, customerLogin);
    }
}