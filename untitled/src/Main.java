//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter Second number: ");
        int num2 = sc.nextInt();

        int result = num1 + num2;
        System.out.println("Add: "+ result);

        int result1 = num1 - num2;
        System.out.println("Sub: "+ result1);

        int result2 = num1 * num2;
        System.out.println("Mul: "+ result2);

        float result3 = (float)num1 / (float)num2;
        System.out.println("Div: "+ result3);

        sc.close();

    }
}







