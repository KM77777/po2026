package agh.po.lab4.zadania;

import agh.po.lab4.animals.Animal;
import agh.po.lab4.animals.Dog;
import agh.po.lab4.animals.Parrot;
import agh.po.lab4.animals.Snake;

import java.util.Random;

public class Zoo {
    Animal[]animals = new Animal[100];
    public void fillAnimals(){
        Random rand = new Random();
        for(int i = 0;i< animals.length;i++){
            int wybor = rand.nextInt(3);
            int dlugoscImienia = rand.nextInt(9) +3;


            if(wybor==0){
                animals[i] = new Dog(imie);
            } else if (wybor == 1) {
                animals[i] = new Parrot(imie);

            } else if (wybor == 2) {
                animals[i] = new Snake(imie);

            }
        }
    }


}

public class main(){
    public static void main(String[] args) {}
}
