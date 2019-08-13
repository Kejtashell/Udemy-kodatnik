package programowanie_obiektowe.abstrakcja;

public class Student extends Osoba {

    Student(String imie, String nazwisko) {
        super(imie, nazwisko);
    }

    @Override
    void opis() {
        System.out.println("Nazywam się " + imie);
    }

    void studiuje () {
        System.out.println(" i studiuję");
    }
}
