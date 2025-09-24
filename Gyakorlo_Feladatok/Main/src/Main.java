import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Add meg a testsúlyodat (kg): ");
        double bodyWeight = scn.nextDouble();

        System.out.print("Milyen az akitivitási szinted? (1 - átlagos, 2 - magas, 3 - extrém) ");
        int activityLevel = scn.nextInt();

        if (activityLevel == 1) {
            double proteinIntakeValue = bodyWeight * 0.8;
            System.out.println("A napi fehérje szükségleted: " + proteinIntakeValue + " gramm" );
        } else if (activityLevel == 2) {
            double proteinIntakeValue = bodyWeight * 1.2;
            System.out.println("A napi fehérje szükségleted: " + proteinIntakeValue + " gramm");
        } else if (activityLevel == 3) {
            double proteinIntakeValue = bodyWeight * 2;
            System.out.println("A napi fehérje szükségleted: " + proteinIntakeValue + " gramm");
        } else {
            System.out.println("Érvénytelen aktivitási szintet adott meg.");
        }


    }
}