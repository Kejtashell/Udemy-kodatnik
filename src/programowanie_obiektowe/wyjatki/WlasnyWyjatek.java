package programowanie_obiektowe.wyjatki;

public class WlasnyWyjatek {

    public static void main(String[] args) {

        int a = 10;

        try {

            System.out.println(5/0); // to zostanie obsluzone tylko jak w catch wpiszemy Exception a nie NAsz wyjatek

         if (a==10) {
             throw new NaszWyjatek ("Tylko nie 10!"); // jak bedzie exception w catch i jakis blad na górze to ten sie nie wyswietli

             // tutaj już nic nie moge napisac bo bedzie krzyczec ze unreachable
         }
        } catch (NaszWyjatek e) {
            System.out.println(e.getMessage()); // wyświetla to co jest napisane w wyjątku (pewnie najczęściej takim ktory sami stworzymy
        }
        catch (ArithmeticException ae) // można również łapać wyjątki po kolei po jednym try, ale i tak jak złapie jeden to nie dotrze do drugiego !!
        {
            System.out.println(ae.getMessage());

        }

        finally {
            System.out.println("Finally");
        }
    }

}

class NaszWyjatek extends Exception {

    public NaszWyjatek(String message) {
        super(message);
    }

    }

