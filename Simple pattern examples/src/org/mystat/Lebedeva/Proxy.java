package org.mystat.Lebedeva;
//скрыть свой IP
public class Proxy {
    public static void main(String[] args) {
CarI carI=new CarProxy();
carI.drive();
    }
}
interface CarI{
    void drive();
}
class Reno implements CarI{
    @Override
    public void drive() {
        System.out.println("drive reno");
    }
}
class CarProxy implements CarI{
    CarI carI=new Reno();

    @Override
    public void drive() {
        System.out.println("This is proxy code");
        carI.drive();
    }
}