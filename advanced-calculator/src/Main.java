import java.util.Scanner;

public class Main {

    static int sum(int a, int b) {
        int total = a + b;
        System.out.println("Total: " + total);
        return total;
    }

    static int ext(int a, int b) {
        int extraction = a - b;
        System.out.println("Extraction: " + extraction);
        return extraction;
    }

    static int mul(int a, int b) {
        int multiply = a * b;
        System.out.println("Multiply: " + multiply);
        return multiply;
    }

    static int div(int a, int b) {
        if (b == 0) {
            System.out.println("Second num. must be different than zero.");
            return 0;
        }
        int divide = a / b;
        System.out.print("Divide: " + divide);
        return divide;
    }

    static int exp(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        return result;
    }

    static int mod(int a, int b) {
        return a % b;
    }

    static void calc(int a, int b) {
        System.out.println("Perimeter: " + (2 * (a + b)));
        System.out.println("Area: " + (a * b));
    }

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int select;

        String menu = "1- Addition\n" +
                "2- Extraction\n" +
                "3- Multiplication\n" +
                "4- Division\n" +
                "5- Exponents\n" +
                "6- Mod\n" +
                "7- Rectangular Area and Perimeter\n" +
                "8- Exit";

        while (true) {
            System.out.println(menu);
            System.out.println("Select operation: ");
            select = scanner.nextInt();
            if (select == 8) {
                break;
            }
            System.out.println("Type number 1: ");
            int a = scanner.nextInt();
            System.out.println("Type number 2: ");
            int b = scanner.nextInt();

            switch (select) {
                case 1:
                    sum(a, b);
                    break;
                case 2:
                    ext(a, b);
                    break;
                case 3:
                    mul(a, b);
                    break;
                case 4:
                    div(a, b);
                    break;
                case 5:
                    System.out.println("Exponent: " + exp(a, b));
                    break;
                case 6:
                    System.out.println("Mod: " + mod(a, b));
                    break;
                case 7:
                    calc(a, b);
                    break;
                default:
                    System.out.println("Error...");
            }
            break;
        }
    }
}
