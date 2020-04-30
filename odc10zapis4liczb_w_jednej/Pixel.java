public class Pixel {

    private int pixel;

    class ZeroesException extends Exception {
        ZeroesException() {
            super("All entered values are zeroes");
        }
    }

    public Pixel(int r, int g, int b, int a) throws ZeroesException {
        if (r == 0 & g == 0 & b == 0 & a == 0)
            throw new ZeroesException();

        String concatenated = get_binary(r) + get_binary(g) + get_binary(b) + get_binary(a);
        System.out.println(concatenated);

        this.pixel = Integer.parseInt(concatenated, 2);
        System.out.println(pixel);
    }

    private String get_binary(int dec) {
        String text = "";

        for (int i = 7; i >= 0; i--) {
            if ((dec & 0b1 << i) != 0b0)
                text = text.concat("1");
            else
                text = text.concat("0");
        }
        return text;
    }

    private String get_binary(int dec, int offset) {
        String text = "";

        for (int i = (offset - 2); i >= (offset - 8); i--) {
            if ((dec & 0b1 << i) != 0b0)
                text = text.concat("1");
            else
                text = text.concat("0");
        }
        return text;
    }

    public String get_a(){
        return get_binary(pixel, 8);
    }

    public String get_b(){
        return get_binary(pixel, 16);
    }

    public String get_g(){
        return get_binary(pixel, 24);
    }

    public String get_r(){
        return get_binary(pixel, 32);
    }

    @Override
    public String toString(){
        String r = get_r();
        String g = get_g();
        String b = get_b();
        String a = get_a();

        return "R: " + r + " G: " + g + " B: " + b + " A: " + a
                + "\nR: " + Integer.parseInt(r, 2)
                + " G: " + Integer.parseInt(g, 2)
                + " B: " + Integer.parseInt(b, 2)
                + " A: " + Integer.parseInt(a, 2)
                +  "\n";


    }
}
