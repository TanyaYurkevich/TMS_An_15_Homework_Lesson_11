package com.teachmeskills.Lesson11_HW.Task4;
import com.teachmeskills.Lesson11_HW.Task4.model.Order;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Runner {
    public static void main(String[] args) {
        ArrayList<Order> orders = new ArrayList<>();
        orders.add(new Order(1,35.4));
        orders.add(new Order(2,35.5));
        orders.add(new Order(3,38.5));
        orders.add(new Order(4,85.9));
        orders.add(new Order(5,115.4));

        System.out.println(orders);
        Comparator<Order>orderComparator = new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                return Double.compare(o1.getOrderPrise(),o2.getOrderPrise());
            }
        };
        Collections.sort(orders,orderComparator);
        System.out.println(orders);
    }
}
