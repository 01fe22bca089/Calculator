public class Calculator {
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

    public float square(float num) {
        return num * num;
    }

    public float cube(float num) {
        return num * num * num;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        float num1 = 10.5f;
        float num2 = 5.2f;
        float num3 = 4.0f;

        System.out.println("Addition: " + calculator.add(num1, num2));
        System.out.println("Subtraction: " + calculator.subtract(num1, num2));
        System.out.println("Multiplication: " + calculator.multiply(num1, num2));
        System.out.println("Division: " + calculator.divide(num1, num2));
        System.out.println("Square: " + calculator.square(num3));
        System.out.println("Cube: " + calculator.cube(num3));
    }
}
