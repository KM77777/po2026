package agh.po.lab4.animals;

class Parrot extends Animal {
    public Parrot (String name) {
        this.name = name;
        this.nogiLiczba = 2;
    }
    @Override
    public String getDescription() {
        return "Papuga, imie "+ name+" Ilosc nog: " + nogiLiczba;
    }

}
