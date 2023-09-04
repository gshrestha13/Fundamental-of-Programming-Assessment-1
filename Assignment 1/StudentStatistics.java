
/**
 * Write a description of class StudentStatistics here.
 *
 * @author (Gagan Shrestha)
 * @student id number (24253736)
 * @version (04/09/2023)
 */
import java.util.Scanner;
public class StudentStatistics{
    public static void main(String[] args){
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        // Functional Requirement 1 (F1): Input Assignment Name
        //Step 1: Display a prompt to the user to input the assignment name
        System.out.print("Enter the assignment name: ");
        //Step 2: Read and store the assignment name input from the user.
        String assignmentName = scanner.nextLine();
        //Display the assignment name.
        System.out.println("Assignment Name: " + assignmentName);
        
        //close the scanner.
        scanner.close();
    
    }
}
