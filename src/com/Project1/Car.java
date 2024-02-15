package com.Project1;

abstract class Car {

    private short speed;
    private String model;
    private float weight;
    private String color;
    private boolean isWork;

    Car(short speed, String model, float weight, String color, boolean isWork) {
        this.model = model;
        this.speed = speed;
        this.weight =weight;
        this.color =color;
        this.isWork = isWork; }

    Car () {
        System.out.println("Object has been done");
    }

    void setAll (short speed, String model, float weight, String color, boolean isWork) {
        this.model = model;
        this.speed = speed;
        this.weight =weight;
        this.color =color;
        this.isWork = isWork;
    }

    void printAll(){
        String works = this.isWork ? "work." : "doesn't work.";
        System.out.println("Auto: " + this.model + ", Velocity: "+this.speed + ", has weight - "
                + this.weight+", colored by - " +this.color+" and it is " + works);
    }

    abstract void func();
}
