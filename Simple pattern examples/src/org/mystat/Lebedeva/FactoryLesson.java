//package org.mystat.Lebedeva;
//
////the factory creates many similar products
//interface Car {
//    void drive();
//}
//
//public class FactoryLesson {
//    public static void main(String[] args) {
//        Factory factory = new Factory();
//        Car toyota = factory.create("Toyota");
//        Car audi = factory.create("Audi");
//        toyota.drive();
//        audi.drive();
//    }
//}
//
//class Factory {
//    public Car create(String typeOfCar) {
//        switch (typeOfCar) {
//            case "Toyota":
//                return new Toyota();
//            case "Audi":
//                return new Audi();
//            default:
//                return null;
//        }
//    }
//}
//
//class Toyota implements Car {
//    @Override
//    public void drive() {
//        System.out.println("Toyota drive");
//    }
//}
//
//class Audi implements Car {
//    @Override
//    public void drive() {
//        System.out.println("Audi drive");
//    }
//}