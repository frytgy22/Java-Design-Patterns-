package org.mystat.Lebedeva;

interface Animall {
    void doJob(Visitor visitor);
}

interface Visitor {
    void doDog();

    void doCat();
}

//visitor dynamic change the code
public class VisitorLessons {
    public static void main(String[] args) {
        Animall animall = new Dog();
        animall.doJob(new ConcreteVisitor());
        Animall cat = new Cat();
        cat.doJob(new ConcreteVisitor());
    }
}

class ConcreteVisitor implements Visitor {
    @Override
    public void doDog() {
        System.out.println("gav");
    }

    @Override
    public void doCat() {
        System.out.println("may");
    }
}

class Dog implements Animall {
    @Override
    public void doJob(Visitor visitor) {
        visitor.doDog();
    }
}

class Cat implements Animall {
    @Override
    public void doJob(Visitor visitor) {
        visitor.doCat();
    }
}