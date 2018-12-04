package Zad1i2;

import java.util.*;

public class Zad2 {
    public static void main(String[] args) {

        // Stwórz LinkedHashMap liczb całkowitych na liczby całkowite – rok wygranej -> wartośd wygranej.
        Map<Integer,Integer> wygrane = new LinkedHashMap<>();
        wygrane.put(2017, 7770);
        wygrane.put(2012, 555555);
        wygrane.put(2018, 30000);
        wygrane.put(2009, 1000);
        wygrane.put(1996, 20000);

        // Wypisz zawartośd mapy w formacie:
        System.out.println("wygrane :");
        wygrane.forEach((key,value) -> System.out.println(key + "=[" + value + "]"));

        // Posortuj zbiór wpisów po dacie rosnąco i wypisz kolekcję.
        System.out.println("------------------------");
        final Set <Map.Entry<Integer,Integer>> wpisy = wygrane.entrySet();
        wpisy.stream().sorted(Map.Entry.comparingByKey())
                .forEach(wpis -> System.out.println(wpis.getKey() + "=[" + wpis.getValue() + "]"));

        // Posortuj zbiór wpisów po wysokości wygranej malejąco i wypisz kolekcję.
        System.out.println("------------------------");
        wpisy.stream() .sorted(Map.Entry.comparingByValue())
                .forEach(wpis -> System.out.println(wpis.getKey() + "=[" + wpis.getValue() + "]"));
        System.out.println("------------------------");
        wpisy.stream() .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                .forEach(wpis -> System.out.println(wpis.getKey() + "=[" + wpis.getValue() + "]"));
    }
}
