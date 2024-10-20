package NOV.ex_16102024;

import java.util.Scanner;

public class ScannerClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name ");
        String name = scanner.next();

        System.out.println("Enter your age ");
        int age = scanner.nextInt();

        System.out.println("Enter your salary ");
        float salary = scanner.nextFloat();

        System.out.println("******************************");

        System.out.println("Your name is " +name);
        System.out.println("Your age is " +age);
        System.out.println("Your salary is " +salary);


        scanner.close();

    }
}
