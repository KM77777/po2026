package agh.po.symulator;

public class Samochód {
    private Silnik silnik;
    private SkrzyniaBiegów skrzynia;

    public Samochód(Silnik silnik, SkrzyniaBiegów skrzynia) {
        this.silnik = silnik;
        this.skrzynia = skrzynia;
    }

    public void włącz() {
        silnik.uruchom();
    }

    public void wyłącz() {
        silnik.zatrzymaj();
        skrzynia.ustawBieg(0);
    }
}
