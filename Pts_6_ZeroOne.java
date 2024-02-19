package Practise.Condition_Statement;

import java.util.Scanner;

public class Pts_6_ZeroOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int m = input.nextInt();
        if (m > 0)
            System.out.println("The value of n = 0");
        else
            System.out.println("The value of n = -1");
    }
}
