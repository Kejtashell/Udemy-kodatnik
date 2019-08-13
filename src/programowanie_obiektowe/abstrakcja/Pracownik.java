package programowanie_obiektowe.abstrakcja;

public class Pracownik extends Osoba {


    Pracownik(String imie, String nazwisko) {
        super(imie, nazwisko);
    }

    @Override
    void opis() {
        System.out.println("Pani " + nazwisko + " " + imie);
    }

    void pracuje () {
        System.out.println(" ciężko pracuje na emerytów i studentów");
    }

}
