package programowanie_obiektowe.abstrakcja;

public abstract class Osoba {

    String imie;
    String nazwisko;

    Osoba (String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;

    }

   abstract void opis ();

}
