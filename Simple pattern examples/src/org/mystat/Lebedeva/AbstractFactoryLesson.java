package org.mystat.Lebedeva;


interface Car {
    void drive();
}

interface Tank {
    void drive();
}

interface Factory {
    Car createCar(String typeOfCar);

    Tank createTank(String typeOfTank);
}

class AbstractFactory {
    Factory createFactory(String typeOfFactory) {
        switch (typeOfFactory) {
            case "Car":
                return new CarFactory();
            case "Tank":
                return new TankFactory();
            default:
                return null;
        }
    }
}

//a factory that creates other factories
public class AbstractFactoryLesson {
    public static void main(String[] args) {
        Factory factory = new AbstractFactory().createFactory("Car");
        Factory factoryT = new AbstractFactory().createFactory("Tank");
        Car toyota = factory.createCar("Toyota");
        Tank tank = factoryT.createTank("Tank51");
        toyota.drive();
        tank.drive();
    }
}

class CarFactory implements Factory {
    public Car createCar(String typeOfCar) {
        switch (typeOfCar) {
            case "Toyota":
                return new Toyota();
            case "Audi":
                return new Audi();
            default:
                return null;
        }
    }

    @Override
    public Tank createTank(String typeOfTank) {
        return null;
    }
}

class Toyota implements Car {
    @Override
    public void drive() {
        System.out.println("Toyota drive");
    }
}

class Audi implements Car {
    @Override
    public void drive() {
        System.out.println("Audi drive");
    }
}

class TankFactory implements Factory {
    @Override
    public Car createCar(String typeOfCar) {
        return null;
    }

    public Tank createTank(String typeOfCar) {
        switch (typeOfCar) {
            case "Tank51":
                return new Tank51();
            case "Tank52":
                return new Tank52();
            default:
                return null;
        }
    }
}

class Tank51 implements Tank {
    @Override
    public void drive() {
        System.out.println("Tank51 drive");
    }
}

class Tank52 implements Tank {
    @Override
    public void drive() {
        System.out.println("Tank52 drive");
    }
}