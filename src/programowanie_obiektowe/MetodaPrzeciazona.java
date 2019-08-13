package programowanie_obiektowe;

// Metoda przeciążona - jeśli weźmiemy jedną metodę o takiej samej nazwie i zrobimy jej dwie implementacje
//z dwoma lub więcej rodzajami zmiennych to jest to metoda przeciążona
// przykładem jest system out print, który drukuje wszystko co wpiszemy
// właśnie dzięki temu że jest przeciążona i ma wiele implementacji


import programowanie_obiektowe.statycznosc.SampleClass;

public class MetodaPrzeciazona {

    public static void main(String[] args) {

    Pomocnicza kk = new Pomocnicza();

    int x = kk.wynik(4,5);
        System.out.println(x);

    double y = kk.wynik(4.5, 5.5);
        System.out.println(y);

    }


}

class Pomocnicza {
    int wynik(int a, int b) {
        return a + b;
    }

    double wynik(double a, double b) {
        return a + b;
    }
}
