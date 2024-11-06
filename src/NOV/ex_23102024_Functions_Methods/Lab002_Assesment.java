package NOV.ex_23102024_Functions_Methods;

import java.util.Scanner;

public class Lab002_Assesment {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = scan.nextInt();

        System.out.println("Enter the value of b");
        int b = scan.nextInt();


        int add = add(a,b);
        System.out.println("The addition of value a and b is: "+add);

        int sub = sub(a,b);
        System.out.println("The substraction of value a and b is: "+sub);

        int mul = mul(a,b);
        System.out.println("The multiplication of value a and b is: "+mul);

        int div = div(a,b);
        System.out.println("The division of value a and b is: "+div);

        scan.close();


    }

        static int add(int a,int b) {
            return a + b;
        }
        static int sub(int a, int b) {
            return a-b;
        }

        static int mul(int a, int b) {
           return a*b;
        }

        static int div(int a, int b) {
           return a/b;
        }




}
