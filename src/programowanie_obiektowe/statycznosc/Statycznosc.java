package programowanie_obiektowe.statycznosc;

public class Statycznosc {

    public static void main(String[] args) {



        // Matematyka mm = new Matematyka();
        // System.out.println(Matematyka.PI);

        double x = Matematyka.dodawanie(5,6);

        System.out.println(x);

        SampleClass.sampleMetoda();

        Klient a = new Klient("Asia");
        System.out.println(a.id);

        Klient b = new Klient("Basia");
        System.out.println(b.id);

        Klient c = new Klient("Celina");
        System.out.println(c.id);

        Klient d = new Klient("Diana");
        System.out.println(d.id);

        System.out.println(Klient.nextId);
        System.out.println(Klient.nextId); // pierwsze się zwiększa bo dodawanie znajduje sie w konstruktorze, a potem już nie
    }

}

 class Matematyka { // klasa nie może byc statyczna ale jej pola i metody mogą - umożliwia to wywoływanie ich bez tworzenia instancji klasy

    static final double PI = 3.14;

   static double dodawanie (double a, double b){ // statyczna metoda może byc wywolana bez instancji klasy w której sie znajduje

        return a + b;

    }

}

class Klient {
    String imie;
    int id;
    static int nextId = 1; // jak ddamy static to wartość nie będzie tworzona od nowa dla każdej instancji tylko będzie przetrzymywana ostatnia wartość w pamięci ???

    Klient (String imie){
        imie = this.imie;
        id = nextId;
        nextId ++;
    }

        }
