import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Square Generation
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        int result = num * num;
        System.out.println("Result: " + result);

        // Power Function
        System.out.println("Enter base number: ");
        int base = input.nextInt();
        System.out.println("Enter exponent: ");
        int exponent = input.nextInt();
        int power = 1;
        for (int i = 1; i <= exponent; i++) {
            power = power * base;
        }
        System.out.println("Result: " + power);
        }


}
