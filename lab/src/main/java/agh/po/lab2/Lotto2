import java.util.ArrayList;
import java.util.Random;

public class Lotto2 {
    public static void main(String[] args) {
        ArrayList<Integer> typy = new ArrayList<Integer>();
        ArrayList<Integer> liczby = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i < args.length; i++) {
            int typ = Integer.parseInt(args[i]);
            typy.add(typ);
        }
        int trafienia = 0;
        long losowania = 0;
        long start = System.currentTimeMillis();
        while (trafienia < 6) {
            liczby.clear();
            while (liczby.size() < 6) {
                int liczba = random.nextInt(49) + 1;

                if (!liczby.contains(liczba)) {
                    liczby.add(liczba);
                }
            }
            losowania++;
            trafienia = 0;
            for (int i = 0; i < liczby.size(); i++) {
                if (typy.contains(liczby.get(i))) {
                    trafienia++;
                }
            }
        }
        long koniec = System.currentTimeMillis();
        long czas = koniec - start;
        System.out.println("Liczba losowań: " + losowania);
        System.out.println("Czas działania: " + czas + " ms");
    }
}
