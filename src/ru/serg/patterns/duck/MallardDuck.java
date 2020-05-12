package ru.serg.patterns.duck;

import ru.serg.patterns.duck.fly.FlyBehavior;
import ru.serg.patterns.duck.fly.FlyWithWings;
import ru.serg.patterns.duck.quack.Quake;

public class MallardDuck extends Duck  {

    public MallardDuck() {
        quakeBehavior = new Quake();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {

    }
}
