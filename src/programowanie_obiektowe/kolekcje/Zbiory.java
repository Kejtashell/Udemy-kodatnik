package programowanie_obiektowe.kolekcje;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Zbiory {

    public static void main(String[] args) {


        Alkohole[] barek = new Alkohole[5];
        barek[0] = new Alkohole("piwo", 5);
        barek[1] = new Alkohole("wino", 12);
        barek[2] = new Alkohole("wodka", 40);
        barek[3] = new Alkohole("likier", 20);
        barek[4] = new Alkohole("whiskey", 40);


        int[] ii = new int[3];

        TreeSet ts = new TreeSet();
        HashSet hs = new HashSet();

        Set mySet = new TreeSet();
        boolean isAdded = mySet.add(barek);
        System.out.println(isAdded);
    }
}
