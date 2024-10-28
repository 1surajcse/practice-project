package com.practice.check;/*
 * @author -Suraj Tiwari
 */


public class Cake {
    //req parameter
    private String name;
    private double price;

    @Override
    public String toString() {
        return "Cake{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", topping='" + topping + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    public String getTopping() {
        return topping;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    //optional Param
    private String topping;
    private int quantity;

    private Cake(CakeBuilder cakeBuilder){
        this.name=cakeBuilder.name;
        this.price=cakeBuilder.price;
        this.quantity=cakeBuilder.quantity;
        this.topping=cakeBuilder.topping;
    }

    static class CakeBuilder{

        private String name;
        private double price;
        //optional Param
        private String topping;
        private int quantity;
        public CakeBuilder setTopping(String topping) {
            this.topping = topping;
            return this;
        }

        public CakeBuilder setQuantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        //required parameter constructor
        public CakeBuilder(String name,double price){
            this.name=name;
            this.price=price;
        }
        public Cake build(){
            return new Cake(this);
        }


    }

    public static void main(String[] args) {

        Cake cake1=new CakeBuilder("ButterScotch",550).setTopping("cheery").setQuantity(3).build();
        System.out.println(cake1.name);
        System.out.println(cake1.quantity);
    }


}
