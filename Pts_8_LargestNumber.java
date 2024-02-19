package Practise.Condition_Statement;

import java.util.Scanner;

public class Pts_8_LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the 1st number : ");
        int userFirstNumber = input.nextInt();
        System.out.print("Enter the 2nd number : ");
        int userSecondNumber = input.nextInt();
        System.out.print("Enter the 3rd number : ");
        int userThirdNumber = input.nextInt();
        if (userFirstNumber > userSecondNumber && userFirstNumber > userThirdNumber) {
            System.out.println("1st number = " + userFirstNumber);
            if (userSecondNumber > userThirdNumber) {
                System.out.println("2nd number = " + userSecondNumber);
                System.out.println("3rd number = "+userThirdNumber);
            }
                else{
                    System.out.println("2nd number = " + userThirdNumber);
                    System.out.println("3rd number = " + userSecondNumber);
                }
        } else if (userSecondNumber>userThirdNumber) {
            System.out.println("1st number = "+userSecondNumber);
            System.out.println("2nd number = "+userThirdNumber);
            System.out.println("3rd number = "+userFirstNumber);
        }
        else {
            System.out.println("1st number = "+userThirdNumber);
            System.out.println("2nd number = "+userSecondNumber);
            System.out.println("3rd number = "+userFirstNumber);
        }
    }
}
