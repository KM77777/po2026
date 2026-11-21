package agh.po.lab4.animals;

public abstract class Animal {
    int liczbaNog;
    String imieZwierzecia;

    public abstract String getDescription();

    public int getLegs() {
        return liczbaNog;
    }
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}
