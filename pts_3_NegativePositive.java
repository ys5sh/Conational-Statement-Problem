package Practise.Condition_Statement;

import java.util.Scanner;

public class pts_3_NegativePositive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int inputNumber = input.nextInt();
        if (inputNumber>0){
            System.out.println(inputNumber+ " number is positive");
        }
        else {
            System.out.println(inputNumber+" number is negative");
        }
    }
}
