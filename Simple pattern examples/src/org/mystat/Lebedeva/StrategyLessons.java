package org.mystat.Lebedeva;

interface Strategy {
    double getPrice(double price);
}

//задать разную цену
public class StrategyLessons {
    public static void main(String[] args) {
        ContextStrategy contextStrategy = new ContextStrategy(new HalfPrice());
double price=contextStrategy.getPrice(100);
        System.out.println(price);
    }
}

class FullPrice implements Strategy {

    @Override
    public double getPrice(double price) {
        return price;
    }
}

class HalfPrice implements Strategy {

    @Override
    public double getPrice(double price) {
        return price * 0.5;
    }
}

class ContextStrategy {
    Strategy strategy;

    public ContextStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public double getPrice(double price) {
        return strategy.getPrice(price);
    }
}