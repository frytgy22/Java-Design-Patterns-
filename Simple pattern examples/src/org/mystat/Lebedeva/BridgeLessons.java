package org.mystat.Lebedeva;

//чтоб избавится от 3-х уровневого наследования
interface IBridge {
    void drive();
}

public class BridgeLessons {
    public static void main(String[] args) {
        ICar iCar = new ToyotaCar(new CarBridge());
        iCar.drive();
        ITrack iTrack = new ToyotaTreck(new TrackBridge());
        iTrack.drive();
    }
}


abstract class ICar {
    IBridge iBridge;

    public ICar(IBridge iBridge) {
        this.iBridge = iBridge;
    }

    public abstract void drive();
}

abstract class ITrack {
    IBridge iBridge;

    public ITrack(IBridge iBridge) {
        this.iBridge = iBridge;
    }

    public abstract void drive();
}

class ToyotaCar extends ICar {
    public ToyotaCar(IBridge iBridge) {
        super(iBridge);
    }

    @Override
    public void drive() {
        System.out.println("drive car.");
    }
}

class AudiCar extends ICar {
    public AudiCar(IBridge iBridge) {
        super(iBridge);
    }

    @Override
    public void drive() {
        System.out.println("drive car.");
    }
}

class ToyotaTreck extends ITrack {
    public ToyotaTreck(IBridge iBridge) {
        super(iBridge);
    }

    @Override
    public void drive() {
        System.out.println("drive track.");
    }
}

class AudiTrack extends ITrack {
    public AudiTrack(IBridge iBridge) {
        super(iBridge);
    }

    @Override
    public void drive() {
        System.out.println("drive track.");
    }
}

class CarBridge implements IBridge {
    @Override
    public void drive() {
        System.out.println("CAR DRIVE.");
    }
}

class TrackBridge implements IBridge {
    @Override
    public void drive() {
        System.out.println("TRACK DRIVE.");
    }
}
