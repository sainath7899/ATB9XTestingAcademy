package NOV.ex_17102024;

import java.util.Scanner;

public class Lab002_If_Even_Odd_Number {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();

        if(num%2==0) {
            System.out.println("The number is even");
        }
        else
            System.out.println("Number is odd");

        scan.close();
    }
}
