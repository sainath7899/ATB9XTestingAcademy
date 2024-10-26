package NOV.ex_17102024;

import java.util.Scanner;

public class Lab001_If_Statements {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age :)");
        int age = scan.nextInt();

        if(age>18) {
            System.out.println("Eligible for Voting!");
        }
        else
            System.out.println("You're not eligible because you're under 18");

        scan.close();
    }
}
