package agh.po.symulator;

public class Pozycja {
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void aktualizujPozycję(double deltaX, double deltaY) {
        x = deltaX+y;
        y = deltaY+y;
    }

    public String getPozycja() {
        return "X: " + x + ", Y: " + y;
    }
}
