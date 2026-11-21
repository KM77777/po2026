package agh.po.lab4.animals;

public class Parrot extends Animal {
    public Parrot(String imieZwierzecia){
        this.imieZwierzecia = imieZwierzecia;
        this.liczbaNog = 2;
    }


    public String getDescription() {
        return "Papuga, Imie " + imieZwierzecia + " Ilosc nog: " + liczbaNog;
    }
    public void makeSound(){
        System.out.println("Its not easy being green");
    }
}
