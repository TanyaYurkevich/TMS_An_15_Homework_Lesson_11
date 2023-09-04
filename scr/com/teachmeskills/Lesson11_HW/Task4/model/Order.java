package com.teachmeskills.Lesson11_HW.Task4.model;

public class Order {
    private long orderId;
    private double orderPrise;

    public Order(long orderId, double orderPrise) {
        this.orderId = orderId;
        this.orderPrise = orderPrise;
    }

    public long getOrderId() {
        return orderId;
    }

    public double getOrderPrise() {
        return orderPrise;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderPrise=" + orderPrise +
                '}';
    }
}

