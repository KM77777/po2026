package agh.po.lab4.animals;

class Dog extends Animal {
    public Dog (String name) {
        this.name = name;
        this.nogiLiczba = 4;
    }
    @Override
    public String getDescription() {
        return "Pies, imie "+ name+" Ilosc nog: " + nogiLiczba;
    }
}
