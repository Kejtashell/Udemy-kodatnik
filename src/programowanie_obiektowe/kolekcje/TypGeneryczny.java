package programowanie_obiektowe.kolekcje;

import java.util.ArrayList;
import java.util.Collection;

public class TypGeneryczny {

    public static void main(String[] args) {


       ArrayList b = new ArrayList(); // jak to sie dzieje ze mozna dodac dwa rozne typy i czy mozna z tym cos zrobic potem
        b.add(2);
        b.add("dwa");




        System.out.println("\n++++++++++++++++++\n");

    ArrayList<String> a = new ArrayList();

    a.add("Ala");
    a.add("ma");
    a.add("kota");

        for (String i: a) {
            System.out.println(i);
        }


        System.out.println("\n++++++++++++++++++\n");
    Generyk <String> gen = new Generyk();
    gen.nadajWartosc("Wartosc");
    System.out.println(gen.zwrocWartosc());

    Generyk <Integer> liczba = new Generyk<>();
        liczba.nadajWartosc(44);
        System.out.println(liczba.zwrocWartosc());
}

}

 class Generyk <typGeneryczny> {

    typGeneryczny x;

    void nadajWartosc (typGeneryczny x) {
        this.x = x;
    }

    typGeneryczny zwrocWartosc () {
        return this.x;
    }
}
