
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first operand: ");
        double operand1 = scanner.nextDouble();
        System.out.println("Enter second operand: ");
        double operand2 = scanner.nextDouble();

            Calculator calculator = new Calculator(operand1 , operand2);
                calculator.add();
                calculator.sub();
                calculator.mul();
                calculator.div();

        }
    }