package agh.po.lab4.zadania;

import agh.po.lab4.animals.Animal;
import agh.po.lab4.animals.Dog;
import agh.po.lab4.animals.Parrot;
import agh.po.lab4.animals.Snake;

import java.util.Random;

public class Zoo {

    Animal[] zwierzeta = new Animal[100];

    public void fillAnimals() {
        Random losowanie = new Random();
        String alfabetImion = "qwertyuiopasdfghjklzxcvbnm";

        for (int indeksZwierzecia = 0; indeksZwierzecia < zwierzeta.length; indeksZwierzecia++) {
            int numerGatunku = losowanie.nextInt(3);
            int dlugoscLosowegoImienia = losowanie.nextInt(8) + 1;
            String tworzoneImie = "";

            for (int numerZnaku = 0; numerZnaku < dlugoscLosowegoImienia; numerZnaku++) {
                int pozycjaWAlfabecie = losowanie.nextInt(alfabetImion.length());
                char znakImienia = alfabetImion.charAt(pozycjaWAlfabecie);
                tworzoneImie = tworzoneImie + znakImienia;
            }

            if (numerGatunku == 0) {
                zwierzeta[indeksZwierzecia] = new Dog(tworzoneImie);
            } else if (numerGatunku == 1) {
                zwierzeta[indeksZwierzecia] = new Parrot(tworzoneImie);
            } else {
                zwierzeta[indeksZwierzecia] = new Snake(tworzoneImie);
            }
        }
    }

    public int countLegs() {
        int lacznaLiczbaNog = 0;

        for (Animal zwierze : zwierzeta) {
            int liczbaNogZwierzecia = zwierze.getLegs();
            lacznaLiczbaNog = lacznaLiczbaNog + liczbaNogZwierzecia;
        }

        return lacznaLiczbaNog;
    }

    public void showAnimals() {
        for (int indeksZwierzecia = 0; indeksZwierzecia < zwierzeta.length; indeksZwierzecia++) {
            System.out.println((indeksZwierzecia + 1) + ". " + zwierzeta[indeksZwierzecia].getDescription());
            zwierzeta[indeksZwierzecia].makeSound();
        }
    }

    public static void main(String[] argumentyProgramu) {
        Zoo ogrodZoologiczny = new Zoo();
        ogrodZoologiczny.fillAnimals();
        ogrodZoologiczny.showAnimals();

        int lacznaLiczbaNog = ogrodZoologiczny.countLegs();
        System.out.println("Łączna liczba nóg: " + lacznaLiczbaNog);
    }
}
