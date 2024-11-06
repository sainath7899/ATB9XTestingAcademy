package NOV.ex_17102024;

import java.util.Scanner;

public class Lab005_Triangle_Classifier {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter triangle side1");
        double side1 = scan.nextDouble();

        System.out.println("Enter triangle side2");
        double side2 = scan.nextDouble();

        System.out.println("Enter triangle side3");
        double side3 = scan.nextDouble();

        if(side1==side2 && side2==side3 && side1==side3){
            System.out.println("The given triangle is Equilatteral Triangle");
        } else if (side1 == side2 || side2 == side3 || side1==side3) {
            System.out.println("The given triangle is Isosceles Triangle");
        } else if(side1<=0 || side2<=0 || side3<=0){
            System.out.println("Invalid Input: Side length must be positive");
        }else
            System.out.println("The triangle is Scalene");

        scan.close();

    }
}
