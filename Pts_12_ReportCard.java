package Practise.Condition_Statement;

import java.util.Scanner;

public class Pts_12_ReportCard {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your full name : ");
        String userName = input.nextLine();
        System.out.print("Enter your Roll number : ");
        int userRollNo = input.nextInt();

        System.out.print("Enter your marks of Physics : ");
        float userPhysicMark = input.nextInt();
        System.out.print("Enter your marks of Chemistry : ");
        float userChemistryMark = input.nextInt();
        System.out.print("Enter your marks of Computer Application : ");
        float userComputerMark = input.nextInt();
        System.out.println("-----------------------------------------");
        System.out.println("REPORT CARD");
        System.out.println("Roll Number : " + userRollNo);
        System.out.println("Name of student : " + userName);
        System.out.println("Marks in chemistry : " + userChemistryMark);
        System.out.println("Marks in physics : " + userPhysicMark);
        System.out.println("Marks in Computer Application : " + userComputerMark);
        float total = userChemistryMark + userComputerMark + userPhysicMark;
        System.out.println("Total marks : " + total);
        float percentage = ((float)100/300)*total;
        System.out.printf("Percentage: %.2f%%\n", percentage);
        if (percentage >= 60) {
            System.out.println("First Division ");
        } else {
            System.out.println("Second Division ");
        }
        input.close();
    }
}
