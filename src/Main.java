import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // hk 99 Task one
        System.out.print("enter  num: ");
        int num1=input.nextInt();
        int result= Math.abs(num1);

        System.out.println("result = "+result);

        input.close();



        }
    }
