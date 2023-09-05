
/**
 * Write a description of class StudentStatistics here.
 *
 * @author (Gagan Shrestha)
 * @student id number (24253736)
 * @version (04/09/2023)
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class StudentStatistics{
    public static void main(String[] args){
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        List<Integer> studentMarks = new ArrayList<>();
        
        // Functional Requirement 1 (F1): Input Assignment Name
        // Display a prompt to the user to input the assignment name
        System.out.print("Enter the assignment name: ");
        // Read and store the assignment name input from the user.
        String assignmentName = scanner.nextLine();
        
        //Functional Requirement 2 (F2): Input Students' Marks
        //Start loop for students
        for(int i=0;i<30;i++){
            int mark;
            do{
                //Display a prompt to the user to input the mark for the current student.
                System.out.print("Enter mark for student " + (i+1)+": ");
                
                //Read and validate the input mark
                while (!scanner.hasNextInt()){
                    System.out.println("Invalid input. Please enter a number.");
                    scanner.next();//Consume the invalid input
                }
                mark = scanner.nextInt();
                //Check if the input is a valid number between 0 and 30. 
            }while (mark<0 || mark>30);
            //Add the valid mark to the list of marks.
            studentMarks.add(mark);
        }
        //Display the assignment name & Students' Mark 
        System.out.println("Assignment Name: " + assignmentName);
        System.out.println("Students' Marks");
        for(int i=0; i<studentMarks.size(); i++){
            System.out.println("Student "+ (i+1)+": "+ studentMarks.get(i));
        }        //close the scanner.
        scanner.close();
    
    }
}
