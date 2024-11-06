package NOV.ex_21102024_Loop;

public class Lab003_do_while_Loop {

    public static void main(String[] args) {

        int i=1;
        do{
            System.out.println("Starting the Program "+i);
            i++;
        }
        while(i<=10);

      // For loop condition
        for(int j=1; j<=10; j++) {
            System.out.println("printing the values of "+j);
        }

        // While loop condition
        int k=0;
        while(k<=10) {
            System.out.println("the value of k is "+k);
            k++;
        }

        // do while loop condition
          int x=10;
          do{
              System.out.println("the value of l is " +x);
              --x;
          }
          while(x>0);

    }
}



