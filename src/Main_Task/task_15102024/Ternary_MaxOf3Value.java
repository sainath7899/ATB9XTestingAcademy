package Main_Task.task_15102024;

public class Ternary_MaxOf3Value {

    public static void main(String[] args) {
         int a=120;
         int b=180;
         int c=90;
         int max_value = (a>b && a>c)?a:(b>a && b>c)?b:c;
        System.out.println(max_value);

        int max_values = (a>=b && a>=c)?a:(b>=c?b:c);
        System.out.println(max_values);
    }
}
