package ru.serg.patterns.duck;

 abstract class Duck {

    public void quack() {
        System.out.println("Can quack");
    };

    public void swim() {
        System.out.println("Can swim");
    };

    public abstract void display();
}
