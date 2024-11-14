/*

Input: Take marks obtained (out of 100) in each subject.

Calculate Total Marks: Sum up the marks obtained in all subjects.

Calculate Average Percentage: Divide the total marks by the total number of subjects to get the average percentage.

Grade Calculation: Assign grades based on the average percentage achieved. 

Display Results: Show the total marks, average percentage, and the corresponding grade to the user.

*/

import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("::::::: INPUTS :::::::");
        System.out.println(" ");
        System.out.print("ENTER THE NUMBER OF SUBJECT : ");
        
        int numberOfSubject = sc.nextInt();
        System.out.println(" ");

        System.out.println("             ENTER THE NAME OF SUBJECTS ");

        String[] subjectName = new String[numberOfSubject];
        int[] marks = new int[numberOfSubject];
        int totalObtainedMarks = 0;
        sc.nextLine();
        for(int i=0;i<numberOfSubject;i++){
            System.out.println(" ");
            System.out.print("ENTER THE NAME OF SUBJECT "+(i+1)+" : ");
            subjectName[i] = sc.nextLine();

            System.out.print("ENTER THE MARKS OBTAINED IN SUBJECT "+(i+1)+" : ");
            marks[i]=sc.nextInt();
            sc.nextLine();
            System.out.println(" ");

            if(marks[i] < 0 || marks[i] > 100){
                System.out.println("     Invalid Input");
            }
            else{
                totalObtainedMarks = totalObtainedMarks + marks[i];
            }
        }
        double percentage = (double)(totalObtainedMarks / numberOfSubject);

        String grade;

        if(percentage >= 90){
            grade = "A";
        }
        else if (percentage >= 80) {
            grade = "B";            
        }
        else if(percentage >= 70){
            grade = "C";
        }
        else if(percentage >= 60){
            grade = "D";
        }
        else if(percentage >= 50){
            grade = "E";
        }
        else{
            grade = "F";
        }

        System.out.println(":::::::  MARKSHEET  :::::::");
        System.out.println(" ");
        System.out.println(" ");

        for(int i=0; i<numberOfSubject; i++){
            System.out.println(subjectName[i]+" : "+marks[i]);
        }
        System.out.println(" ");
        System.out.println(" ");

        System.out.println("Total Obtained Marks : "+totalObtainedMarks);
        System.out.println(" ");
        System.out.println("Percentage : "+percentage+" %");
        System.out.println(" ");
        System.out.println("GRADE : "+grade);
        sc.close();
    }
}
