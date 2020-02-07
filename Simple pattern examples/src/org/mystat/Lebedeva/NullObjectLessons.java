package org.mystat.Lebedeva;

//for NullPointerException

interface Animal {
    void eat();
}

public class NullObjectLessons {
    public static void main(String[] args) {
        Animal animal=getAnimal();
        animal.eat();
    }

    static Animal getAnimal() {
        try {
            if (new java.io.File("fg.g").exists()) {
return new Lion();
            }
        } finally {
            return new NoAnimal();
        }
    }

}

class Lion implements Animal {

    @Override
    public void eat() {
        System.out.println("Lion eat");
    }
}

class NoAnimal implements Animal {
    @Override
    public void eat() {

    }
}