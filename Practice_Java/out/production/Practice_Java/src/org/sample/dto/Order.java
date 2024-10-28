package org.sample.dto;/*
 * @author -Suraj Tiwari
 */

import java.time.LocalDate;

public class Order {
    private int orderID;

    @Override
    public String toString() {
        return "Order{" +
                "orderID=" + orderID +
                ", productName='" + productName + '\'' +
                ", orderDate=" + orderDate +
                ", expectedDeliveryDate=" + expectedDeliveryDate +
                ", quantity=" + quantity +
                '}';
    }

    public Order(int orderID, String productName, LocalDate orderDate, LocalDate expectedDeliveryDate, int quantity) {
        this.orderID = orderID;
        this.productName = productName;
        this.orderDate = orderDate;
        this.expectedDeliveryDate = expectedDeliveryDate;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public LocalDate getExpectedDeliveryDate() {
        return expectedDeliveryDate;
    }

    public void setExpectedDeliveryDate(LocalDate expectedDeliveryDate) {
        this.expectedDeliveryDate = expectedDeliveryDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    private String productName;
    private LocalDate orderDate;
    private LocalDate expectedDeliveryDate;
    private  int quantity;


}
