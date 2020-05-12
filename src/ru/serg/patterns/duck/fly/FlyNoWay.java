package ru.serg.patterns.duck.fly;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Can not fly");
    }
}
