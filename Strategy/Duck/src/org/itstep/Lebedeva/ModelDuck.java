package org.itstep.Lebedeva;

public class ModelDuck extends Duck {
    public ModelDuck() {
        setQuackBehavior(new Quack());
        setFlyBehavior(new FlyNoWay());
    }

    @Override
    public void display() {
        System.out.println("I’m a model duck");
    }
}
