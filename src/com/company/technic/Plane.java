package com.company.technic;

import com.company.main.Technic;

public class Plane extends Technic {


    public Plane(String name, String type, int weight) {
        super(name, type, weight);
    }

    public void planeInfo() {
        System.out.println("Самолёт (устар. аэроплан) — класс воздушных судов тяжелее воздуха, предназначенных для полётов в атмосфере с помощью силового агрегата, создающего тягу и неподвижного относительно других" +
                " частей аппарата крыла, создающего подъёмную силу");
    }

    @Override
    public void fly() {

        System.out.println("Самолет летит");

    }


}
