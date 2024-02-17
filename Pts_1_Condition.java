/* Que Write a program to accept two integers and check whether they are equal or not.
Test Data : 15 15
Expected Output :
Number1 and Number2 are equal */

package Practise.Condition_Statement;

import java.util.Scanner;

public class Pts_1_Condition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st Integer : ");
        int firstInteger = input.nextInt();
        System.out.print("Enter 2nd Integer : ");
        int secondInteger = input.nextInt();
        if (firstInteger == secondInteger) {
            System.out.println(firstInteger + " & " + secondInteger + " are equal integer");
        } else {
            System.out.println("Not equal !");
        }
    }
}






