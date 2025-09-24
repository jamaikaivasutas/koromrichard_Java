import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("A pontszamod: ");
        int score = scn.nextInt();

        if(100 >= score && score >= 85) {
            System.out.println("Az erdemnjegyed: Jeles (5)");
        } else if (84 >= score && score >= 70) {
            System.out.println("Az erdemjegyed: Jo (4)");
        } else if (69 >= score && score >= 55) {
            System.out.println("Az erdemjegyed: Kozepes (3)");
        } else if (54 >= score && score >= 40) {
            System.out.println("Az erdemjegyed: Elegseges (2)");
        } else if (39 >= score && score >= 0) {
            System.out.println("Az erdemjegyed: Elegtelen (1)");
        } else {
            System.out.println("Ervenytelen ertek!");
        }
    }
}