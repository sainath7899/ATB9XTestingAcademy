package NOV.ex_18102024;

import java.util.Scanner;

public class Lab001_SwitchStatemtsCalculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the num1 value");
        long num1 = scan.nextLong();

        System.out.println("Enter the num2 value");
        long num2 = scan.nextLong();

        long add = num1+num2;
        long sub = num1-num2;
        long mul = num1*num2;
        long div = num1/num2;
        long mod = num1%num2;

        System.out.println(add);



    }


}




