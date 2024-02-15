package com.Project1;

public class Audi extends Car {
    private boolean isUpgraded = false;

    Audi (boolean isUpgraded, short speed, String model, float weight, String color, boolean isWork) {
        super(speed, model, weight, color, isWork);
        this.isUpgraded = isUpgraded;

    }

    void printAll(){
        String anyName = this.isUpgraded ? "yes!" : "not yet!";
        super.printAll();
        System.out.println(" Car is upgraded: " + anyName);     }

    @Override
    void func() {
        System.out.println("Add needed info");
    }

}
