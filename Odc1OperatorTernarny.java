package JavaZadanka.odc1;

/**
 Zadeklaruj i zainicjuj zmienną typu boolean o nazwie czyPada.
 Na podstawie tej zmiennej użyj operatora ternarnego aby wypisać informację "Weź Parasol"
 lub "Nie bierz parasola"
 */

public class Main {

    public static void main(String[] args){

        boolean czyPada;
        int liczba;

        czyPada = true;

        liczba = ((3 + 10) > (5 - 2 +5/3)) ? 4 : 5;

        System.out.println(liczba);
    }
}
