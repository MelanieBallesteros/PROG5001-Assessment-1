
/**
 * Write a description of class StudentMarksAnalyzer here.
 * A simple program to compute statistics of students' marks in an assignment that have main method
 * @author (Melanie Ballesteros)
 * @version (11 September 2023)
 */


import java.util.Scanner;


public class StudentMarksAnalyzer
{
   
   
    public static void main (String[] args){
       int[] studentMarks = new int[30];
       int studentCount = 0;
       
       Scanner scanner = new Scanner(System.in); //Create a Scanner object to read input from the user
       System.out.print("Please enter the assignment name: "); //Input the assignment name
       String assignmentName = scanner.nextLine();
       System.out.println("Assignment Name entered is: " + assignmentName);
    
       //Input student marks
       while (studentCount < 30) {
           System.out.print("Enter mark for Student " + (studentCount + 1) + " : ");
           int mark = scanner.nextInt();
           
           //Check if input is a valid mark (between 0 and 30) else error message and ask to enter valid mark 
           if (mark >= 0 && mark <= 30){
               studentMarks[studentCount] = mark;
               studentCount++;
            }
            else {
                System.out.println("Invalid mark input! Mark must be between 0 and 30. Please enter a valid mark.");
                
            }
           }
    
     //Display the entered marks
          System.out.println("Entered marks for students in " + assignmentName);
            for (int i = 0; i < 30; i++){
             System.out.println("Student " + (i + 1) + " : " + studentMarks[i]);
       }
    
    // Find the highest and lowest student marks
        int highestMark = studentMarks[0];
        int lowestMark = studentMarks[0];
    
        for (int i = 1; i < 30; i++){
            if(studentMarks[i] > highestMark){
             highestMark = studentMarks[i];
         }
        
         if(studentMarks[i] < lowestMark){
              lowestMark = studentMarks[i];
         }
       }
    
        //Calculate the mean
        int totalMarks = 0;
            for(int i = 0; i < 30; i++){
            totalMarks += studentMarks[i];
        }
    
            double mean = (double) totalMarks / studentCount;
    
        //Calculate the standard deviation
        double sumSquaredDifferences = 0;
            for (int i = 0; i < 30; i++) {
            double difference = studentMarks[i] - mean;
            sumSquaredDifferences += difference * difference;
        }
    
        double standardDeviation = Math.sqrt(sumSquaredDifferences / studentCount);
     
        
        //Display the entered highest and lowest marks
            System.out.println("Entered highest and lowest mark in " + assignmentName);
            System.out.println("Highest Mark: " + highestMark);
            System.out.println("Lowest Mark: " + lowestMark);
        //Display the mean and standard Deviation
            System.out.println("Mean Mark and Standard Deviation in " + assignmentName);
            System.out.println("Mean Mark: " + mean);
            System.out.println("Standard Deviation: " + standardDeviation);
    
            scanner.close();
    }
}
       
       
       
       
      

