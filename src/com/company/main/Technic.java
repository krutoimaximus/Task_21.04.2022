package com.company.main;

import com.company.interfaces.Tech;

public class Technic implements Tech {

    protected String name;
    protected String type;
    protected int weight;

    public Technic(String name, String type, int weight) {
        this.name = name;
        this.type = type;
        this.weight = weight;
    }

    public void thisIt() {
        System.out.println("Название: " + name + " " + "Модель: " + type + " " + "Масса: " + weight);
    }

    @Override
    public void ride() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }
}
