package com.sample.dto;/*
 * @author -Suraj Tiwari
 */

import org.sample.dto.Order;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OrderManagementService {
    List<Order>orders=new ArrayList<>();
    public Order addOrder(Order order){
        orders.add(order);
        return order;
    }

    public List<Order> getOrders() {
        return orders;
    }
    public  void  displayOrder(){
        orders.stream().forEach(System.out::println);
    }

    public Order updateOrder(Order order){
        int existingOrderId=order.getOrderID();

        Order order1=orders.stream().filter(o->o.getOrderID()==existingOrderId).collect(Collectors.toList()).get(0);
        order1.setProductName(order.getProductName());

       // orders.set(orders.indexOf(order1),order1);




        return order;
    }

    public String deleteOrder(int orderId){


        Order order=orders.stream().filter(o->o.getOrderID()==orderId).collect(Collectors.toList()).get(0);
       // order1.setProductName(order.getProductName());
        orders.remove(order);

        // orders.set(orders.indexOf(order1),order1);


        return "Order deleted ";
    }

    public List<Order> dewDateOrdersList(int dewDays){
        LocalDate date=LocalDate.now().plusDays(dewDays);

        List<Order>   orderlist=orders.stream().filter(o->o.getExpectedDeliveryDate().isBefore(date)).collect(Collectors.toList());



        return orderlist;
    }
}
