import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number");
        int num1 = input.nextInt();
        System.out.println("Enter the 2nd number");
        int num2 = input.nextInt();

        //factorial function
        int Function = 1;
        for (int i = 1;i < num1;i++){
            Function = Function * i;
        }
        System.out.println("Factorial of " + num1 + " is :" + Function);


    }
}

