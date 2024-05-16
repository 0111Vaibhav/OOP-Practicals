import java.util.Scanner;

public class P09 {

    /**
     * @param n1
     * @param n2
     * @return
     */
    public static int gcd(int n1, int n2) {

        int min = Math.min(n1, n2);
        while (min > 0) {
            if (n1 % min == 0 && n2 % min == 0) {
                break;
            } else {
                min--;
            }
        }
        return min;

    }

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        int a, b;
        System.out.println("Enter two numbers : ");
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
        System.out.println(gcd(a, b));

    }
}
