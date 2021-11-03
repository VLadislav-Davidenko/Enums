package com.company.generic;

public class GasStation implements Refuelable{
    private String name;

    public GasStation(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void refuel(int liters) {
        System.out.println("Заправляем " + liters + " л " + " в машину " + name);

    }


}
