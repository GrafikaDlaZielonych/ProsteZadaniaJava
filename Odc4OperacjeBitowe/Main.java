package JavaZadanka.odc4;

public class Main {

    public static void main(String[] args){

        int a = 5;                                      // 0101

        System.out.println(a);
        System.out.println(3 & 1);                      // 0011 & 0001 = 0001 = 1
                                                        // 0001
        System.out.println(a >> (3 & 1));               // 0101 >> 1   = 0010 = 2

        System.out.println(a >> 1 << 2);
        System.out.println(a >> (3 & 1) << 2);          // 0010 << 2   = 1000 = 8
    }
}
