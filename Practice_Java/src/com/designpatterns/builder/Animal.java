package com.designpatterns.builder;/*
 * @author -Suraj Tiwari
 */

public class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public int getLegs() {
        return legs;
    }

    public boolean isPet() {
        return pet;
    }

    private int legs;

    private boolean pet;

    public String getFood() {
        return food;
    }

    private String food;

    private Animal(AnimalBuilder animalBuilder){
        this.legs=animalBuilder.legs;
        this.name=animalBuilder.name;
        this.pet=animalBuilder.pet;
        this.food=animalBuilder.food;

    }
    public static class AnimalBuilder{
        private String name;
        private int legs;
        private boolean pet;
        private  String food;
        //Creating constructor for req parameter
        public AnimalBuilder(String name,int legs){
            this.legs=legs;
            this.name=name;
        }
        public AnimalBuilder setPet(boolean pet){
            this.pet=pet;
            return this;
        }

        public AnimalBuilder setFood(String food){
            this.food=food;
            return this;
        }

        public Animal build(){
            return new Animal(this);
        }
    }
}
