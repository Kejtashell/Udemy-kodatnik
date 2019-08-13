package programowanie_obiektowe.wyjatki;

public class Wyjatki {

    public static void main(String[] args) {


       try { // wyłapuję podejrzany o wyrzucenie wyjątku fragment kodu

           System.out.println("Tuż przed blędem");

           dzielenie(5); // kod który powoduje wyjątek nie został wyświetlony, ani nic pod nim

           System.out.println("Bezpośrednio po błędzie");
       }

       catch (ArithmeticException e)  // definiuję jaki wyjątek w powyższym kodzie ma zostać złapany
       {
           System.out.println(e.getMessage());      //podaję instrukcję do wykonania po zlapaniu błędu, nie wykona się jak nie będzie błędu
       }

       finally // żeby finally działało musi być bezposrednio pod try/catch
        {
            System.out.println("Finally - zawsze się wykona z błędem czy bez");
        }
        System.out.println("kod po błędzie - po instrukcji catch");

    }


    static void dzielenie (int x){
        System.out.println(x/0); // wpisz 0 żeby byl błąd, wpisz 1 zeby nie było
    }

}


// try {
//     fragment kodu który może wyrzucić błąd
//     }
// catch (nazwaKLasyWYjatku nazwaZmiennej) np. ArithmeticException e - to jest nazwa klasy i nazwa obiektu w tej klasie
//         {
//             fragment kodu który ma zostac wykonany po obsłużeniu błędu (INSTRUKCJE OBSLUGUJACE ZLAPANY WYJATEK)
//              tu może być więcej catch jedno pod drugim w osobnych blokach albo obok siebie ale nie wiem jak to sie pisze
//         }
// finally {
//              fragment kodu który wykona się zawsze niezależnie od wystąpienia błędu
// }