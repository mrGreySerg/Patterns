package ru.serg.patterns.duck;

public class MallardDuck extends Duck implements Flyable {

    @Override
    public void display() {

    }

    @Override
    public boolean fly() {
        return true;
    }
}
