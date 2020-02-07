package org.mystat.Lebedeva;
//хранит статус одних объектов в других
public class MomentoLessons {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.state = "one";
        CareTaker careTaker = new CareTaker();
        careTaker.momento = originator.createMomento();
        originator.state = "two";
        originator.getDataFromMomento(careTaker.momento);
        System.out.println(originator.state);
    }
}

class CareTaker {
    Momento momento;
}

class Originator {
    String state;

    Momento createMomento() {
        return new Momento(state);
    }

    void getDataFromMomento(Momento momento) {
        this.state = momento.getState();
    }
}

class Momento {
    String state;

    public Momento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}