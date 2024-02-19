/*
 Write a program to check whether a given number is even or odd.
Test Data : 15
Expected Output :
15 is an odd integer
 */
package Practise.Condition_Statement;

import java.util.Scanner;

public class pts_2_EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = input.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " is even number");
        } else {
            System.out.println(number + " is odd number");
        }
        input.close();

    }
}
