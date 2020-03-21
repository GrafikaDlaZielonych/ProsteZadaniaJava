package JavaZadanka.odc5;

/**
 * zapisz liczbe calkowita w postaci binarnej
 * unikaj stosowania operatorow arytmetycznych
 * (czyli skorzystaj z operatorow binarnych)
 */

public class Main {

    public static void main(String[] args){

        int a = 674;
        //0101
        //0001& 1
        //0010& 0
        //0100& 1
        //1000& 0
        //0000000000000101
        // 0b0 = 0000000000000000
        for(int i = 15; i >= 0; i--){
            if((a & 0b1 << i) != 0b0)
                System.out.print("1");
            else
                System.out.print("0");
        }

    }
}
