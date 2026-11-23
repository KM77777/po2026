
package agh.po.symulator;

public class Main {
    public static void main(String[] args) {

        Pozycja pozycja = new Pozycja();
        pozycja.aktualizujPozycję(10, 5);
        System.out.println(pozycja.getPozycja());

        Silnik silnik = new Silnik(6000);
        SkrzyniaBiegów skrzynia = new SkrzyniaBiegów(5);
        Sprzęgło sprzęgło = new Sprzęgło();

        Samochód samochód = new Samochód(silnik, skrzynia, sprzęgło, pozycja);

        samochód.włącz();

        sprzęgło.wciśnij();
        skrzynia.zwiększBieg();
        skrzynia.zwiększBieg();
        skrzynia.zmniejszBieg();
        sprzęgło.zwolnij();

        System.out.println("Obroty silnika: " + silnik.getObroty());
        System.out.println("Aktualny bieg: " + skrzynia.getAktualnyBieg());
        System.out.println("Stan sprzęgła: " + sprzęgło.getStanSprzęgła());

        samochód.wyłącz();

        System.out.println("Po wyłączeniu - obroty: " + silnik.getObroty());
        System.out.println("Po wyłączeniu - bieg: " + skrzynia.getAktualnyBieg());
    }
}
