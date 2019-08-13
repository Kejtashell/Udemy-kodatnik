package programowanie_obiektowe.abstrakcja;

public class InstanceOf {


    public static void main(String[] args) {

        Osoba[] osoba = new Osoba[10];
        osoba[2] = new Student("Ignacy", "Krasicki");
        osoba[5] = new Pracownik("Kasia", "Grata");
        osoba[4] = new Student("Kamil", "Bugaj");
        osoba[6] = new Pracownik("Lesław", "SIenkiewicz");


//        for (int i = 0; i < osoba.length; i++) {
//            if (osoba[i] instanceof Osoba) {
//                osoba[i].opis();
//            }
//        }

//        for (Osoba ktos: osoba) {
//
//            if (ktos instanceof Student) {
//            ktos.opis();
//            ((Student) ktos).studiuje();
//        }
//            else if (ktos instanceof Pracownik) {
//                ktos.opis();
//                ((Pracownik) ktos).pracuje();
//
//            }
//        }

        for (Osoba ktos: osoba) {

            if (ktos instanceof Osoba) {


                if (ktos instanceof Pracownik) { // bez poniższego rzutowania dalej nie mamy z ktosia dostepu do PRacowkika bo ktoś to Osoba
                    ktos.opis();
                    ((Pracownik) ktos).pracuje(); // rzutowanie do subklasy pozwolilo uzyskac\dostęp do metod zdefiniowanych w subklasie a nie w superklasie
                }
                else if (ktos instanceof Student) {
                    ktos.opis();
                    ((Student)ktos).studiuje();
                }

            }
        }
    }
}
