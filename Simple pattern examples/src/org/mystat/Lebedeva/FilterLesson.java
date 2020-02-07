package org.mystat.Lebedeva;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.ArrayList;
import java.util.List;

public class FilterLesson {
    public static void main(String[] args) {
       List<CarF> cars=new ArrayList<>() ;
       CarF carF=new CarF(150,"red",4);
        CarF carF2=new CarF(200,"green",2);
        CarF carF4=new CarF(220,"green",3);
        CarF carF3=new CarF(150,"yellow",4);
        cars.add(carF);cars.add(carF2);cars.add(carF3);cars.add(carF4);
        System.out.println(cars);
//        cars=new SpeedFilter().filter(cars);
//        cars=new DoorsFilter().filter(cars);
        //AndFilter andFilter=new AndFilter(new SpeedFilter(),new DoorsFilter());
        OrFilter andFilter=new OrFilter(new SpeedFilter(),new DoorsFilter());
        cars=andFilter.filter(cars);
        System.out.println(cars);
    }
}
class CarF{
    int maxSpeed;
    String color;
    int doors;

    @Override
    public String toString() {
        return "CarF{" +
                "maxSpeed=" + maxSpeed +
                ", color='" + color + '\'' +
                ", doors=" + doors +
                '}';
    }

    public CarF(int maxSpeed, String color, int doors) {
        this.maxSpeed = maxSpeed;
        this.color = color;
        this.doors = doors;
    }
}
interface CarFilter{
    List<CarF> filter(List<CarF>carves);
}
class SpeedFilter implements CarFilter{
    @Override
    public List<CarF> filter(List<CarF> carves) {
        List<CarF>list=new ArrayList<>();
        for(CarF carF:carves){
            if (carF.maxSpeed>180){
                list.add(carF);
            }
        }return list;
    }
}class DoorsFilter implements CarFilter{
    @Override
    public List<CarF> filter(List<CarF> carves) {
        List<CarF>list=new ArrayList<>();
        for(CarF carF:carves){
            if (carF.doors>2){
                list.add(carF);
            }
        }return list;
    }
}
class AndFilter implements CarFilter{
    CarFilter carFilterOne;
    CarFilter carFilterTwo;

    public AndFilter(CarFilter carFilterOne, CarFilter carFilterTwo) {
        this.carFilterOne = carFilterOne;
        this.carFilterTwo = carFilterTwo;
    }

    @Override
    public List<CarF> filter(List<CarF> carves) {
        List<CarF>list=carFilterOne.filter(carves);
        return carFilterTwo.filter(list);
    }
}class OrFilter implements CarFilter{
    CarFilter carFilterOne;
    CarFilter carFilterTwo;

    public OrFilter(CarFilter carFilterOne, CarFilter carFilterTwo) {
        this.carFilterOne = carFilterOne;
        this.carFilterTwo = carFilterTwo;
    }

    @Override
    public List<CarF> filter(List<CarF> carves) {
        List<CarF>list=carFilterOne.filter(carves);
        List<CarF>list2= carFilterTwo.filter(carves);
        for(CarF car:list2){
            if (!list.contains(car)){
                list.add(car);
            }
        }return list;
    }
}