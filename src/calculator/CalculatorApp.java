// CalculatorApp.java
package calculator;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Context context = new Context();

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Choose operation (+, -, *, /): ");
        String operation = scanner.next();

        switch (operation) {
            case "+":
                context.setStrategy(new ConcreteStrategyAdd());
                break;
            case "-":
                context.setStrategy(new ConcreteStrategySubtract());
                break;
            case "*":
                context.setStrategy(new ConcreteStrategyMultiply());
                break;
            case "/":
                context.setStrategy(new ConcreteStrategyDivide());
                break;
            default:
                System.out.println("Invalid operation.");
                scanner.close();
                return;
        }

        double result = context.executeStrategy(num1, num2);
        System.out.println("Result: " + result);

        scanner.close();
    }
}
