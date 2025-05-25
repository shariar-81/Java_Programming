import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter a operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        double result = 0;
        if (operator == '+') result = num1 + num2;
        else if (operator == '-') result = num1 - num2;
        else if (operator == '*') result = num1 * num2;
        else if (operator == '/' && num2 != 0) result = num1 / num2;
        else {
            System.out.println("Error: Invalid Operation");
            sc.close();
            return;
        }

        System.out.println("Result: " + result);
        sc.close();
    }
}
