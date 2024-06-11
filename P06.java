import java.util.*;

public class P06 {

    @SuppressWarnings("resource")
    public static void main(String []args) {

        char a;
        System.out.println("Enter a Letter : ");
        Scanner cs = new Scanner(System.in);
        a = cs.next().charAt(0);
        if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u' || a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U') {

            System.out.println("You've entered a vowel");
        }
        else {
            System.out.println("You've entered a consonant");
        }
    }

}
