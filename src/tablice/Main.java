package tablice;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // typTablicy[] nazwaTablicy = new typTablicy[rozmiar];
        String[] dniTygodnia = new String[7];

        // tablice indeksujemy od 0 czyli ostatni indeks bedzie wynosil: 6   (n-1)   7-1 = 6
        dniTygodnia[0] = "Poniedzialek";
        dniTygodnia[1] = "Wtorek";
        dniTygodnia[2] = "Sroda";
        dniTygodnia[3] = "Czwartek";
        dniTygodnia[4] = "Piatek";


        System.out.println("Element na indeksie nr 2 to: " + dniTygodnia[2]);

        // jesli nasza tablica Stringowa nie posiada przypisanej wartosci to otrzymujemy nulla - null to nic, czyli pusta wartosc
        System.out.println("Element na indeksie nr 6 to: " + dniTygodnia[6]);


        System.out.println("Dlugosc tablicy: " + dniTygodnia.length);

        // Sprobuj wyswietlic ostatni element z tablicy, obliczajac indeks za pomoca dlugosci tablicy

        int wielkosctablicy = dniTygodnia.length;

        System.out.println("Ostatni element tablicy: " + dniTygodnia[wielkosctablicy - 1]);


        // 2 petle za pomoca ktorych mozemy dostac sie do kazdego elementu z tablicy

        System.out.println("");

        // for
        for (int i = 0; i < dniTygodnia.length; i++) {
            System.out.print(dniTygodnia[i] + " ");
        }

        System.out.println();

        // for-each
        for (String element : dniTygodnia) {
            System.out.print(element + " ");
        }

        System.out.println("");

        String[] miesiace = {"Styczen", "Luty", "Marzec", "Kwiecien"};


        System.out.println(Arrays.toString(miesiace));

        System.out.println("");

        // for
        for (int i = 0; i < miesiace.length; i++) {
            System.out.print(miesiace[i] + " ");
        }

        System.out.println();

        // for-each
        for (String element : miesiace) {
            System.out.print(element + " ");
        }


        // Zadeklaruj tablice intów dwoma sposobami, przypisz do nich wartosci, wypisz ich dlugosc i niektore elementy, wypisz za pomoca fora i for each

        System.out.println("\n");

        int[] tablica1 = new int[5];

        tablica1[0] = 1;
        tablica1[1] = 2;
        tablica1[2] = 3;
        tablica1[3] = 4;
        tablica1[4] = 5;

        for (int i = 0; i < tablica1.length; i++) {
            System.out.println(i + " element tablicy1: " + tablica1[i]);
        }

        int[] tablica2 = {10, 20, 30, 40, 50};

        for (int i = 0; i < tablica2.length; i++) {
            System.out.println(i + " element tablicy2: " + tablica2[i]);
        }


        // wyswietl tylko liczby wieksze niz 4

        int[] tablica3 = {2, 4, 7, 4, 65, 7, 54, 3, 1};


        for (int i = 0; i < tablica3.length; i++) {
            if (tablica3[i] > 4) {
                System.out.println(tablica3[i] + " ");
            }
        }

        // Zadeklaruj tablice Stringow i wypelnij ją dynamicznie imionami żeńskimi i męskimi
        // Wypisz imiona męskie
        // Wypisz imiona damskie
        // Wypisz imiona zaczynające się na literke M


        String[] imiona = {"Ania", "Zenon", "Andrzej", "Marzena", "Wojciech", "Agata", "Monika"};

        for (int i = 0; i < imiona.length; i++) {
            if (imiona[i].endsWith("a")) {
                System.out.println(imiona[i] + " to imie zenskie");
            } else {
                System.out.println(imiona[i] + " to imie meskie");
            }
        }


        for (int i = 0; i < imiona.length; i++) {
            if (imiona[i].startsWith("M")) {
                System.out.println("To imie zaczyna sie na litere M: " + imiona[i]);
            }
        }

        // Zadeklaruj tablice ktora wypelnisz petla od 5 do 25
        // policz sume
        // policz srednia
        // wyswietl dlugosc tablicy
        // znajdz element najwiekszy
        // znajdz element najmniejszy
        // * znajdz element srodkowy

        int[] tablica4 = new int[21];
        int zmienna1 = 5;

        for (int i = 0; i < tablica4.length; i++) {

            tablica4[i] = zmienna1;
            zmienna1++;
        }

        int suma = 0;

        for (int i = 0; i < tablica4.length; i++) {
            suma += tablica4[i];
        }
        System.out.println("Suma wynosi: " + suma);
        double srednia = suma / tablica4.length;
        System.out.println("Srednia wynosi: " + srednia);
        System.out.println("Dlugosc tablicy wynosi: " + tablica4.length);

        int max = tablica4[0];

        for (int i = 0; i < tablica4.length; i++) {
            if (tablica4[i] > max) {
                max = tablica4[i];
            }
        }
        System.out.println("Maksymalna liczba wynosi: " + max);

        int min = tablica4[0];

        for (int i = 0; i < tablica4.length; i++) {
            if (tablica4[i] < min) {
                min = tablica4[i];
            }
        }
        System.out.println("Minimalna liczba wynosi: " + min);


        // Scanner java
    }
}
