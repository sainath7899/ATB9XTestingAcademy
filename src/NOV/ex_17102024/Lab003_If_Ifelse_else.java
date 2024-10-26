package NOV.ex_17102024;

import java.util.Scanner;

public class Lab003_If_Ifelse_else {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1 = scan.nextInt();

        System.out.println("Enter num2");
        int num2 = scan.nextInt();

        if(num1>num2) {
            System.out.println("number1 is greater than number 2");
        }
        else if(num2>num1) {
            System.out.println("number2 is greater than number 1");
        } else
            System.out.println("Equal number");

              scan.close();
    }

}
