package com.company.generic;

public class Refueler <T extends Refuelable>{
    private String name;
    private T refuelObject;
    private Car car;

    public Refueler(String name, T refuelObject) {
        this.name = name;
        this.refuelObject = refuelObject;
    }

    public String getName() {
        return name;
    }

    public T getRefuelObject() {
        return refuelObject;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void refuelCar(int liters){
        if(car == null){
            System.out.println("Машина еще не подъехала...");
            return;
        }
        System.out.println("Заправщик" + name + " запраляет машину, " + car.getModel());
        refuelObject.refuel(liters);
    }
}
