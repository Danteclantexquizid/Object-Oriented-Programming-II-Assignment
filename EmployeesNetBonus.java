//Hello world
//Danson Njenga Wambui
//ADM:CT101/G/20010/23
//QUESTION :3
//This is java code that helps you evaluate an employees net bonus

//Allows the use of a scanner
import java.util.Scanner;

public class EmployeesNetBonus {
    public static void main(String[] args) {
        // Step 1: Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Step 2:enter your salary
        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();
        //step 3:enter years of service
        System.out.print("Enter your years of service: ");
        int yearsOfService = scanner.nextInt();

        // Step 4: An else if and if statements used to determine the bonus percentage based on the years of service
        double bonusPercentage;
        if (yearsOfService > 10) {
            bonusPercentage = 0.12;
        } else if (yearsOfService >= 6 && yearsOfService <= 10) {
            bonusPercentage = 0.10;
        } else {
            bonusPercentage = 0.08;
        }

        // Step 5: Calculate the bonus amount
        double bonusAmount = salary * bonusPercentage;

        // Step 6: Print out the net bonus amount
        System.out.println("Net Bonus Amount: " + bonusAmount);
        //you can deside to close the scanner but its optional but it's better to do so
        scanner.close();
    }
}
