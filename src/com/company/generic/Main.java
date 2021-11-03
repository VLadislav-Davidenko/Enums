package com.company.generic;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car("Tesla");
        Car car2 = new Car("Hundai");

        GasStation okko = new GasStation("Okko");
        GasStation shell = new GasStation("Shell");

        Canister canister = new Canister(40);

        Refueler<GasStation> ref1 = new Refueler<>(" Oleg", okko);
        ref1.setCar(car1);
        ref1.refuelCar(40);
        System.out.println("=".repeat(20));

        Refueler<GasStation> ref2 = new Refueler<>(" Nikita", shell);
        ref2.setCar(car2);
        ref2.refuelCar(30);
        System.out.println("=".repeat(20));

        Refueler<Canister> ref3 = new Refueler<>(" Nikita", canister);
        ref3.setCar(car2);
        ref3.refuelCar(10);
        System.out.println("=".repeat(20));
    }
}
