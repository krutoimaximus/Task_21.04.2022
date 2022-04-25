package com.company.main;

import com.company.technic.Gunship;
import com.company.technic.Ship;

public class MainApp {


    public static void main(String[] args) {

       Gunship gunship = new Gunship("Кузнецов", "Авианосец", 5000);
       Ship ship = new Ship("Академик Сахаров", "Научное", 6000);
       gunship.swim();
       gunship.thisIt();

       ship.swim();
       ship.thisIt();
       ship.shipInfo();

    }

}
