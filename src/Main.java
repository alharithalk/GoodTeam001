import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int num1= scanner.nextInt();
        System.out.print("Enter the 2nd number: ");
        int num2 = scanner.nextInt();
        System.out.println();
// ----------------------------------------------------------------------------------------
        // hk 99 Task one
        int result = Math.abs(num1);
        System.out.println("The absolute number of " + num1 + " is " + result);
// ----------------------------------------------------------------------------------------
        // Square Generation
        int result1 = num1 * num1;
        System.out.println("Square of " + num1 + " is :" + result1);
// ----------------------------------------------------------------------------------------
        // Power Function
        int power = 1;
        for (int i = 1; i <= num1; i++) {
            power = power * num2;
        }
        System.out.println("Power of two numbers = " + power);
// ----------------------------------------------------------------------------------------
        // Calculation using modulus operator
        if (num1 % 2 == 0) {
            System.out.println("Number " + num1 + " is Even");
        } else {
            System.out.println("Number " + num1 + " is Odd");
        }
// ----------------------------------------------------------------------------------------
        //factorial function
        int Function = 1;
        for (int i = 1; i < num1; i++) {
            Function = Function * i;
        }
        System.out.println("Factorial of " + num1 + " is " + Function);
        scanner.close();
    }
}
