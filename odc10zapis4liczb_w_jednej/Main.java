public class Main {
    public static void main(String[] args) throws Pixel.ZeroesException {
        int r = 7; int g = 5; int b = 1; int a = 6;

        Pixel pixel = new Pixel(r, g, b, a);
        System.out.println(pixel.toString());

    }

}

/*
Zadanie:
Utwórz klasę Pixel która zakoduje wartość piksela na pojedynczej wartości int w taki sposób, że będzie przechowywała natężenie światłą(A) oraz 3 podstawowe barwy (RGB). Na każda z nich przypadają wartości z przedziału od 0-255.
Np.: 117768454_10 = 00000111 00000101 00000001 00000110_2
A=7;  R=5; G=1; B=6
Utwórz konstruktor, który wyrzuci wyjątek, jeżeli wszystkie wartości byłyby zainicjowane zerami.
Utwórz 4 metody get, które zwrócą poszczególne wartości piksela. (wykorzystaj przesunięcia bitowe)
Przesłoń toString() by zwracała informacje o pikselu.
*/
