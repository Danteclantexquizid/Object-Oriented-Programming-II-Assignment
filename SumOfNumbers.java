//sum of two integers
//Danson Njenga Wambui
//ADM:CT101/G/20010/23
//Question:2
//This is a java code that combines the sum of two numbers

//Allows the use of a scanner
import java.util.Scanner;

public class SumOfNumbers {
        public static void main(String[] args) {
            // Create a Scanner object for user input
            Scanner scanner = new Scanner(System.in);

            // Asks the user to enter the first number
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();

            // Asks the user to enter the second number
            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            // Calculate the sum of the two numbers
            int sum = num1 + num2;

            // Displays the result of num1 + num2
            System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

            // you can deside to close the scanner but its optional but it's better to do so
            scanner.close();
        }
}


