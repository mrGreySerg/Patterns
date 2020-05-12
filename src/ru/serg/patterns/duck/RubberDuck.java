package ru.serg.patterns.duck;

import ru.serg.patterns.duck.fly.FlyNoWay;
import ru.serg.patterns.duck.quack.MuteQuake;

public class RubberDuck extends Duck {

    public RubberDuck() {
        quakeBehavior = new MuteQuake();
        flyBehavior = new FlyNoWay();
    }
    @Override
    public void display() {
        System.out.println("This is RubberDuck");
    }

}
