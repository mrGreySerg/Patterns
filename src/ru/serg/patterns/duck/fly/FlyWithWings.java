package ru.serg.patterns.duck.fly;

import ru.serg.patterns.duck.fly.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I can fly by Wings");
    }
}
