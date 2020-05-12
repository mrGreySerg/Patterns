package ru.serg.patterns.duck.quack;

public class MuteQuake implements QuakeBehavior{

    @Override
    public void quake() {
        System.out.println("I can not quake");
    }
}
