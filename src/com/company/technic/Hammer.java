package com.company.technic;

import com.company.main.Technic;

public class Hammer extends Technic {


    public Hammer(String name, String type, int weight) {
        super(name, type, weight);
    }

    public void hammerInfo() {
        System.out.println("HMMWV или Humvee ([hʌmˈviː], сокращение от англ. High Mobility Multipurpose Wheeled Vehicle — «высокоподвижное многоцелевое колёсное транспортное средство», читается «Хамви́») — американский армейский вседорожник, стоящий на вооружении в основном у ВС США, а также вооружённых сил, полицейских и иных служб некоторых других стран. Автомобиль обладает высокой проходимостью," +
                " пригоден к транспортировке по воздуху и десантированию парашютным способом.");
    }

    @Override
        public void ride() {

            System.out.println("Хаммер едет");

        }

}
