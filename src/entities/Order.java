package entities;

import entities.enums.OrderStatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private Date moment;
    private OrderStatus status;

    List<OrderItem> orders = new ArrayList<>();
    List<Client> clients = new ArrayList<>();

    public Order() {
    }

    public Order(Date moment, OrderStatus status){
        this.moment = moment;
        this.status = status;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public List<OrderItem> getOrders() {
        return orders;
    }

    public void addItem(OrderItem item){
         orders.add(item);
    }

    public void removeItem(OrderItem item){
        orders.remove(item);
    }

    public double total(){
        double sum = 0;
        for (OrderItem o: orders) {
            sum += o.subTotal();
        }
        return sum;
    }
}
