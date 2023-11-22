import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Get user input for weight
        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();

        // Get user input for height
        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();

        // Calculate BMI
        double bmi = calculateBMI(weight, height);

        // Interpret BMI and display result
        String interpretation = interpretBMI(bmi);
        System.out.println("Your BMI is: " + bmi);
        System.out.println("Interpretation: " + interpretation);

        // Close the scanner
        scanner.close();
    }

    // Method to calculate BMI
    private static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    // Method to interpret BMI
    private static String interpretBMI(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal weight";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}
