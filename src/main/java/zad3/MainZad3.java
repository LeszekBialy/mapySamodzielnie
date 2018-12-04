package zad3;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import static zad3.Pracownicy.PRACOWNICY;

public class MainZad3 {
    public static void main(String[] args) {
        PRACOWNICY.stream().forEach(System.out::println);

        // Wypisz liczbę pracowników używając kolekcjonera Collectors.counting()
        System.out.println("-------------");
        final long liczbaPracownikow = PRACOWNICY.stream().collect(Collectors.counting());
        System.out.println("Liczba Pracowników: " + liczbaPracownikow);

        // Zredukuj pracowników do łącznej kwoty zarobków używając kolekcjonera Collectors.reducing()
        System.out.println("-------------");
        final Optional<Integer> zsumowaneZarobki = PRACOWNICY.stream()
                .map(Pracownik::getPensja)
                .collect(Collectors.reducing(Integer::sum));
        System.out.println("Zsumowane zarobki: " + zsumowaneZarobki);

        // Zgrupuj pracowników po departamencie używając kolekcjonera Collectors.groupingBy()
        System.out.println("-------------");
        final Map<Departament, List<Pracownik>> pracownicyWDepartamentach
                = PRACOWNICY.stream()
                .collect(Collectors.groupingBy(Pracownik::getDepartament));
        pracownicyWDepartamentach.forEach((departament, listaPracownikow) -> {
            System.out.println();
            System.out.println(departament);
            listaPracownikow.stream().forEach(System.out::println);
        });

        // Podziel pracowników po płci używając kolekcjonera Collectors.paritioningBy()
        System.out.println("-------------");
        final Map<Boolean, List<Pracownik>> czyKobiety = PRACOWNICY.stream()
                .collect(Collectors.partitioningBy(pracownik -> Plec.K.equals(pracownik.getPlec())));
        czyKobiety.forEach((czyKobieta, listaPracownikow) -> {
            System.out.println();
            System.out.println("Czy kobieta: " + czyKobieta);
            listaPracownikow.stream().forEach(System.out::println);
        });

        // Zmapuj pracowników na mapę imię -> pensja wykorzystując kolekcjoner mapujący Collectors.toMap()
        System.out.println("-------------");
        System.out.println("Imiona na zarobki: ");
        final Map<String,Integer> imieNaZarobki = PRACOWNICY.stream()
                .collect(Collectors.toMap(Pracownik::getImie,Pracownik::getPensja));
        imieNaZarobki.forEach((imie, zarobki) -> System.out.println(imie + " " + zarobki));

        // Zmapuj pracowników na mapę płed -> łączne zarobki, wykorzystując kolekcjoner mapujący
        // Collectors.toMap() z możliwością mergowania wartości
        System.out.println("Lączne wartości z podziałem na plec: ");
        final Map<Plec, Integer> sumaZarobkowNaPlec = PRACOWNICY.stream()
                .collect(Collectors.toMap(Pracownik::getPlec, Pracownik::getPensja, Integer::sum));
        sumaZarobkowNaPlec.forEach((plec,laczneZarobki) -> System.out.println(plec + " " + laczneZarobki));


    }
}
