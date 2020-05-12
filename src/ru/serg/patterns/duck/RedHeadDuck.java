package ru.serg.patterns.duck;

public class RedHeadDuck extends Duck implements Flyable {

    @Override
    public void display() {

    }

    @Override
    public boolean fly() {
        return false;
    }
}
