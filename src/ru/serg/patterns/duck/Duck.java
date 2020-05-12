package ru.serg.patterns.duck;

import ru.serg.patterns.duck.fly.FlyBehavior;
import ru.serg.patterns.duck.quack.QuakeBehavior;

abstract class Duck {

     FlyBehavior flyBehavior;
     QuakeBehavior quakeBehavior;

    public void swim() {
        System.out.println("Can swim");
    };

    public void performQuake() {
        quakeBehavior.quake();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public abstract void display();
}
