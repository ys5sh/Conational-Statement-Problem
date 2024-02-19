package Practise.Condition_Statement;

import java.util.Scanner;

public class Pts_10_Admission {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Check your eligibility for admission to a professional course");
        System.out.print("Enter your Maths : ");
        float userMathsMarks = input.nextFloat();
        System.out.print("Enter your Physics : ");
        float userPhysicsMarks = input.nextFloat();
        System.out.print("Enter your Chemistry : ");
        float userChemistryMarks = input.nextFloat();
        float totalAll = userMathsMarks + userChemistryMarks + userPhysicsMarks;
        float totalMathsPhysics = userMathsMarks + userPhysicsMarks;
        if (userMathsMarks >= 65 && userChemistryMarks >= 50 && userPhysicsMarks >= 55) {
            if (totalAll >= 190) {
                System.out.println("The candidate is eligible for admission");
                System.out.println("Total marks obtain by candidate in Maths, Physic & Chemistry is " + totalAll);
            } else if (totalMathsPhysics >= 140) {
                System.out.println("The candidate is eligible for admission");
                System.out.println("Total marks obtain by candidate in Maths & physic is " + totalMathsPhysics);
            }
        } else {
            System.out.println("Candidate is not eligible for admission");
            System.out.println("Total marks obtain by candidate in Maths, Physic & Chemistry is " + totalAll);
            System.out.println("Total marks obtain by candidate in Maths & physic is " + totalMathsPhysics);
        }
    }
}
