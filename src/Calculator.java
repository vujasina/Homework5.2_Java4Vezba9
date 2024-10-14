public class Calculator {

    //Polja
    double operand1;
    double operand2;

    //Konstruktori
    public Calculator() {

    }

    public Calculator(double operand1, double operand2) {

        this.operand1 = operand1;
        this.operand2 = operand2;

    }

    //Metode

    public void add() {
        System.out.println(operand1 + " + " + operand2 + " = " + (operand1 + operand2));
    }

    public void sub() {
        System.out.println(operand1 + " - " + operand2 + " = " + (operand1 - operand2));
    }

    public void mul() {
        System.out.println(operand1 + " * " + operand2 + " = " + (operand1 * operand2));
    }

    public void div() {
        if (operand2 == 0) {
            System.out.println("Dividing by zero is not allowed.");
        }
            else {
                System.out.println(operand1 + " / " + operand2 + " = " + (operand1 / operand2));
            }
    }
}
