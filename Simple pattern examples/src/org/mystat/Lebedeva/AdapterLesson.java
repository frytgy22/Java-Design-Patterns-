package org.mystat.Lebedeva;
//превращает один интерыейс в другой
//Track in Cars
interface Cars {
    void wash();
}

interface Track {
    void clean();
}

public class AdapterLesson {
    public static void main(String[] args) {
        CarWash carWash = new CarWash();
        carWash.washCar(new Bmv());
        carWash.washCar(new TrackWrap(new MyTrack()));
    }
}

class CarWash {
    public void washCar(Cars cars) {
        cars.wash();
    }
}

class Bmv implements Cars {
    @Override
    public void wash() {
        System.out.println("WASH CAR.");
    }
}

class MyTrack implements Track {
    @Override
    public void clean() {
        System.out.println("TRACK IS CLEAN.");
    }
}

class TrackWrap implements Cars {
    Track track;

    public TrackWrap(Track track) {
        this.track = track;
    }

    @Override
    public void wash() {
        track.clean();
    }
}