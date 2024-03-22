import java.util.*;

public class P10 {

    /**
     * @param args
     * @param i
     */
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        int a[] = new int[10];
        for (int i = 0; i < 10; i++) {
            Scanner sc = new Scanner(System.in);
            a[i] = sc.nextInt();
        }
        for (int j = 9; j >= 0; j--) {

            System.out.print(a[j] + " ");

        }

    }

}
