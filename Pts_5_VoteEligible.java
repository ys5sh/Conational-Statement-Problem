package Practise.Condition_Statement;
import java.util.Scanner;
public class Pts_5_VoteEligible {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int inputAge = input.nextInt();
        if (inputAge>18){
            System.out.println("Congratulation! You are eligible for casting your vote");
        }
        else {
            System.out.println("You are not eligible for casting your vote");
        }
    }
}
