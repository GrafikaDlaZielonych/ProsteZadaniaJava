package JavaZadanka.odc2;

/**
 * Czy zmienna należy do wszystkich z tych przedziałów:
 * A - (-15, -10] U (-5, 0) U (5, 10)
 * B - (-niesk, -13) U (-8, -3]
 * C - [-4, niesk)
 */
// ROZWIĄZANIE = [-4, -3]
public class Main {

    public static void main(String[] args){

        float wrt = -3.5f;

        if ( wrt >= -4.f && wrt <= -3.f)
            System.out.println("Nalezy do przedzialow ABC jednoczesnie");
    }
}
