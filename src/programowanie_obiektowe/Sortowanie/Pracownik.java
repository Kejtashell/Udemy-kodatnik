package programowanie_obiektowe.Sortowanie;

import java.util.Arrays;

public class Pracownik implements Comparable{

    int wynagrodzenie;


    public static void main(String[] args) {

//        Comparable c = new Pracownik(5555);
//        System.out.println( ((Pracownik)c).wynagrodzenie);

    Pracownik[] listaPlac = new Pracownik[4];

        listaPlac[0] = new Pracownik(2000);
        listaPlac[1] = new Pracownik(9000);
        listaPlac[2] = new Pracownik(1600);
        listaPlac[3] = new Pracownik(4500);

        System.out.println(listaPlac[0].compareTo(listaPlac[1]));

        Arrays.sort(listaPlac);

        for (Pracownik p: listaPlac) {
            System.out.println(p.getWynagrodzenie());
        }



}
    Pracownik (int wynagrodzenie){
        this.wynagrodzenie = wynagrodzenie;
    }

    int getWynagrodzenie () {
        return wynagrodzenie;
    }

    @Override
    public int compareTo(Object o) {
        Pracownik przyslany = (Pracownik) o;

        if (this.wynagrodzenie < przyslany.wynagrodzenie) {
            return -1;
        }
        if (this.wynagrodzenie > przyslany.wynagrodzenie) {
            return 1;
        }
        return 0;
    }
}
