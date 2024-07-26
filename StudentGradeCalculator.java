import java.util.Scanner;
public class StudentGradeCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Welcome to the student grade calculator.");
        System.out.println("This calculator will calculate your total marks obtained in all subjects, average percentage and assign grades based on the average percentage.");
        System.out.println("Enter the number of subjects : ");
        int subjects = scan.nextInt();

        int sumOfSubjects = 0;

        for(int i = 0; i < subjects; i++) {
            System.out.println("Enter your marks obtained in subject " + (i+1) + " out of 100 : ");
            int marks = scan.nextInt();
            sumOfSubjects += marks;
        }

        System.out.println("Your total marks obtained in " + (subjects) + " subjects is : " + sumOfSubjects);
        
        float averagePercentage;
        averagePercentage = (sumOfSubjects/(float)subjects);
        System.out.println("Your average percentage is : " + averagePercentage + "%");

        if (averagePercentage >= 90 && averagePercentage <= 100) {
            System.out.println("The grade assigned is : A ");
        } else if (averagePercentage >= 80 && averagePercentage <= 90) {
            System.out.println("The grade assigned is : B ");
        } else if (averagePercentage >= 70 && averagePercentage <= 80) {
            System.out.println("The grade assigned is : C ");
        } else if (averagePercentage >= 60 && averagePercentage <= 70) {
            System.out.println("The grade assigned is : D ");
        } else if (averagePercentage >= 50 && averagePercentage <= 60) {
            System.out.println("The grade assigned is : E ");
        } else {
            System.out.println("The grade assigned is :  F");
        }
        
        scan.close();
    }
}