package com.company.technic;

import com.company.main.Technic;

public class Car extends Technic {


    public Car(String name, String type, int weight) {
        super(name, type, weight);
    }

    public void carInfo() {
        System.out.println("Автомоби́ль (от др.-греч. αὐτός — сам и лат. mobilis — подвижной, скорый)" +
                " — моторное дорожное и внедорожное транспортное средство, используемое для перевозки людей и грузов.");
    }

    @Override
    public void ride() {

        System.out.println("Машина едет");

    }

}
