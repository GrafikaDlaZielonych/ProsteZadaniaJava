package JavaZadanka.odc6;

/**
 * Narysuj choinkę/piramidę z *
 *        *
 *       ***
 *      *****
 */
public class Main {

    public static void main(String args[]) {

        int len = 5;

        for(int i = len; i > 0; i--){
            for(int j = i; j > 0; j--)
                System.out.print(" ");
            for(int k = 2*(len - i) + 1; k > 0; k--)
                System.out.print("-");
            System.out.println();
        }

        /*
        for(int i = 0; i < len; i++){
            for(int j = 0; j < i; j++)
                System.out.print("*");
            System.out.println();
        }*/

        /*
                for (int i = len; i > 0; i--) {
            for (int j = i; j >= 0; j--)
                System.out.print("*");
            System.out.println();
         */
    }
}
