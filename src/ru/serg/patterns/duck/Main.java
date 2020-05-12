package ru.serg.patterns.duck;

public class Main {

    public static void main(String[] args) {
        Duck firstDuck = new RubberDuck();
        Duck secondDuck = new RedHeadDuck();
        firstDuck.performFly();
        secondDuck.performFly();
    }
}
