package main;

import amphibian.Amphibian;
import amphibian.Frog;

public class Main {
    public static void main(String[] args) {
        Frog frog = new Frog();
        frog.makeSound();
        frog.jump();
        System.out.println("Upcasting:");
        Amphibian amphibian = frog;
        amphibian.makeSound();
        amphibian.makeAction();
        System.out.println("Downcasting:");
        Frog frog1 = (Frog) new Amphibian();
        frog1.makeSound();
        Amphibian.makeAction();
        frog1.jump();
    }
}