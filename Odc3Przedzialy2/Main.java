package JavaZadanka.odc3;

/**
 * Czy zmienna należy TYLKO do jednego z tych przedziałów
 * A (-15, -10)
 * B (-niesk, -13)
 */
//ROZWIAZANIE = (-niesk, -15] U [-13, -10)
public class Main {

    public static void main(String[] args){

        float wrt = 14;

        if( wrt <= -15 || (wrt >= -13 && wrt < -10))
            System.out.println("Prawda");

    }
}
