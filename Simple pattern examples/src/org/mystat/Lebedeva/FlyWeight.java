package org.mystat.Lebedeva;

import java.util.HashMap;
import java.util.Map;

//чтоб не создавать много схожих объектов, создаеем только если такаго объекта нет
public class FlyWeight {
    public static void main(String[] args) {
        Garage garage = new Garage();
        Mercedes mercedes = garage.getMercedes("red");//хранит только 1 Mercedes, because same object
        Mercedes mercedes1 = garage.getMercedes("red");
        System.out.println(mercedes.color);
    }
}

class Mercedes {
    String color;
}

class Garage {
    Map<String, Mercedes> map = new HashMap<>();

    Mercedes getMercedes(String color) {
        Mercedes mercedes = map.get(color);
        if (mercedes == null) {
            mercedes = new Mercedes();
            mercedes.color = color;
            map.put(color, mercedes);
        }
        return mercedes;
    }
}