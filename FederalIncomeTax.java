import java.util.Scanner;
import java.text.NumberFormat;

public class FederalIncomeTax {

    public static void main(String[] args) {
        // Step 1: Introduce the program to the user
        introduceProgram();

        // Step 2: Get the user's category
        String category = getCategory();

        // Step 3: Get the user's taxable income
        double taxableIncome = getTaxableIncome();

        // Step 4: Calculate the tax based on category and taxable income
        double tax = calculateTax(category, taxableIncome);

        // Step 5: Display the results
        displayResults(category, taxableIncome, tax);
    }

    // 1. Introduce the program
    public static void introduceProgram() {
        System.out.println("Welcome to the 1988 Federal Income Tax Calculator.");
        System.out.println("This program will help you calculate your tax based on your category and taxable income.");
    }

    // 2. Get the user's category
    public static String getCategory() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please select your tax category:");
        System.out.println("1. Single");
        System.out.println("2. Head of Household");
        System.out.println("3. Married, Joint");
        System.out.println("4. Married, Separate");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                return "Single";
            case 2:
                return "Head of Household";
            case 3:
                return "Married, Joint";
            case 4:
                return "Married, Separate";
            default:
                System.out.println("Invalid choice. Defaulting to Single.");
                return "Single";
        }
    }

    // 3. Get the user's taxable income
    public static double getTaxableIncome() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your taxable income: ");
        return scanner.nextDouble();
    }

    // 4. Calculate the tax
    public static double calculateTax(String category, double taxableIncome) {
        double tax = 0;
        double baseAmount = 0;
        double rate = 0.15;
        double threshold = 0;

        switch (category) {
            case "Single":
                baseAmount = 17850;
                threshold = 17850;
                rate = 0.15;
                break;
            case "Head of Household":
                baseAmount = 23900;
                threshold = 23900;
                rate = 0.15;
                break;
            case "Married, Joint":
                baseAmount = 29750;
                threshold = 29750;
                rate = 0.15;
                break;
            case "Married, Separate":
                baseAmount = 14875;
                threshold = 14875;
                rate = 0.15;
                break;
        }

        if (taxableIncome <= threshold) {
            tax = taxableIncome * rate;
        } else {
            tax = baseAmount * rate + (taxableIncome - threshold) * 0.28;
        }

        return tax;
    }

    // 5. Display the results
    public static void displayResults(String category, double taxableIncome, double tax) {
        double netIncome = taxableIncome - tax;

        // Format the tax, income, and net income in currency format
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();

        System.out.println("\nTax Information:");
        System.out.println("Category: " + category);
        System.out.println("Taxable Income: " + currencyFormat.format(taxableIncome));
        System.out.println("Calculated Tax: " + currencyFormat.format(tax));
        System.out.println("Net Income: " + currencyFormat.format(netIncome));
    }
}
