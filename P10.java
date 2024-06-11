
import java.util.*;

public class P10 {

    @SuppressWarnings("resource")
    public static void reverse(int[] x) {
        int t;
        for (int i = 0, j = x.length - 1; i < x.length / 2; i++, j--) {
            t=x[i];
            
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = s.nextInt();
        }
        reverse(a);
    }
}
