package com.company.technic;

import com.company.main.Technic;

public class Ship extends Technic {


    public Ship(String name, String type, int weight) {
        super(name, type, weight);
    }

    public void shipInfo() {
        System.out.println("Русскоязычный термин «корабль» впервые употреблён в древних русских летописях наравне с иными, ушедшими в прошлое названиями плавающих средств (судов): «скедии», «лодьи», «ушкуи», «карбаты», «струги». Точного происхождения слова «корабль» не установлено. Родственные слову «корабль» слова: «корабос»" +
                " (греческое), «карабелла» (испанское), «каравелла» (итальянское).");
    }

    @Override
    public void swim() {

        System.out.println("Корабль плывет");

    }

}
