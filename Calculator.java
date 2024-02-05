public class Calculator {
    /**
     * The function "add" takes two float numbers as input and returns their sum.
     * 
     * @param num1 The first number to be added.
     * @param num2 The second number to be added.
     * @return The sum of num1 and num2.
     */
    public float add(float num1, float num2) {
        return num1 + num2;
    }

    public float subtract(float num1, float num2) {
        return num1 - num2;
    }

    public float multiply(float num1, float num2) {
        return num1 * num2;
    }

    public float divide(float num1, float num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error: Division by zero is not allowed.");
            return Float.NaN;
        }
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        float num1 = 10.5f;
        float num2 = 5.2f;

        System.out.println("Addition: " + calculator.add(num1, num2));
        System.out.println("Subtraction: " + calculator.subtract(num1, num2));
        System.out.println("Multiplication: " + calculator.multiply(num1, num2));
        System.out.println("Division: " + calculator.divide(num1, num2));
    }
}
