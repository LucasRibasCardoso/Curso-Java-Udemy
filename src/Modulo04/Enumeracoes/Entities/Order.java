package Modulo04.Enumeracoes.Entities;

import Modulo04.Enumeracoes.OrderEnums.OrderStatus;

import java.util.Date;

public class Order {

    private int id;
    private Date moment;
    private OrderStatus orderStatus;

    public Order(int id, Date moment, OrderStatus orderStatus) {
        this.id = id;
        this.moment = moment;
        this.orderStatus = orderStatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", moment=" + moment +
                ", orderStatus=" + orderStatus +
                '}';
    }
}
