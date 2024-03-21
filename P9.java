import java.util.Scanner;

public class P9 {

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

    public static void main(String[] args) {
        int a, b;
        System.out.println("Enter two numbers : ");
        Scanner as = new Scanner(System.in);
        a = as.nextInt();
        Scanner bs = new Scanner(System.in);
        b = bs.nextInt();
        System.out.println(gcd(a, b));

    }
}
