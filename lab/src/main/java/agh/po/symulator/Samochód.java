
package agh.po.symulator;

public class Samochód {
    private Silnik silnik;
    private SkrzyniaBiegów skrzynia;
    private Sprzęgło sprzęgło;
    private Pozycja pozycja;

    public Samochód(Silnik silnik, SkrzyniaBiegów skrzynia,
                    Sprzęgło sprzęgło, Pozycja pozycja) {
        this.silnik = silnik;
        this.skrzynia = skrzynia;
        this.sprzęgło = sprzęgło;
        this.pozycja = pozycja;
    }

    public void włącz() {
        silnik.uruchom();
    }

    public void wyłącz() {
        silnik.zatrzymaj();
        skrzynia.ustawBieg(0);
    }
}
