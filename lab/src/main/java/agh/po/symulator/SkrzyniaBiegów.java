package agh.po.symulator;

public class SkrzyniaBiegów extends Komponent {
    private int aktualnyBieg;
    private int iloscBiegow;

    public SkrzyniaBiegów(int iloscBiegow) {
        this.iloscBiegow = iloscBiegow;
        this.aktualnyBieg = 0;
    }

    public void zwiększBieg() {
        if (aktualnyBieg < iloscBiegow) {
            aktualnyBieg++;
        }
    }

    public void zmniejszBieg() {
        if (aktualnyBieg > 0) {
            aktualnyBieg--;
        }
    }

    public void ustawBieg(int nowyBieg) {
        if (nowyBieg >= 0 && nowyBieg <= iloscBiegow) {
            aktualnyBieg = nowyBieg;
        }
    }

    public int getAktualnyBieg() {
        return aktualnyBieg;
    }
}
