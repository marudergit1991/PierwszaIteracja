package wstep_zmienne;

public class Main {
    public static void main(String[] args) {

        // Nazwy paczek (packages) piszemy z malych liter

        // Nazwy klas piszemy z duzej litery

        System.out.println("Hello world!");
        System.out.println("Hello world!");
        System.out.println("Hello world!");

        System.out.println();

        System.out.print("Hello world!");
        System.out.print("Hello world!");
        System.out.print("Hello world!");


        System.out.println("\n");

        // komentarz wierszowy

        /*
        ewqeqw
        eqwewqe
        eqweq       komentarz blokowy
        ewqeqw
         */



        // znaki specjalne \n \s \t
        // \n    - enter
        // \s    - spacja
        // \t    - tabulator


        // Zmienne typu:
        // nazwy zmiennych piszemy z malej litery, a jesli nazwy zmiennych sa dwuczlonowe to uzywamy camel caseow (wielka litera kolejnego czlonu nazwy)

        // String - łańcuch znaków deklarowany w " "
        String tekstWiersza = "Ala ma kota";
        System.out.println("Zmienna tekstWiersza posiada wartosc: " + tekstWiersza);

        // to nie jest deklaracja nowej zmiennej tylko przypisanie nowej wartosci do juz istniejacej zmiennej
        tekstWiersza = "Ula ma psa";
        System.out.println("Zmienna tekstWiersza po przypisaniu nowej wartosci: " + tekstWiersza);

        // int - liczba calkowita

        int liczbaCalkowita = 25;

        System.out.println("Zmienna calkowita wynosi: " + liczbaCalkowita);

        // double - liczba rzeczywista

        double liczbaRzeczywista = 100.25;

        System.out.println("liczba rzeczywista wynosi: " + liczbaRzeczywista);

        // char - pojedynczy znak deklarowany w ' '

        char znakPojedynczy = 'b';

        System.out.println("Znak ma wartosc: " + znakPojedynczy);

        liczbaCalkowita = 40;
        System.out.println("Po zmianie liczbaCalkowita wynosi: " + liczbaCalkowita);

        // boolean - true / false    "przekaźnik"

        boolean przekaznik = true;

        System.out.println("I ostatnia zmienna typu boolean wynosi: " + przekaznik);


        // Zadeklaruj dwie zmienne typu double i wykonaj działania za pomoca operatorów:
        // +, -, *, /

        double a = 10.5, b = 5.5, suma = a + b, roznica = a - b, mnozenie = a * b, dzielenie = a / b;

        System.out.println("\nSuma: " + suma + ", roznica: " + roznica + ", mnozenie: " + mnozenie + ", dzielenie: " + dzielenie + "\n");


        //przestowac operatory +,-,*,/ dla innych zmiennych
        //np pomiedzy doublem i Stringiem, Stringiem i booleanem, intem i doublem
        //i intem i booleanem
        String czesc = "hi";
        double y = 5.0;
        char wykrz = 'L';
        boolean falszpkt = false;
        int liczba55 = 50;

        // ....           - blad
        System.out.println(wykrz+wykrz); // przy laczeniu znaku z innymi zmiennymi ktore posiadaja wartosc liczbowa lub z samym znakiem dostajemy kod ASCII Decimal Value

         //System.out.println(y * czesc);
        // System.out.println(wykrz * falszpkt);
        // System.out.println(liczba55 + falszpkt);
        System.out.println(liczba55 + y);
        System.out.println(czesc + liczba55);
        System.out.println(wykrz + y);
        // System.out.println(falszpkt - liczba55);
        System.out.println(czesc + wykrz);



        int x = 10;
        System.out.println("\nPoczatkowa wartosc: " + x);

        x = x + 3; // Przypisanie nowej wartosci z uzyciem aktualnej zmiennej
        System.out.println("Przypisanie nowej wartosci z uzyciem aktualnej zmiennej: " + x); // 13

        x += 5; // Zwiekszamy aktualna wartosc o 5
        System.out.println("Zwiekszamy aktualna wartosc o 5: " + x); // 18

        x -= 10; // Zmniejszamy aktualna wartosc o 10
        System.out.println("Zmniejszamy aktualna wartosc o 10: " + x); // 8

        //  *=    /=                x++ zwieksznie o jeden (inkrementacja)   /   x-- zmniejszenie o jeden (dekrementacja)

        x *= 4;
        System.out.println("Mnozenie wartosci 4-krotnie: " + x); // 32
        x /= 8;
        System.out.println("Dzielenie wartosci aktualniej przez 8: " + x); //4
        x++;
        System.out.println("Inkrementacja wartosci o jeden: " + x); //5
        x--;
        x--;
        System.out.println("Dekrementacja o 2: " + x); //3




    }
}