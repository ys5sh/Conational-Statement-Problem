package Practise.Condition_Statement;

import java.util.Scanner;
public class Pts_9_CoordinateXY {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Y value : ");
        float userYInput = input.nextFloat();
        System.out.print("Enter the X value : ");
        float userXInput = input.nextFloat();
        if (userYInput > 0 && userXInput>0) {
            System.out.println("The coordinate point (" + userYInput + "," + userXInput + ") lies in the First quadrant");
        }
        else if (userXInput<0 && userYInput>0) {
            System.out.println("The coordinate point (" + userYInput + "," + userXInput + ") lies in the Second quadrant");
        }
        else if (userXInput<0 && userYInput<0) {
            System.out.println("The coordinate point (" + userYInput + "," + userXInput + ") lies in the Third quadrant");
        }
        else {
            System.out.println("The coordinate point (" + userYInput + "," + userXInput + ") lies in the Forth quadrant");
        }

    }
}
