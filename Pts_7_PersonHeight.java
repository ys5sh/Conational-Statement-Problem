package Practise.Condition_Statement;

import java.util.Scanner;

public class Pts_7_PersonHeight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Height : ");
        float userHeight = input.nextInt();
        if (userHeight >= 198.12)
            System.out.println("The person is Giant");
        else if (userHeight >= 180.34 && userHeight <= 198.12)
            System.out.println("The person is tall");
        else if (userHeight >= 170.18 && userHeight <= 180.34)
            System.out.println("The person is average");
        else if (userHeight >= 163.32 && userHeight <= 170.18)
            System.out.println("The person is short");
        else if (userHeight >= 158.75 && userHeight <= 170.18)
            System.out.println("The person is very short");
        else if (userHeight >= 152.4 && userHeight <= 158.75)
            System.out.println("The person is midget");
        else
            System.out.println("The person is dwarf");
    }
}
