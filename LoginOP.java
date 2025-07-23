package secure;

import java.util.Scanner;

public class LoginOP {

    public static void main(String[] args) {
        
        Scanner scannerOBJ = new Scanner(System.in);
        boolean working = true;
        //Small menu with two options for the user to login or exit the 
        while (working) {
            // Display the menu
            System.out.println("Welcome!");
            System.out.println("  Menu ");
            System.out.println("**********");
            System.out.println("1. Login");
            System.out.println("2. Exit");
            System.out.println("Please pick option 1 or 2: ");

            String choice = scannerOBJ.nextLine();
            
        	// switch function to display outputs based on the user option from the previous menu
            switch (choice) {
                case "1":
                    // Ask the user for the first and last name with bith year
                    System.out.println("Please enter your first name: ");
                    String firstname = scannerOBJ.nextLine();

                    System.out.println("Please enter your last name: ");
                    String lastname = scannerOBJ.nextLine();

                    System.out.println("Enter your birth year: ");
                    String birthYear = scannerOBJ.nextLine();

                    if (birthYear.length() != 4) {
                        System.out.println("Invalid birth year.");
                        break;
                    }

                 // Create the ID name by combining the first letter of the first name + the last name
                    String idname = "" + firstname.charAt(0) + lastname.charAt(0) + birthYear.substring(2);
                    System.out.println("Generated User ID: " + idname.toUpperCase());

                  //User create his own password with conditions (8 UPPERCASE letters)
                    System.out.println("Please enter your Password (8 UPPERCASE letters): ");
                    String password = scannerOBJ.nextLine();

                  //This section checks if the password is valid or not and prints an output based on the result
                    if (password.length() == 8 && password.equals(password.toUpperCase())) {
                        System.out.println("Password is valid and has been created.\n");
                    } else {
                        System.out.println("Password is invalid.\n");
                    }
                    break;

                case "2":
                    System.out.println("Exiting program. Goodbye!");
                    working = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please choose 1 or 2.");
                    break;
            }
        }

        scannerOBJ.close();
    }
}
