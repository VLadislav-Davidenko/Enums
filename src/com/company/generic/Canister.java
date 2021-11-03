package com.company.generic;

public class Canister implements Refuelable{

    private int volume;

    public Canister(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public void refuel(int liters) {
        System.out.println("Заправляем " + liters + " л " + " в машину с канистры");

    }
}
