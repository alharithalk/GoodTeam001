import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        // hk 99 Task one
        System.out.print("enter  num: ");
        int num1=scanner.nextInt();
        int result= Math.abs(num1);

        System.out.println("result = "+result);





        System.out.print("Enter a number: ");
        int inputNumber = scanner.nextInt();


        System.out.println("Enter the first number");
        int num11 = scanner.nextInt();
        System.out.println("Enter the 2nd number");
        int num2 = scanner.nextInt();

        // Square Generation
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        int result1 = num * num;
        System.out.println("Square of "+ num + " is :" + result1);

        // Calculation using modulus operator
        if (inputNumber % 2 == 0) {
            System.out.println("Result: Even");
        } else {
            System.out.println("Result: Odd");
        }

        //factorial function
        int Function = 1;
        for (int i = 1;i < num11;i++){
            Function = Function * i;
        }
        System.out.println("Factorial of " + num11 + " is :" + Function);

        scanner.close();
    }
}


