package agh.po.lab4.animals;

class Snake extends Animal {
    public Snake (String name) {
        this.name = name;
        this.nogiLiczba = 4;
    }
    public String getDescription() {
        return "Wąż, imie "+ name+" Ilosc nog: " + nogiLiczba;
    }
}
