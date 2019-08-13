package programowanie_obiektowe;

public class KlasaObject {

    public static void main(String[] args) {

        Punkt p = new Punkt(2, 3);
        System.out.println(p.getClass());

        Punkt p2 = new Punkt(2,3);

        System.out.println(p==p2); // false
        System.out.println(p.equals(p2)); // normalnie byłoby false ale po nadpisaniu metody jak nizej już nie porównujemy obiektów tylko przekazane zmienne !!!!!
                                          // a jak bedzie null (albo poza tablicą) to wyskoczy błąd dlatego ponizej jest zabezpieczenie
    }

}
    class Punkt {

        int x;
        int y;

        Punkt (int x, int y) {
            this.x = x;
            this.y = y;
        }

        int getX () {
            return x;
        }

        int getY () {
            return y;
        }

        @Override
        public boolean equals(Object obj) {

            if (this == obj) {return true ; }
            if (obj == null) {return false;}

            Punkt porownywany = (Punkt)obj;

            return  this.x == porownywany.x && this.y == porownywany.y; // to będzie true jak beda sie zgadzac współrzędne
                                                                        // bo to nie porównuje obiektu tylko współrzędne !!!
        }


    }


