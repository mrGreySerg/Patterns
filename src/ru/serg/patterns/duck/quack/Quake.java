package ru.serg.patterns.duck.quack;

public class Quake implements QuakeBehavior{
    @Override
    public void quake() {
        System.out.println("I can quake");
    }
}
