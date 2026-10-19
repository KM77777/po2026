package agh.po.lab2;
import java.util.ArrayList;
import java.util.Random;

public class Lotto {
    public static void main(String[] args) {
        ArrayList<Integer> typy = new ArrayList<Integer>();
        ArrayList<Integer> liczby = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i < args.length; i++) {
            int typ = Integer.parseInt(args[i]);
            typy.add(typ);
        }
        while (liczby.size() < 6) {
            int liczba = random.nextInt(49) + 1;

            if (!liczby.contains(liczba)) {
                liczby.add(liczba);
            }
        }
        int trafienia = 0;

        for (int i = 0; i < liczby.size(); i++) {
            if (typy.contains(liczby.get(i))) {
                trafienia++;
            }
        }
        System.out.println("Twoje typy: " + typy);
        System.out.println("Wylosowane liczby: " + liczby);
        System.out.println("Liczba trafień: " + trafienia);
    }
}
