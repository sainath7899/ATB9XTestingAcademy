package NOV.ex_17102024;

import java.util.Scanner;

public class Lab005_Triangle_Classifier {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter triangle side1");
        int side1 = scan.nextInt();

        System.out.println("Enter triangle side2");
        int side2 = scan.nextInt();

        System.out.println("Enter triangle side3");
        int side3 = scan.nextInt();

        if(side1==side2 && side2==side3){
            System.out.println("The given triangle is Equilatteral Triangle");
        } else if (side1 == side2 || side2 == side3) {
            System.out.println("The given triangle is Isosceles Triangle");
        } else
            System.out.println("The triangle is Scalene");

        scan.close();

    }
}
