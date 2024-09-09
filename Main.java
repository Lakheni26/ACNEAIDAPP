import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Ask for acne area
        System.out.println("Enter acne area (forehead, cheeks, chin): ");
        String acneArea = scanner.nextLine();

        // Ask for water intake
        System.out.println("Enter daily water intake in liters: ");
        int waterIntake = scanner.nextInt();

        // Ask for face wash times
        System.out.println("How many times do you wash your face per day? ");
        int faceWashTimes = scanner.nextInt();

        // Create AcneAid object
        AcneAid acneAid = new AcneAid(acneArea, waterIntake, faceWashTimes);

        // Get and display antibiotic recommendation
        String recommendation = acneAid.recommendAntibiotic();
        System.out.println(recommendation);

        // Close the scanner
        scanner.close();
    }
}
