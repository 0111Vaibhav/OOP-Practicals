import java.util.*;

public class P08 {
 
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        int div = 2;
        Scanner inpt = new Scanner(System.in);
        System.out.println("Enter an Integer");
        int n = inpt.nextInt();
        while (n > 1) {
            if (n % div == 0) {
                System.out.print(div + ",");
                n = n / div;
            } else {
                div++;
            }
        }
    }
}