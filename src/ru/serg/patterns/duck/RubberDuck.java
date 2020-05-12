package ru.serg.patterns.duck;

public class RubberDuck extends Duck implements Flyable {

    @Override
    public void display() {
        System.out.println("This is RubberDuck");
    }

    public boolean fly() {
        return false;
    }

}
