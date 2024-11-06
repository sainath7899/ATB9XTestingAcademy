package NOV.ex_23102024_Functions_Methods;

public class Lab001 {
    public static void main(String[] args) {
         invite();

         greet(26, "Navneet");

         // Return Method
        String return_Values =  main();
        System.out.println(return_Values);

        if(return_Values == "Sainath1") {
            System.out.println("Har Har Magadev");
        } else {
            System.out.println("Ending the loop");
        }

        // Return with Arguements
          int submit_return = Submit(24, 26);
        System.out.println(submit_return);


    }

    // Method without return type and without arguements

     static void invite() {
         System.out.println("Hello world!");
     }

     // Method without return type and with arguements

        static void greet(int age, String name) {
            System.out.println("The age of the person is " +age);
            System.out.println("The name of the person is " +name);
        }

        // Method with return type and without arguements

              static String main() {
                  //System.out.println("Returning the Values");
                  return "Sainath";

              }

        // Method with return type and with arguements.

              static int Submit(int age1, int age2) {
               //   System.out.println("the age1 is " +age1);
               //   System.out.println("the age2 is " +age2);
                   return age1+age2;
              }






}

