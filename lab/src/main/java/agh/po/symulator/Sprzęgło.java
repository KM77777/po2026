package agh.po.symulator;

public class Sprzęgło extends Komponent {
    private boolean stanSprzęgła;

    public void wciśnij() {
        stanSprzęgła = true;
    }

    public void zwolnij() {
        stanSprzęgła = false;
    }
}