package com.company;

public class MainApp {

    public static void main(String[] args) {
	Land[] lands = {
            new Hammer(),
            new Car()
    };
    for (Land f : lands) {
        f.ride();
        }

        Flying[] flyings = {
                new Plane(),
                new Fighter()
        };
        for (Flying f : flyings) {
            f.fly();
        }

        Floating[] floatings = {
                new Ship(),
                new Gunship()
        };
        for (Floating f : floatings) {
            f.swim();
        }
    }
}
