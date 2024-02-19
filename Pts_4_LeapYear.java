package Practise.Condition_Statement;
import java.util.Scanner;
public class Pts_4_LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year : ");
        int inputYear = input.nextInt();
        if (inputYear%4==0){
            System.out.println(inputYear+ " it is a leap year");
        }
        else{
            System.out.println(inputYear+" in not a leap year");
        }
    }
}
