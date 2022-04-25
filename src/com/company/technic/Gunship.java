package com.company.technic;

import com.company.main.Technic;

public class Gunship extends Technic {


    public Gunship(String name, String type, int weight) {
        super(name, type, weight);
    }

    public void gunshipInfo() {
        System.out.println("Корабль[1], или военный корабль[2][3] — судно, входящее в состав военно морского флота," +
                " имеющее возможность выполнения боевых либо специальных задач[1]. Корабль обладает вооружением и другой военной техникой, имеет экипаж, находящийся на военной службе и несёт военно-морской флаг, определяющий его государственную принадлежность[4].");
    }

    @Override
    public void swim() {

        System.out.println("Боевой корабль плывет");

    }

}
