package agh.po.symulator;

public class Main {
    public static void main(String[] args) {
        Pozycja pozycja = new Pozycja();

        pozycja.aktualizujPozycję(10, 5);

        System.out.println(pozycja.getPozycja());
    }
}
