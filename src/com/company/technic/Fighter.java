package com.company.technic;

import com.company.main.Technic;

public class Fighter extends Technic {


    public Fighter(String name, String type, int weight) {
        super(name, type, weight);
    }

    public void fighterInfo() {
        System.out.println("Истреби́тель — военный самолёт, предназначенный " +
                "в первую очередь для уничтожения воздушных целей противника.");
    }

    @Override
    public void fly() {

        System.out.println("Истребитель летит");

    }

}
