import java.util.Scanner;

public class primaNyeremenyjatek {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.print("Add meg a csoki gyartasi sorszamat: ");
        int chocolateNumber = scn.nextInt();

        boolean isPrime = true;

        for (int i = 2; i < chocolateNumber; i++) {
            if (chocolateNumber % i == 0){
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Gratulálok nyertél!");
        } else {
            System.out.println("Sajnos nem nyert!");
        }
    }
}
