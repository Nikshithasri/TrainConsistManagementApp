import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class TrainValidationApp {

    // Method to validate Train ID
    public static boolean isValidTrainId(String trainId) {
        String trainRegex = "TRN-\\d{4}";
        Pattern pattern = Pattern.compile(trainRegex);
        Matcher matcher = pattern.matcher(trainId);
        return matcher.matches();
    }

    // Method to validate Cargo Code
    public static boolean isValidCargoCode(String cargoCode) {
        String cargoRegex = "PET-[A-Z]{2}";
        Pattern pattern = Pattern.compile(cargoRegex);
        Matcher matcher = pattern.matcher(cargoCode);
        return matcher.matches();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter Train ID: ");
        String trainId = sc.nextLine();

        System.out.print("Enter Cargo Code: ");
        String cargoCode = sc.nextLine();

        // Validation
        boolean trainValid = isValidTrainId(trainId);
        boolean cargoValid = isValidCargoCode(cargoCode);

        // Output
        if (trainValid) {
            System.out.println("Train ID is VALID ✅");
        } else {
            System.out.println("Train ID is INVALID ❌");
        }

        if (cargoValid) {
            System.out.println("Cargo Code is VALID ✅");
        } else {
            System.out.println("Cargo Code is INVALID ❌");
        }

        sc.close();
    }
}