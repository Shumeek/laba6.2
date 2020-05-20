package com.company;

abstract class Machine implements Run {
    String name;
    double weight;
    double maxSpeed;
    int numberOfPassengers;

    public Machine(String name, double weight, double maxSpeed, int numberOfPassengers) {
        this.name = name;
        this.weight = weight;
        this.maxSpeed = maxSpeed;
        this.numberOfPassengers = numberOfPassengers;
    }
    @Override
    public void printName(){
        System.out.println("NAME>>>" + this.name);
    }
    @Override
    public double getMaxSpeed(){
        return this.maxSpeed;
    }
    @Override
    public double getWeight(){
        return this.weight;
    }

    @Override
    public void move() {
        System.out.println("Транспорт под названием " + this.name + " выехал");
    }
}
