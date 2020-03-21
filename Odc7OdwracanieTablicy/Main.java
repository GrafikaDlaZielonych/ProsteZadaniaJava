package JavaZadanka.odc7;

/**
 * Przepisz tablice tab do tablicy arr
 * tak aby odwrocic kolejnosc wystepujacych elementow
 */

public class Main {

    public static void main(String[] args) {
        int[] tab = new int[]{4, 6, 10, 20, 40, 7};
        int[] arr = new int[tab.length];

        for(int i = 0; i < tab.length; i++)
            System.out.print(tab[i] + "  ");
        System.out.println();

        for(int i = 0; i < tab.length; i++)
            arr[i] = tab[tab.length - 1 - i];

        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + "  ");
        System.out.println();
    }
}
