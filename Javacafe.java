import java.util.Scanner;
public class Javacafe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Define variables 
				int opt = 0;
				Scanner scannerObj = new Scanner(System.in);
				
				boolean flag = true; 
				
				
				while (flag)
				{
					//Call a Header method 
					PrintHeader();
					Menu(); 
					System.out.println("Please select an option: "); 
					opt = scannerObj.nextInt(); 
					
					if (opt == 1)
					{
						System.out.println(""); 
						Print(); 
					}
					if (opt== 2)
					{
						System.out.println(""); 
						Loops(); 
					}
					if (opt==3)
					{
						System.out.println("");
						Ifelse();
					}
					if (opt== 4)
					{
						System.out.println(""); 
						Logout(); 
						flag = false; 
					}
				}
				scannerObj.close(); 

	}
	public static void PrintHeader()
	{
		System.out.println ("Welcome to JAVA Cafe!!! \n");
		System.out.println("The central learning  pub for all things JAVA!! \n");
		System.out.println("Select any number down below to get started! \n");
		System.out.println("========================================================"); 
		System.out.println("========================================================"); 
	}
	public static void Menu()
	{
		System.out.println("**************************************");
		System.out.println("**          1.Print Statements      **"); 
		System.out.println("**          2.Loops                 **");
		System.out.println("**          3.If-else statments     **");
		System.out.println("**          4.Log Out               **");
		System.out.println("**************************************");
	}
	public static void Print()
	{
		System.out.println ("Output values in JAVA are written as println('').");
		System.out.println ("The user must first write System.out.println.");
		System.out.println ("Anything the user wants to type goes into the double quotes.");
		System.out.println ("-----------------------------------------------------------------------------------------------------\n\n"); 
	}
	public static void Loops()
	{
		System.out.println ("Loops in JAVA Loops can execute a block of code as long as a specified condition is reached.");
		System.out.println ("There are different types of loops. The while loop and for loop.\n");
		System.out.println ("The while loop loops through a block of code as long as a specified condition is true.");
		System.out.println ("Example: while (condition) {//block of code within.} \n\n"); 
		System.out.println ("When you know exactly how many times you want to loop through a block of code, "
				+ "use the for loop instead of a while loop:"); 
		System.out.println ("Example: for (statement 1, 2, or 3) {//code to be executed}");
		System.out.println("--------------------------------------------------------------------------------------------------\n\n");
		
	}
	public static void Ifelse()
	{
		System.out.println("There are 3 conditions that perform different actions.");
        System.out.println("1) The if statement executes the block of code if the condition is true.");
        System.out.println("Example: if (condition) { // block of code to be executed }");
        System.out.println("------------------------------------------------------------------------------------------------------------");

        System.out.println("2) The else statement executes the block of code if the condition is false.");
        System.out.println("Example: if (condition) { // block of code } else { // block of code }");
        System.out.println("------------------------------------------------------------------------------------------------------------");

        System.out.println("3) The else if statement checks for a new condition if the first is false.");
        System.out.println("Example: if (condition1) { // block of code } else if (condition2) { // block of code } else { // block of code }");
        System.out.println("------------------------------------------------------------------------------------------------------------\n\n");
    }
	public static void Logout()
	{
		System.out.print("You have LOGGED OUT! GOODBYE!");
	}
}
