import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter Second number: ");
        int num2 = sc.nextInt();

        if (num1 > num2){
            System.out.print("Number 1 is larger");
        }
        else{
            System.out.print("Number 2 is larger");
        }

        sc.close();

    }
}
