package Zad1i2;

import java.util.HashMap;
import java.util.Map;

public class Zad1 {
    public static void main(String[] args) {

        // Stworzenie nowej mapy HashMap
        Map <Integer,String> liczbyNaLiczebniki = new HashMap<>();

        // Wypełnienie mapy wartościami
        liczbyNaLiczebniki.put(8, "ósmy");
        liczbyNaLiczebniki.put(9, "dziewiąty");
        liczbyNaLiczebniki.put(10, "dziesiąty");
        liczbyNaLiczebniki.put(3, "trzeci");
        liczbyNaLiczebniki.put(4, "czwarty");
        liczbyNaLiczebniki.put(5, "piąty");
        liczbyNaLiczebniki.put(6, "szósty");
        liczbyNaLiczebniki.put(7, "siódmy");
        liczbyNaLiczebniki.put(11, "jedenasty");
        liczbyNaLiczebniki.put(12, "dwunasty");
        liczbyNaLiczebniki.put(1, "pierwszy");
        liczbyNaLiczebniki.put(2, "drugi");

        // Sprawdź czy zawiera klucz 1 - containsKey
        System.out.println(liczbyNaLiczebniki.containsKey(1));
        // Sprawdź czy zawiera wartość "drugi" - containsValue
        System.out.println(liczbyNaLiczebniki.containsValue("drugi"));
        // Wypisz wartośd dla klucza 3 - .get
        System.out.println(liczbyNaLiczebniki.get(3));
        // Wypisz wartośd dla klucza 1, usuń asocjację dla klucza 1, ponownie wypisz wartośd
        System.out.println(liczbyNaLiczebniki.get(1));
        liczbyNaLiczebniki.remove(1);
        liczbyNaLiczebniki.put(1,"nowa wartość");
        System.out.println(liczbyNaLiczebniki.get(1));
        // Pobierz i wypisz zbiór kluczy - keySet
        System.out.println(liczbyNaLiczebniki.keySet());
        // Pobierz i wypisz zbiór wartości - values
        System.out.println(liczbyNaLiczebniki.values());
        // Pobierz zbiór wpisów i wypisz w formacie np. 1=[pierwszy] 2=[drugi] 3=[trzeci]
        System.out.println(liczbyNaLiczebniki.entrySet());
        liczbyNaLiczebniki.forEach((klucz,wartosc) -> System.out.println(klucz + "=[" + wartosc + "]"));
    }
}
