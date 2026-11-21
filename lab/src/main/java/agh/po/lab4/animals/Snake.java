package agh.po.lab4.animals;

public class Snake extends Animal {
    public Snake(String imieZwierzecia){
        this.imieZwierzecia = imieZwierzecia;
        this.liczbaNog = 0;
    }

    public String getDescription() {
        return "Wąż, Imie " + imieZwierzecia + " Ilosc nog: " + liczbaNog;
    }

    public void makeSound(){
        System.out.println("SSSSSSSS");
    }
}
