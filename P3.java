import java.util.*;

public class P3 {

    public static void main(String args[]) {
        int mv;
        double fv;
        System.out.println("Enter Value in Meter :");
        Scanner s = new Scanner(System.in);
        mv = s.nextInt();
        fv = 3.28 * mv;
        System.out.println("Value in Feet : " + fv);
    }

}
