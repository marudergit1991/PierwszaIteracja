package instrukcja_warunkowa;

public class Main {
    public static void main(String[] args) {
        int a = 10;

        //if(warunek)
        if(a>5) {
            System.out.println("Liczba jest większa od 5");
        } else if(a==5) {
            System.out.println("Liczba jest równa 5");
        } else {
            System.out.println("Liczba jest mniejsza od 5");
        }

        /*
         *    = przypisanie
         *    == rowna sie
         *    != nierówna się
         *    && logiczne i (and, koniunkcja)
         *    || logiczne lub(or, alternatywa)
         *    % modulo
         */

        System.out.println(3==4); // falsz
        System.out.println(3!=4); // prawda
        //oba zdania musza byc true zeby calosc byla true
        System.out.println(2<3 && 5<4); // falsz
        //wystarczy ze jedno zdanie bedzie true zeby calosc byla true
        System.out.println(2<3 || 5<4); // prawda

        System.out.println(5%3); // 2


        // switch case
        // stworz dziennik ocen w switchu
        // kluczem będzie ocena
        // jesli 1 - wyswietl: niedostateczny
        // jesli 2 - wyswietl: dopuszczajacy
        // jesli 3 - wwyswietl dostateczny
        // ...


        // switch(klucz):
        //    case 1:

        int ocena = 10;


        switch (ocena) {
            case 1:
                System.out.println("Niedostateczny");
                break;
            case 2:
                System.out.println("Dopuszczajacy");
                break;
            case 3:
                System.out.println("Dostateczny");
                break;
            case 4:
                System.out.println("Dobry");
                break;
            case 5:
                System.out.println("Bardzo dobry");
                break;
            case 6:
                System.out.println("Celujacy");
                break;
            default:
                System.out.println("Nie ma takiej oceny");
        }

        // Stworz konstrukcje switch case dla dni tygodnia


        String dzientygodnia = "xyz";

        switch (dzientygodnia) {
            case "poniedzialek":
                System.out.println("Poniedzialek");
                break;
            case "wtorek":
                System.out.println("Wtorek");
                break;
            case "sroda":
                System.out.println("Sroda");
                break;
            case "czwartek":
                System.out.println("Czwartek");
                break;
            case "piatek":
                System.out.println("Piatek");
                break;
            case "sobota":
                System.out.println("Sobota");
                break;
            case "niedziela":
                System.out.println("Niedziela");
                break;
            default:
                System.out.println("Nie ma takiego dnia tygodnia");
        }


        // Sprawdz czy podana liczba jest  wieksza od 0, rowna 0 czy mniejsza od 0

        int zmienna1 = 5;

        if (zmienna1 > 0) {
            System.out.println("Liczba jest wieksza od zera");
        } else if (zmienna1 == 0) {
            System.out.println("Liczba jest rowna 0");
        } else {
            System.out.println("Liczba jest mniejsza od zera");
        }


        // Sprawdz czy podana liczba typu double nalezy do przedzialu [1,4] czy moze [6,8] czy jest spoza przedzialu

        double zmienna2 = 3;

        if (zmienna2 >= 1 && zmienna2 <= 4) {
            System.out.println("Zmienna2 znajduje sie w przedziale [1,4]");
        } else if (zmienna2 >= 6 && zmienna2 <= 8) {
            System.out.println("Zmienna2 znajduje sie w przedziale [6,8]");
        } else {
            System.out.println("Zmienna2 znajduje sie poza wybranymi przedzialami");
        }


        //sprawdz czy podana liczba jest parzysta czy nie
        int zmienna3 = 20;

        if (zmienna3 % 2 == 0) {
            System.out.println("Liczba parzysta");
        } else {
            System.out.println("Liczba nieparzysta");
        }


        //Z dwoch podanych liczb, sprawdz ktora jest wieksza i napisz o ile
        //Czyli dla liczb 3 i 5 powinnismy dostac output: 5 jest wieksze od 3 o 2

        int b = 6, c = 5;

        if(b > c){
            System.out.println("Liczba " + b + " jest wieksza od " + c + " o " + (b-c));
        } else if(c > b){
            System.out.println("Liczba " + c + " jest wieksza od " + b + " o " + (c-b));
        } else {
            System.out.println("Liczby sa rowne");
        }


        // Z trzech podanych przez siebie liczb
        int g = 3,h = 5,i = 7;
        // znajdz liczbe najmniejsza
        if (g < h && g < i) {
            System.out.println("Najmniejsza liczba to " + g);
        } else if (h < g && h < i) {
            System.out.println("Najmniejsza liczba to " + h);
        } else {
            System.out.println("Najmniejsza liczba to " + i);
        }



        // znajdz liczbe najwieksza


        // Do domu:
        // Zapoznaj sie z metodami na Stringu:
        // charAt
        // endsWith
        // startWith


        // 1. Sprawdz czy imie jest damskie lub meskie
        // jesli damskie -> to jest kobieta
        // jesli meskie -> to jest facet


        // Next temat: Petle (for, while, do-while, while(true))
        String myStr = "ewelina";
        if (myStr.endsWith("a")) {
            System.out.println("Jest to imie zenskie");
        } else {
            System.out.println("Jest to imie meskie");
        }

    }
}
