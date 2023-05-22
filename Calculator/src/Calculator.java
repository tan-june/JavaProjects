import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void run() {
        System.out.println();
        System.out.println();
        System.out.println("Welcome to the Java Calculator! We can perform 5 operations!");
        System.out.println("    1) Addition: + ");
        System.out.println("    2) Subtraction: - ");
        System.out.println("    3) Multiplication: * ");
        System.out.println("    4) Division: / ");
        System.out.println("    5) Exponent: ^ ");
        System.out.println();

        System.out.print("Please enter the first operand: ");
        double operand1 = getNumber();
        System.out.print("Please enter operator: ");
        String operator = getOperator();
        System.out.print("Please enter the second operand: ");
        double operand2 = getNumber();

        switch (operator) {
            case "+" -> System.out.println("The answer is: " + (operand1 + operand2));
            case "-" -> System.out.println("The answer is: " + (operand1 - operand2));
            case "*" -> System.out.println("The answer is: " + (operand1 * operand2));
            case "/" -> {
                if (operand2 == 0) {
                    System.out.println("Division by 0! Failure!");
                }
                System.out.println("The answer is: " + (operand1 / operand2));
            }
            case "^" -> System.out.println("The answer is: " + Math.pow(operand1, operand2));
        }
    }

    private static double getNumber() {
        double input;
        Scanner in = new Scanner(System.in);
        try {
            input = in.nextDouble();
        } catch (InputMismatchException e) {
            System.out.print("Invalid input, please enter a number!: ");
            return getNumber();
        }
        return input;
    }

    public static String getOperator() {
        Scanner in = new Scanner(System.in);
        String operator = in.next();
        if (operator.equals("^") || operator.equals("/") || operator.equals("*") || operator.equals("-") || operator.equals("+")) {
            return operator;
        } else {
            System.out.println("Invalid Input");
            System.out.print("Please enter one of the following: [+ - / * ^] :");
            return getOperator();
        }
    }
}
