public class P02 {

    public static void main(String args[]) {
        double a = 3.4, b = 50.2, c = 2.1, d = 0.55, e = 4.45, f = 5.9, x, y;
        x = ((e * d) - (b * f)) / ((a * d) - (b * c));
        y = ((a * f) - (e * c)) / ((a * d) - (b * c));
        System.out.println(x + " " + y);

    }
}
