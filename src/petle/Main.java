package petle;

public class Main {
    public static void main(String[] args) {

        // Wypisz na konsoli 20 razy wyraz "Hej"

        // for                            start                                     koniec                                  instrukcja (i++/i--)
        // slowo kluczowe  for(deklaracja zmiennej iterujacej; warunek ktory musi byc spelniony aby wejsc do petli; instrukcja co sie dzieje ze zmienna iterujaca) {  }
        for (int i = 0; i < 20; i++) {
            System.out.print("Hej ");
        }

        // zmienna w petli jest niewidoczna dla innych petli

        System.out.println("\n");

        // while
        int x = 0;

        while (x < 20) {
            System.out.print("Hej ");

            x++;
        }

        System.out.println("\n");

        // do while
        int y = 0;

        do {
            System.out.print("Hej ");

            y++;
        } while (y < 20);

        System.out.println("\n");


        // * while(true) - petla nieskonczona
        int c = 0;

        while(true) {
            if(c == 20) {
                break;
            } else {
                System.out.print("Hej ");
            }

            c++;
        }

        System.out.println("\n");

        // Stworz 4 petle for,while,do-while oraz while(true) i wypisz liczby od 0 do 9   (petla kerci sie 10 razy)

        for (int i = 0; i < 10; i++){
            System.out.print((i + 1) + " ");
        }

        System.out.println("\n");

        int z = 0;

        while(z < 10){
            System.out.print((z + 1) + " ");
            z++;
        }

        System.out.println("\n");

        int k = 0;

        do{
            System.out.print((k +1) + " ");
            k++;
        } while (k < 10);

        System.out.println("\n");

        int l = 0;

        while(true){
            if(l < 10){
                System.out.print((l + 1) + " ");
            }else {
                break;
            }
            l++;
        }

        System.out.println("\n");

        // Wypisz na konsoli liczby od 1 do 20 oddzielone przecinkami
        // Ale pamietaj ze na samym koncu nie potrzebujemy przecinka :) GL

        for (int i = 1; i < 21; i++) {
            if (i < 20)
                System.out.print(i + ", ");
            else {
                System.out.print(i);
            }
        }

        System.out.println("\n");

        // Za pomocą pętli while wypisz liczby od 1 do 10, dla kazdej liczby powyzej 5
// dodaj napis'duża liczba'

        int d = 1;

        while (d < 11) {
            if (d < 6) {
                System.out.print(d + " ");
            } else {
                System.out.print("Duza liczba " + d + " ");
            }
            d++;
        }

//Wypisz wszystkie liczby parzyste z zakresu 1-30 (za pomoca petli for,while,dowhile)
        System.out.println("\n");

        for (int i = 1; i < 31; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n");

        int ab = 1;

        while (ab < 31) {
            if (ab % 2 == 0) {
                System.out.print(ab + " ");
            }
            ab++;
        }

        int ac = 1;

        System.out.println("\n");

        do {
            if (ac % 2 == 0) {
                System.out.print(ac + " ");
            }
            ac++;
        } while (ac < 31);

        System.out.println("\n");

// Napisz program który wyswietli liczby podzielne przez 3 z zakresu 14-38

        for (int i = 14; i < 39; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }


        System.out.println("\n");

// Wypisz liczby od 40 do 3 w dół

        for (int i = 40; i > 2; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n");


// Wypisz liczby od 50 do 10 w dół, ale tylko nieparzyste!

        for (int i = 50; i > 9; i--) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

    }



}


