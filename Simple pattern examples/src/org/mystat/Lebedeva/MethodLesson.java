package org.mystat.Lebedeva;

//the class with method, that return this class
public class MethodLesson {
    public static void main(String[] args) {
        Person person = Person.create();
        person.sing();
    }
}

class Person {
    private Person() {
    }

    public static Person create() {
        return new Person();
    }

    public static void sing() {
        System.out.println("la-la");
    }
}