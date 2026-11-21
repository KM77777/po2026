package agh.po.lab4.animals;

public class Dog extends Animal {
    public Dog(String imieZwierzecia){
        this.imieZwierzecia = imieZwierzecia;
        this.liczbaNog =4;
    }

    public String getDescription() {
        return "Pies, Imie " + imieZwierzecia + " Ilosc nog: " + liczbaNog;
    }

    public void makeSound(){
        System.out.println("hau hau");
    }
}
