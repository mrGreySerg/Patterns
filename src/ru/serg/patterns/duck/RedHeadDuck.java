package ru.serg.patterns.duck;

import ru.serg.patterns.duck.fly.FlyWithWings;
import ru.serg.patterns.duck.quack.Quake;

public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        quakeBehavior = new Quake();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {

    }

}
