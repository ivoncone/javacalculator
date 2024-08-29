//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ivonne's calculator");
        System.out.println(("=================="));

        System.out.println("Enter number: (x)");
        double firstNumber = scanner.nextDouble();

        System.out.println("Enter operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        System.out.print("Enter number (y)");
        double secondNumber = scanner.nextDouble();

        double result;

        switch (operation) {
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            case '/':
                if (secondNumber != 0) {
                    result = firstNumber / secondNumber;
                } else {
                    System.out.println("Division by zero not allowed");
                    return;
                }
                break;
            default:
                System.out.println("Error: Invalid operation");
                return;
        }
        System.out.println("Result: " + result);
    }
}

