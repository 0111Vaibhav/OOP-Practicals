import java.util.*;

public class P7 {
    public static void main(String[] args) {
        Random r = new Random();
        char ch1 = (char) ('A' + r.nextInt(26));
        char ch2 = (char) ('A' + r.nextInt(26));
        char ch3 = (char) ('A' + r.nextInt(26));
        int n1 = r.nextInt(10000);
        System.out.println(ch1 + "" + ch2 + "" + ch3 + "" + String.format("%04d", n1));
    }

}
