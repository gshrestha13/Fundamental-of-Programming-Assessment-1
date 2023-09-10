
/**
 * Below written code is a simple program that displays assignment name (what user inputs), shows error when user enters invalid input,prints highest
 * and lowest marks based on the values provided and also calulates mean and standard deviation.
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
                
                if (mark<0||mark>30){
                    System.out.println("Invalid Input. Mark must be between 0 and 30.");
                }
                //Check if the input is a valid number between 0 and 30. 
            }while (mark<0 || mark>30);
            //Add the valid mark to the list of marks.
            studentMarks.add(mark);
        }
        //Functional Requirement 4, Display the assignment name & Students' Mark 
        System.out.println("Assignment Name: " + assignmentName);
        System.out.println("Students' Marks");
        for(int i=0; i<studentMarks.size(); i++){
            System.out.println("Student "+ (i+1)+": "+ studentMarks.get(i));
        }
        //Functional Requirement 5 : Print Highest and Lowest Marks
        //Initialize variables highest_mark and lowest_mark to 0.
        int highestMark = studentMarks.get(0);
        int lowestMark = studentMarks.get(0);
        for(int mark : studentMarks){
            //If the current mark is greater than highest_mark, update the highest_mark with the current mark.
            if(mark > highestMark){
                highestMark = mark;
            }
            //If the current mark is greater than highest_mark, update the highest_mark with the current mark.
            if(mark < lowestMark){
                lowestMark = mark;
            }
        }
        //Print the highest and lowest mark on the screen.
        System.out.println("The Highest mark is: "+ highestMark);
        System.out.println("The Lowest Mark is: "+ lowestMark);
        
        //Functional Requirement 6 : Calculate Mean and Standard Deviation
        //Initialize variables sum_of_marks, squared_sum_of_marks, and count to 0.
        int sumOfMarks= 0;
        int squaredSumOfMarks = 0;
        for (int mark : studentMarks){
            int squaredMark = mark * mark;
            //Increment count by 1 and add the current mark to sum_of_marks
            sumOfMarks += mark;
            //add the square of the current mark to squared_sum_of_marks
            squaredSumOfMarks += squaredMark;
        }
        //Calculate the Mean as sum_of_marks divided by count.
        double mean = (double)sumOfMarks/studentMarks.size();
        //Calculate Variance
        double variance = (double) squaredSumOfMarks/studentMarks.size()-(mean*mean);
        //Calculate Standard Deviation
        double standardDeviation = Math.sqrt(variance);
        //Print Mean and Standard Deviation on the screen.
        System.out.println("Mean: "+ mean);
        System.out.println("Standard Deviation: "+ standardDeviation);
        //close the scanner.
        scanner.close();
    
    }
}
