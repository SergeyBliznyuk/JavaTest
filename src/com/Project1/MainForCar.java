package com.Project1;

public class MainForCar {

    public static void main (String [] args) {

//        Car bmw = new Car();
//        bmw.setAll((short) 250, "M3", 1296.2f, "wight", true);
//        bmw.printAll();
//
//        Car mers = new Car((short) 310, "C200", 1296.2f, "green", false);
//        mers.setAll((short) 310, "C200", 1296.2f, "green", false);
//
//        Car audi = new Car((short) 400, "Q5", 1165.23f, "purpler", true);

        Audi q5 = new Audi(true,(short) 260, "Q5", 1365.45f, "blue", false);
        q5.printAll();

    }
}
