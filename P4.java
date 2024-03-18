import java.util.*;

public class P4 {

    public static void main(String args[]) {
        int WeightInPounds, HeightInInches;
        double WeightInKg, HeightInMeters, BMI;

        System.out.println("Enter Weight in Pounds : ");
        Scanner WPScanner = new Scanner(System.in);
        WeightInPounds = WPScanner.nextInt();

        System.out.println("Enter Height in Inches : ");
        Scanner HIScanner = new Scanner(System.in);
        HeightInInches = HIScanner.nextInt();

        WeightInKg = 2.20462 * WeightInPounds;
        HeightInMeters = 0.0254 * HeightInInches;
        BMI = WeightInKg / (HeightInMeters * HeightInMeters);

        System.out.println("BMI : " + BMI);

    }
}
